// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SettingsFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.SettingsFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362084, "field 'mTbLoadImg'");
    target.mTbLoadImg = (net.oschina.app.widget.togglebutton.ToggleButton) view;
    view = finder.findRequiredView(source, 2131362087, "field 'mTvCacheSize'");
    target.mTvCacheSize = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362094, "field 'mTvExit'");
    target.mTvExit = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362089, "field 'mTbDoubleClickExit'");
    target.mTbDoubleClickExit = (net.oschina.app.widget.togglebutton.ToggleButton) view;
  }

  public static void reset(net.oschina.app.fragment.SettingsFragment target) {
    target.mTbLoadImg = null;
    target.mTvCacheSize = null;
    target.mTvExit = null;
    target.mTbDoubleClickExit = null;
  }
}
