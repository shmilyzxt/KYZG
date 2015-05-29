// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class PostAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.PostAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361957, "field 'title'");
    target.title = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362272, "field 'description'");
    target.description = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362142, "field 'author'");
    target.author = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362275, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362269, "field 'comment_count'");
    target.comment_count = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362274, "field 'face'");
    target.face = (net.oschina.app.widget.AvatarView) view;
  }

  public static void reset(net.oschina.app.adapter.PostAdapter.ViewHolder target) {
    target.title = null;
    target.description = null;
    target.author = null;
    target.time = null;
    target.comment_count = null;
    target.face = null;
  }
}
