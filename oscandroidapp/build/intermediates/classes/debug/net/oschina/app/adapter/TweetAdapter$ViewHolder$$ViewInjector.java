// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TweetAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.TweetAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362303, "field 'author'");
    target.author = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362307, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362304, "field 'content'");
    target.content = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362310, "field 'commentcount'");
    target.commentcount = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362308, "field 'platform'");
    target.platform = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362302, "field 'face'");
    target.face = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362305, "field 'image'");
    target.image = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362312, "field 'likeState'");
    target.likeState = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362313, "field 'del'");
    target.del = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362314, "field 'likeUsers'");
    target.likeUsers = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362311, "field 'likeOption'");
    target.likeOption = view;
  }

  public static void reset(net.oschina.app.adapter.TweetAdapter.ViewHolder target) {
    target.author = null;
    target.time = null;
    target.content = null;
    target.commentcount = null;
    target.platform = null;
    target.face = null;
    target.image = null;
    target.likeState = null;
    target.del = null;
    target.likeUsers = null;
    target.likeOption = null;
  }
}
