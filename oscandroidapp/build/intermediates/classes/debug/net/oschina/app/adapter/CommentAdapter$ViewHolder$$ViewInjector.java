// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class CommentAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.CommentAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362047, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362048, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362069, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362231, "field 'from'");
    target.from = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362232, "field 'content'");
    target.content = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362256, "field 'relies'");
    target.relies = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131362255, "field 'refers'");
    target.refers = (net.oschina.app.widget.FloorView) view;
  }

  public static void reset(net.oschina.app.adapter.CommentAdapter.ViewHolder target) {
    target.avatar = null;
    target.name = null;
    target.time = null;
    target.from = null;
    target.content = null;
    target.relies = null;
    target.refers = null;
  }
}
