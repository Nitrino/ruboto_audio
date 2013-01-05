// Generated Ruboto subclass with method base "on"

package org.ruboto.examples.play_audio;

import org.ruboto.JRubyAdapter;
import org.ruboto.Log;
import org.ruboto.Script;
import org.ruboto.ScriptInfo;
import org.ruboto.ScriptLoader;

public class GraphicsView extends android.view.View implements org.ruboto.RubotoComponent {
    private final ScriptInfo scriptInfo = new ScriptInfo();
    {
		scriptInfo.setRubyClassName(getClass().getSimpleName());
		ScriptLoader.loadScript(this);
    }

  public GraphicsView(android.content.Context context) {
    super(context);
  }

  public GraphicsView(android.content.Context context, android.util.AttributeSet attrs) {
    super(context, attrs);
  }

  public GraphicsView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

    public ScriptInfo getScriptInfo() {
        return scriptInfo;
    }

  public void onAnimationEnd() {
    if (ScriptLoader.isCalledFromJRuby()) {super.onAnimationEnd(); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onAnimationEnd");
      {super.onAnimationEnd(); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onAnimationEnd(); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_animation_end}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_animation_end()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_animation_end");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onAnimationEnd}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onAnimationEnd()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onAnimationEnd");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onAnimationEnd(); return;}
      }
    }
  }

  public void onAnimationStart() {
    if (ScriptLoader.isCalledFromJRuby()) {super.onAnimationStart(); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onAnimationStart");
      {super.onAnimationStart(); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onAnimationStart(); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_animation_start}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_animation_start()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_animation_start");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onAnimationStart}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onAnimationStart()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onAnimationStart");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onAnimationStart(); return;}
      }
    }
  }

  public void onAttachedToWindow() {
    if (ScriptLoader.isCalledFromJRuby()) {super.onAttachedToWindow(); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onAttachedToWindow");
      {super.onAttachedToWindow(); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onAttachedToWindow(); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_attached_to_window}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_attached_to_window()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_attached_to_window");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onAttachedToWindow}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onAttachedToWindow()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onAttachedToWindow");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onAttachedToWindow(); return;}
      }
    }
  }

  public void onCreateContextMenu(android.view.ContextMenu menu) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onCreateContextMenu(menu); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onCreateContextMenu");
      {super.onCreateContextMenu(menu); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onCreateContextMenu(menu); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_create_context_menu}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_menu", menu);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_create_context_menu($arg_menu)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_create_context_menu", menu);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onCreateContextMenu}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_menu", menu);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onCreateContextMenu($arg_menu)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onCreateContextMenu", menu);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onCreateContextMenu(menu); return;}
      }
    }
  }

  public int[] onCreateDrawableState(int extraSpace) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onCreateDrawableState(extraSpace);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onCreateDrawableState");
      return super.onCreateDrawableState(extraSpace);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onCreateDrawableState(extraSpace);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_create_drawable_state}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_extraSpace", extraSpace);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (int[]) JRubyAdapter.runScriptlet("$ruby_instance.on_create_drawable_state($arg_extraSpace)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (int[]) JRubyAdapter.runRubyMethod(int[].class, scriptInfo.getRubyInstance(), "on_create_drawable_state", extraSpace);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onCreateDrawableState}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_extraSpace", extraSpace);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (int[]) JRubyAdapter.runScriptlet("$ruby_instance.onCreateDrawableState($arg_extraSpace)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (int[]) JRubyAdapter.runRubyMethod(int[].class, scriptInfo.getRubyInstance(), "onCreateDrawableState", extraSpace);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onCreateDrawableState(extraSpace);
      }
    }
  }

  public void onDetachedFromWindow() {
    if (ScriptLoader.isCalledFromJRuby()) {super.onDetachedFromWindow(); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onDetachedFromWindow");
      {super.onDetachedFromWindow(); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onDetachedFromWindow(); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_detached_from_window}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_detached_from_window()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_detached_from_window");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onDetachedFromWindow}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onDetachedFromWindow()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onDetachedFromWindow");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onDetachedFromWindow(); return;}
      }
    }
  }

  public void onDraw(android.graphics.Canvas canvas) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onDraw(canvas); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onDraw");
      {super.onDraw(canvas); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onDraw(canvas); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_draw}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_canvas", canvas);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_draw($arg_canvas)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_draw", canvas);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onDraw}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_canvas", canvas);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onDraw($arg_canvas)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onDraw", canvas);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onDraw(canvas); return;}
      }
    }
  }

  public void onFinishInflate() {
    if (ScriptLoader.isCalledFromJRuby()) {super.onFinishInflate(); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onFinishInflate");
      {super.onFinishInflate(); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onFinishInflate(); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_finish_inflate}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_finish_inflate()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_finish_inflate");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onFinishInflate}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onFinishInflate()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onFinishInflate");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onFinishInflate(); return;}
      }
    }
  }

  public void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onFocusChanged(gainFocus, direction, previouslyFocusedRect); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onFocusChanged");
      {super.onFocusChanged(gainFocus, direction, previouslyFocusedRect); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onFocusChanged(gainFocus, direction, previouslyFocusedRect); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_focus_changed}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_gainFocus", gainFocus);
        JRubyAdapter.put("$arg_direction", direction);
        JRubyAdapter.put("$arg_previouslyFocusedRect", previouslyFocusedRect);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_focus_changed($arg_gainFocus, $arg_direction, $arg_previouslyFocusedRect)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_focus_changed", new Object[]{gainFocus, direction, previouslyFocusedRect});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onFocusChanged}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_gainFocus", gainFocus);
          JRubyAdapter.put("$arg_direction", direction);
          JRubyAdapter.put("$arg_previouslyFocusedRect", previouslyFocusedRect);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onFocusChanged($arg_gainFocus, $arg_direction, $arg_previouslyFocusedRect)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onFocusChanged", new Object[]{gainFocus, direction, previouslyFocusedRect});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onFocusChanged(gainFocus, direction, previouslyFocusedRect); return;}
      }
    }
  }

  public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onKeyDown(keyCode, event);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onKeyDown");
      return super.onKeyDown(keyCode, event);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onKeyDown(keyCode, event);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_key_down}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_keyCode", keyCode);
        JRubyAdapter.put("$arg_event", event);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.on_key_down($arg_keyCode, $arg_event)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "on_key_down", new Object[]{keyCode, event});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onKeyDown}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_keyCode", keyCode);
          JRubyAdapter.put("$arg_event", event);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.onKeyDown($arg_keyCode, $arg_event)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "onKeyDown", new Object[]{keyCode, event});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onKeyDown(keyCode, event);
      }
    }
  }

  public boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onKeyMultiple(keyCode, repeatCount, event);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onKeyMultiple");
      return super.onKeyMultiple(keyCode, repeatCount, event);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onKeyMultiple(keyCode, repeatCount, event);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_key_multiple}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_keyCode", keyCode);
        JRubyAdapter.put("$arg_repeatCount", repeatCount);
        JRubyAdapter.put("$arg_event", event);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.on_key_multiple($arg_keyCode, $arg_repeatCount, $arg_event)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "on_key_multiple", new Object[]{keyCode, repeatCount, event});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onKeyMultiple}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_keyCode", keyCode);
          JRubyAdapter.put("$arg_repeatCount", repeatCount);
          JRubyAdapter.put("$arg_event", event);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.onKeyMultiple($arg_keyCode, $arg_repeatCount, $arg_event)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "onKeyMultiple", new Object[]{keyCode, repeatCount, event});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onKeyMultiple(keyCode, repeatCount, event);
      }
    }
  }

  public boolean onKeyShortcut(int keyCode, android.view.KeyEvent event) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onKeyShortcut(keyCode, event);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onKeyShortcut");
      return super.onKeyShortcut(keyCode, event);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onKeyShortcut(keyCode, event);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_key_shortcut}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_keyCode", keyCode);
        JRubyAdapter.put("$arg_event", event);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.on_key_shortcut($arg_keyCode, $arg_event)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "on_key_shortcut", new Object[]{keyCode, event});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onKeyShortcut}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_keyCode", keyCode);
          JRubyAdapter.put("$arg_event", event);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.onKeyShortcut($arg_keyCode, $arg_event)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "onKeyShortcut", new Object[]{keyCode, event});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onKeyShortcut(keyCode, event);
      }
    }
  }

  public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onKeyUp(keyCode, event);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onKeyUp");
      return super.onKeyUp(keyCode, event);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onKeyUp(keyCode, event);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_key_up}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_keyCode", keyCode);
        JRubyAdapter.put("$arg_event", event);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.on_key_up($arg_keyCode, $arg_event)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "on_key_up", new Object[]{keyCode, event});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onKeyUp}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_keyCode", keyCode);
          JRubyAdapter.put("$arg_event", event);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.onKeyUp($arg_keyCode, $arg_event)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "onKeyUp", new Object[]{keyCode, event});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onKeyUp(keyCode, event);
      }
    }
  }

  public void onLayout(boolean changed, int left, int top, int right, int bottom) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onLayout(changed, left, top, right, bottom); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onLayout");
      {super.onLayout(changed, left, top, right, bottom); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onLayout(changed, left, top, right, bottom); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_layout}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_changed", changed);
        JRubyAdapter.put("$arg_left", left);
        JRubyAdapter.put("$arg_top", top);
        JRubyAdapter.put("$arg_right", right);
        JRubyAdapter.put("$arg_bottom", bottom);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_layout($arg_changed, $arg_left, $arg_top, $arg_right, $arg_bottom)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_layout", new Object[]{changed, left, top, right, bottom});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onLayout}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_changed", changed);
          JRubyAdapter.put("$arg_left", left);
          JRubyAdapter.put("$arg_top", top);
          JRubyAdapter.put("$arg_right", right);
          JRubyAdapter.put("$arg_bottom", bottom);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onLayout($arg_changed, $arg_left, $arg_top, $arg_right, $arg_bottom)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onLayout", new Object[]{changed, left, top, right, bottom});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onLayout(changed, left, top, right, bottom); return;}
      }
    }
  }

  public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onMeasure(widthMeasureSpec, heightMeasureSpec); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onMeasure");
      {super.onMeasure(widthMeasureSpec, heightMeasureSpec); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onMeasure(widthMeasureSpec, heightMeasureSpec); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_measure}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_widthMeasureSpec", widthMeasureSpec);
        JRubyAdapter.put("$arg_heightMeasureSpec", heightMeasureSpec);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_measure($arg_widthMeasureSpec, $arg_heightMeasureSpec)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_measure", new Object[]{widthMeasureSpec, heightMeasureSpec});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onMeasure}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_widthMeasureSpec", widthMeasureSpec);
          JRubyAdapter.put("$arg_heightMeasureSpec", heightMeasureSpec);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onMeasure($arg_widthMeasureSpec, $arg_heightMeasureSpec)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onMeasure", new Object[]{widthMeasureSpec, heightMeasureSpec});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onMeasure(widthMeasureSpec, heightMeasureSpec); return;}
      }
    }
  }

  public void onRestoreInstanceState(android.os.Parcelable state) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onRestoreInstanceState(state); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onRestoreInstanceState");
      {super.onRestoreInstanceState(state); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onRestoreInstanceState(state); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_restore_instance_state}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_state", state);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_restore_instance_state($arg_state)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_restore_instance_state", state);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onRestoreInstanceState}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_state", state);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onRestoreInstanceState($arg_state)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onRestoreInstanceState", state);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onRestoreInstanceState(state); return;}
      }
    }
  }

  public android.os.Parcelable onSaveInstanceState() {
    if (ScriptLoader.isCalledFromJRuby()) return super.onSaveInstanceState();
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onSaveInstanceState");
      return super.onSaveInstanceState();
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onSaveInstanceState();
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_save_instance_state}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (android.os.Parcelable) JRubyAdapter.runScriptlet("$ruby_instance.on_save_instance_state()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (android.os.Parcelable) JRubyAdapter.runRubyMethod(android.os.Parcelable.class, scriptInfo.getRubyInstance(), "on_save_instance_state");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onSaveInstanceState}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (android.os.Parcelable) JRubyAdapter.runScriptlet("$ruby_instance.onSaveInstanceState()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (android.os.Parcelable) JRubyAdapter.runRubyMethod(android.os.Parcelable.class, scriptInfo.getRubyInstance(), "onSaveInstanceState");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onSaveInstanceState();
      }
    }
  }

  public void onScrollChanged(int l, int t, int oldl, int oldt) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onScrollChanged(l, t, oldl, oldt); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onScrollChanged");
      {super.onScrollChanged(l, t, oldl, oldt); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onScrollChanged(l, t, oldl, oldt); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_scroll_changed}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_l", l);
        JRubyAdapter.put("$arg_t", t);
        JRubyAdapter.put("$arg_oldl", oldl);
        JRubyAdapter.put("$arg_oldt", oldt);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_scroll_changed($arg_l, $arg_t, $arg_oldl, $arg_oldt)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_scroll_changed", new Object[]{l, t, oldl, oldt});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onScrollChanged}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_l", l);
          JRubyAdapter.put("$arg_t", t);
          JRubyAdapter.put("$arg_oldl", oldl);
          JRubyAdapter.put("$arg_oldt", oldt);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onScrollChanged($arg_l, $arg_t, $arg_oldl, $arg_oldt)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onScrollChanged", new Object[]{l, t, oldl, oldt});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onScrollChanged(l, t, oldl, oldt); return;}
      }
    }
  }

  public boolean onSetAlpha(int alpha) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onSetAlpha(alpha);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onSetAlpha");
      return super.onSetAlpha(alpha);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onSetAlpha(alpha);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_set_alpha}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_alpha", alpha);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.on_set_alpha($arg_alpha)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "on_set_alpha", alpha);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onSetAlpha}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_alpha", alpha);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.onSetAlpha($arg_alpha)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "onSetAlpha", alpha);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onSetAlpha(alpha);
      }
    }
  }

  public void onSizeChanged(int w, int h, int oldw, int oldh) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onSizeChanged(w, h, oldw, oldh); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onSizeChanged");
      {super.onSizeChanged(w, h, oldw, oldh); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onSizeChanged(w, h, oldw, oldh); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_size_changed}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_w", w);
        JRubyAdapter.put("$arg_h", h);
        JRubyAdapter.put("$arg_oldw", oldw);
        JRubyAdapter.put("$arg_oldh", oldh);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_size_changed($arg_w, $arg_h, $arg_oldw, $arg_oldh)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_size_changed", new Object[]{w, h, oldw, oldh});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onSizeChanged}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_w", w);
          JRubyAdapter.put("$arg_h", h);
          JRubyAdapter.put("$arg_oldw", oldw);
          JRubyAdapter.put("$arg_oldh", oldh);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onSizeChanged($arg_w, $arg_h, $arg_oldw, $arg_oldh)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onSizeChanged", new Object[]{w, h, oldw, oldh});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onSizeChanged(w, h, oldw, oldh); return;}
      }
    }
  }

  public boolean onTouchEvent(android.view.MotionEvent event) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onTouchEvent(event);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onTouchEvent");
      return super.onTouchEvent(event);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onTouchEvent(event);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_touch_event}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_event", event);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.on_touch_event($arg_event)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "on_touch_event", event);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onTouchEvent}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_event", event);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.onTouchEvent($arg_event)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "onTouchEvent", event);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onTouchEvent(event);
      }
    }
  }

  public boolean onTrackballEvent(android.view.MotionEvent event) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onTrackballEvent(event);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onTrackballEvent");
      return super.onTrackballEvent(event);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onTrackballEvent(event);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_trackball_event}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_event", event);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.on_trackball_event($arg_event)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "on_trackball_event", event);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onTrackballEvent}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_event", event);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.onTrackballEvent($arg_event)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "onTrackballEvent", event);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onTrackballEvent(event);
      }
    }
  }

  public void onWindowFocusChanged(boolean hasWindowFocus) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onWindowFocusChanged(hasWindowFocus); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onWindowFocusChanged");
      {super.onWindowFocusChanged(hasWindowFocus); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onWindowFocusChanged(hasWindowFocus); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_window_focus_changed}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_hasWindowFocus", hasWindowFocus);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_window_focus_changed($arg_hasWindowFocus)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_window_focus_changed", hasWindowFocus);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onWindowFocusChanged}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_hasWindowFocus", hasWindowFocus);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onWindowFocusChanged($arg_hasWindowFocus)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onWindowFocusChanged", hasWindowFocus);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onWindowFocusChanged(hasWindowFocus); return;}
      }
    }
  }

  public void onWindowVisibilityChanged(int visibility) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onWindowVisibilityChanged(visibility); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onWindowVisibilityChanged");
      {super.onWindowVisibilityChanged(visibility); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onWindowVisibilityChanged(visibility); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_window_visibility_changed}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_visibility", visibility);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_window_visibility_changed($arg_visibility)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_window_visibility_changed", visibility);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onWindowVisibilityChanged}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_visibility", visibility);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onWindowVisibilityChanged($arg_visibility)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onWindowVisibilityChanged", visibility);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onWindowVisibilityChanged(visibility); return;}
      }
    }
  }

  public boolean onCheckIsTextEditor() {
    if (ScriptLoader.isCalledFromJRuby()) return super.onCheckIsTextEditor();
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onCheckIsTextEditor");
      return super.onCheckIsTextEditor();
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onCheckIsTextEditor();
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_check_is_text_editor}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.on_check_is_text_editor()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "on_check_is_text_editor");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onCheckIsTextEditor}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.onCheckIsTextEditor()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "onCheckIsTextEditor");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onCheckIsTextEditor();
      }
    }
  }

  public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onCreateInputConnection(outAttrs);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onCreateInputConnection");
      return super.onCreateInputConnection(outAttrs);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onCreateInputConnection(outAttrs);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_create_input_connection}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_outAttrs", outAttrs);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (android.view.inputmethod.InputConnection) JRubyAdapter.runScriptlet("$ruby_instance.on_create_input_connection($arg_outAttrs)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (android.view.inputmethod.InputConnection) JRubyAdapter.runRubyMethod(android.view.inputmethod.InputConnection.class, scriptInfo.getRubyInstance(), "on_create_input_connection", outAttrs);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onCreateInputConnection}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_outAttrs", outAttrs);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (android.view.inputmethod.InputConnection) JRubyAdapter.runScriptlet("$ruby_instance.onCreateInputConnection($arg_outAttrs)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (android.view.inputmethod.InputConnection) JRubyAdapter.runRubyMethod(android.view.inputmethod.InputConnection.class, scriptInfo.getRubyInstance(), "onCreateInputConnection", outAttrs);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onCreateInputConnection(outAttrs);
      }
    }
  }

  public void onFinishTemporaryDetach() {
    if (ScriptLoader.isCalledFromJRuby()) {super.onFinishTemporaryDetach(); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onFinishTemporaryDetach");
      {super.onFinishTemporaryDetach(); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onFinishTemporaryDetach(); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_finish_temporary_detach}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_finish_temporary_detach()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_finish_temporary_detach");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onFinishTemporaryDetach}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onFinishTemporaryDetach()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onFinishTemporaryDetach");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onFinishTemporaryDetach(); return;}
      }
    }
  }

  public boolean onKeyPreIme(int keyCode, android.view.KeyEvent event) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onKeyPreIme(keyCode, event);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onKeyPreIme");
      return super.onKeyPreIme(keyCode, event);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onKeyPreIme(keyCode, event);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_key_pre_ime}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_keyCode", keyCode);
        JRubyAdapter.put("$arg_event", event);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.on_key_pre_ime($arg_keyCode, $arg_event)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "on_key_pre_ime", new Object[]{keyCode, event});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onKeyPreIme}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_keyCode", keyCode);
          JRubyAdapter.put("$arg_event", event);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.onKeyPreIme($arg_keyCode, $arg_event)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "onKeyPreIme", new Object[]{keyCode, event});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onKeyPreIme(keyCode, event);
      }
    }
  }

  public void onStartTemporaryDetach() {
    if (ScriptLoader.isCalledFromJRuby()) {super.onStartTemporaryDetach(); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onStartTemporaryDetach");
      {super.onStartTemporaryDetach(); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onStartTemporaryDetach(); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_start_temporary_detach}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_start_temporary_detach()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_start_temporary_detach");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onStartTemporaryDetach}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onStartTemporaryDetach()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onStartTemporaryDetach");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onStartTemporaryDetach(); return;}
      }
    }
  }

  public boolean onKeyLongPress(int keyCode, android.view.KeyEvent event) {
    if (ScriptLoader.isCalledFromJRuby()) return super.onKeyLongPress(keyCode, event);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onKeyLongPress");
      return super.onKeyLongPress(keyCode, event);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.onKeyLongPress(keyCode, event);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_key_long_press}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_keyCode", keyCode);
        JRubyAdapter.put("$arg_event", event);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.on_key_long_press($arg_keyCode, $arg_event)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "on_key_long_press", new Object[]{keyCode, event});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onKeyLongPress}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_keyCode", keyCode);
          JRubyAdapter.put("$arg_event", event);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.onKeyLongPress($arg_keyCode, $arg_event)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "onKeyLongPress", new Object[]{keyCode, event});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.onKeyLongPress(keyCode, event);
      }
    }
  }

  public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onConfigurationChanged(newConfig); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onConfigurationChanged");
      {super.onConfigurationChanged(newConfig); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onConfigurationChanged(newConfig); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_configuration_changed}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_newConfig", newConfig);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_configuration_changed($arg_newConfig)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_configuration_changed", newConfig);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onConfigurationChanged}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_newConfig", newConfig);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onConfigurationChanged($arg_newConfig)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onConfigurationChanged", newConfig);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onConfigurationChanged(newConfig); return;}
      }
    }
  }

  public void onDisplayHint(int hint) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onDisplayHint(hint); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onDisplayHint");
      {super.onDisplayHint(hint); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onDisplayHint(hint); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_display_hint}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_hint", hint);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_display_hint($arg_hint)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_display_hint", hint);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onDisplayHint}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_hint", hint);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onDisplayHint($arg_hint)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onDisplayHint", hint);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onDisplayHint(hint); return;}
      }
    }
  }

  public void onVisibilityChanged(android.view.View changedView, int visibility) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onVisibilityChanged(changedView, visibility); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: GraphicsView#onVisibilityChanged");
      {super.onVisibilityChanged(changedView, visibility); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onVisibilityChanged(changedView, visibility); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_visibility_changed}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_changedView", changedView);
        JRubyAdapter.put("$arg_visibility", visibility);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_visibility_changed($arg_changedView, $arg_visibility)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_visibility_changed", new Object[]{changedView, visibility});
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onVisibilityChanged}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_changedView", changedView);
          JRubyAdapter.put("$arg_visibility", visibility);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onVisibilityChanged($arg_changedView, $arg_visibility)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onVisibilityChanged", new Object[]{changedView, visibility});
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onVisibilityChanged(changedView, visibility); return;}
      }
    }
  }

}
