// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ActiveAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.ActiveAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362048, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362231, "field 'from'");
    target.from = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362069, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362248, "field 'action'");
    target.action = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362249, "field 'actionName'");
    target.actionName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361984, "field 'commentCount'");
    target.commentCount = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362250, "field 'body'");
    target.body = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362252, "field 'reply'");
    target.reply = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362233, "field 'pic'");
    target.pic = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362251, "field 'lyReply'");
    target.lyReply = view;
    view = finder.findRequiredView(source, 2131362047, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
  }

  public static void reset(net.oschina.app.adapter.ActiveAdapter.ViewHolder target) {
    target.name = null;
    target.from = null;
    target.time = null;
    target.action = null;
    target.actionName = null;
    target.commentCount = null;
    target.body = null;
    target.reply = null;
    target.pic = null;
    target.lyReply = null;
    target.avatar = null;
  }
}
