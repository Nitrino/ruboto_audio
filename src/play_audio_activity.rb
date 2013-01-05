#encoding: utf-8


require 'ruboto/widget'
require 'ruboto/util/toast'


ruboto_import_widgets :Button, :LinearLayout, :TextView, :AnalogClock


java_import "android.media.MediaPlayer"
java_import "android.media.AudioManager"
java_import "android.net.Uri"  
java_import "android.content.Intent"
java_import "android.app.TimePickerDialog"
java_import "android.app.DatePickerDialog"

ruboto_import "#{$package_name}.RubotoOnDateSetListener"
ruboto_import "#{$package_name}.RubotoOnTimeSetListener"

# http://xkcd.com/378/

class PlayAudioActivity
  def on_create(bundle)
    super
    set_title 'Domo arigato, Mr Ruboto!'
    java_file = java.io.File.new("/mnt/sdcard/naive.mp3")
    uri = Uri.fromFile(java_file)
    @player = MediaPlayer.create(self, uri);

    self.content_view =
        linear_layout :orientation => :vertical do
          @text_view = text_view :text => 'Никогда не пользуйтесь этим, пожалуйста :(', :id => 42, :width => :match_parent,
                                 :gravity => :center, :text_size => 48.0
          button :text => 'Play', :width => :match_parent, :id => 43, :on_click_listener => proc { play }
          button :text => 'Pause', :width => :match_parent, :id => 44, :on_click_listener => proc { pause }
          button :text => 'Второй эран', :width => :match_parent, :id => 45, :on_click_listener => proc { twoActivity }
          button :text => 'Третий эран', :width => :match_parent, :id => 46, :on_click_listener => proc { threeActivity }

        end
  rescue
    puts "Exception creating activity: #{$!}"
    puts $!.backtrace.join("\n")
  end

  private

  def play
    @player.start
   # @text_view.text = 'What hath Matz wrought!'
    #toast 'Flipped a bit via butterfly'
  end

  def pause
    @player.pause
  end
  def twoActivity
    start_ruboto_activity("$activity_two") do
        def on_create(bundle)
          super
          setTitle 'twoActivity'
          
            self.content_view = linear_layout(:orientation => :vertical) do
              @text_view = text_view :text => "нажмите на любом месте"
            end
        end
        def on_touch_event(event)
            index = event.find_pointer_index(0)
             x = event.getX(index)
            y = event.getY(index)
            toast "Position: #{x}, #{y}"
          true
        end

    end
  end
  def threeActivity
        start_ruboto_activity("$activity_three") do
        def on_create(bundle)
          super
          setTitle 'threeActivity'
          
            self.content_view = linear_layout(:orientation => :vertical) do
              button :text => 'Звонилка', :width => :match_parent, :id => 43, :on_click_listener => proc { phone }
              button :text => 'Браузер', :width => :match_parent, :id => 43, :on_click_listener => proc { brouser }
            end
        end

        def phone
          intent = Intent.new(Intent::ACTION_CALL)
          intent.setData(Uri.parse("tel:5551234"))
          startActivity(intent)
        end

        def brouser
          intent = Intent.new(Intent::ACTION_VIEW)
          intent.setData(Uri.parse("http://ruboto.org/"))
          startActivity(intent)
        end

        def on_create_options_menu(menu)
          m1 = menu.add('Action 1')
          m1.set_on_menu_item_click_listener do |menu_item|
            @text_view.text = menu_item_title
            toast menu_item.title
            true # Prevent other listeners from executing.
          end

          m2 = menu.add('Action 2')
          m2.set_on_menu_item_click_listener do |menu_item|
            @text_view.text = menu_item.title
            toast menu_item.title
            true # Prevent other listeners from executing.
          end
          true # Display the menu.
        end

    end
  end

end
