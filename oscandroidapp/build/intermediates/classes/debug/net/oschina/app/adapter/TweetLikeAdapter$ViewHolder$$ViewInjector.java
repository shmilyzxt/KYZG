// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TweetLikeAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.TweetLikeAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362048, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362231, "field 'from'");
    target.from = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362069, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362248, "field 'action'");
    target.action = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362252, "field 'reply'");
    target.reply = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362047, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
  }

  public static void reset(net.oschina.app.adapter.TweetLikeAdapter.ViewHolder target) {
    target.name = null;
    target.from = null;
    target.time = null;
    target.action = null;
    target.reply = null;
    target.avatar = null;
  }
}
