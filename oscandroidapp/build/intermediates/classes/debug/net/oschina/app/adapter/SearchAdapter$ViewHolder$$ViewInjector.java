// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SearchAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.SearchAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361957, "field 'title'");
    target.title = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362272, "field 'description'");
    target.description = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362070, "field 'source'");
    target.source = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362069, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361984, "field 'comment_count'");
    target.comment_count = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362271, "field 'tip'");
    target.tip = (android.widget.ImageView) view;
  }

  public static void reset(net.oschina.app.adapter.SearchAdapter.ViewHolder target) {
    target.title = null;
    target.description = null;
    target.source = null;
    target.time = null;
    target.comment_count = null;
    target.tip = null;
  }
}
