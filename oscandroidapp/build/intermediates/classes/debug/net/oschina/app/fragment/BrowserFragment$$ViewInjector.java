// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class BrowserFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.BrowserFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361995, "field 'mWebView'");
    target.mWebView = (android.webkit.WebView) view;
    view = finder.findRequiredView(source, 2131361998, "field 'mImgBack'");
    target.mImgBack = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131361999, "field 'mImgForward'");
    target.mImgForward = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362000, "field 'mImgRefresh'");
    target.mImgRefresh = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362001, "field 'mImgSystemBrowser'");
    target.mImgSystemBrowser = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131361997, "field 'mLayoutBottom'");
    target.mLayoutBottom = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131361996, "field 'mProgress'");
    target.mProgress = (android.widget.ProgressBar) view;
  }

  public static void reset(net.oschina.app.fragment.BrowserFragment target) {
    target.mWebView = null;
    target.mImgBack = null;
    target.mImgForward = null;
    target.mImgRefresh = null;
    target.mImgSystemBrowser = null;
    target.mLayoutBottom = null;
    target.mProgress = null;
  }
}
