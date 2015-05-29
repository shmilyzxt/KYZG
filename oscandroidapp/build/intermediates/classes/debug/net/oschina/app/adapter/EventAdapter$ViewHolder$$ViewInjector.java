// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class EventAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.EventAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362263, "field 'status'");
    target.status = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362264, "field 'img'");
    target.img = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362022, "field 'title'");
    target.title = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362265, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362026, "field 'spot'");
    target.spot = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.adapter.EventAdapter.ViewHolder target) {
    target.status = null;
    target.img = null;
    target.title = null;
    target.time = null;
    target.spot = null;
  }
}
