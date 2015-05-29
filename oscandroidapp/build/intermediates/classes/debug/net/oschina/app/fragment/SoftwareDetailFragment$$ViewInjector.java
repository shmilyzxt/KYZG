// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SoftwareDetailFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.SoftwareDetailFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362109, "field 'mTvLicense'");
    target.mTvLicense = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362110, "field 'mTvLanguage'");
    target.mTvLanguage = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362111, "field 'mTvOs'");
    target.mTvOs = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362112, "field 'mTvRecordTime'");
    target.mTvRecordTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362105, "field 'mIvRecommended'");
    target.mIvRecommended = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131361957, "field 'mTvTitle'");
    target.mTvTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362107, "field 'mTvAuthor'");
    target.mTvAuthor = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362106, "field 'llAuthor'");
    target.llAuthor = view;
    view = finder.findRequiredView(source, 2131362108, "field 'lineAuthor'");
    target.lineAuthor = view;
    view = finder.findRequiredView(source, 2131361995, "field 'mWebView'");
    target.mWebView = (android.webkit.WebView) view;
    view = finder.findRequiredView(source, 2131362104, "field 'mIvLogo'");
    target.mIvLogo = (android.widget.ImageView) view;
  }

  public static void reset(net.oschina.app.fragment.SoftwareDetailFragment target) {
    target.mTvLicense = null;
    target.mTvLanguage = null;
    target.mTvOs = null;
    target.mTvRecordTime = null;
    target.mIvRecommended = null;
    target.mTvTitle = null;
    target.mTvAuthor = null;
    target.llAuthor = null;
    target.lineAuthor = null;
    target.mWebView = null;
    target.mIvLogo = null;
  }
}
