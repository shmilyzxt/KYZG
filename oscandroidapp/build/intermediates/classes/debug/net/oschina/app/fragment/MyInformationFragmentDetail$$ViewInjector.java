// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MyInformationFragmentDetail$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.MyInformationFragmentDetail target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362047, "field 'mUserFace'");
    target.mUserFace = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362048, "field 'mName'");
    target.mName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362212, "field 'mJoinTime'");
    target.mJoinTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362213, "field 'mFrom'");
    target.mFrom = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362214, "field 'mPlatFrom'");
    target.mPlatFrom = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362215, "field 'mFocus'");
    target.mFocus = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361901, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
  }

  public static void reset(net.oschina.app.fragment.MyInformationFragmentDetail target) {
    target.mUserFace = null;
    target.mName = null;
    target.mJoinTime = null;
    target.mFrom = null;
    target.mPlatFrom = null;
    target.mFocus = null;
    target.mErrorLayout = null;
  }
}
