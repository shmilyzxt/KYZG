// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class EventApplyAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.EventApplyAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362048, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362254, "field 'desc'");
    target.desc = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362231, "field 'from'");
    target.from = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362051, "field 'gender'");
    target.gender = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362047, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
  }

  public static void reset(net.oschina.app.adapter.EventApplyAdapter.ViewHolder target) {
    target.name = null;
    target.desc = null;
    target.from = null;
    target.gender = null;
    target.avatar = null;
  }
}
