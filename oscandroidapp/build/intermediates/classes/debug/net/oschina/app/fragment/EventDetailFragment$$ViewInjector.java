// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class EventDetailFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.EventDetailFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362022, "field 'mTvTitle'");
    target.mTvTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362023, "field 'mTvStartTime'");
    target.mTvStartTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362024, "field 'mTvEndTime'");
    target.mTvEndTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362026, "field 'mTvSpot'");
    target.mTvSpot = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361995, "field 'mWebView'");
    target.mWebView = (android.webkit.WebView) view;
    view = finder.findRequiredView(source, 2131362025, "field 'mLocation'");
    target.mLocation = view;
    view = finder.findRequiredView(source, 2131362027, "field 'mBtAttend'");
    target.mBtAttend = (android.widget.Button) view;
    view = finder.findRequiredView(source, 2131362028, "field 'mBtEventApply'");
    target.mBtEventApply = (android.widget.Button) view;
    view = finder.findRequiredView(source, 2131362029, "field 'mEventTip'");
    target.mEventTip = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.fragment.EventDetailFragment target) {
    target.mTvTitle = null;
    target.mTvStartTime = null;
    target.mTvEndTime = null;
    target.mTvSpot = null;
    target.mWebView = null;
    target.mLocation = null;
    target.mBtAttend = null;
    target.mBtEventApply = null;
    target.mEventTip = null;
  }
}
