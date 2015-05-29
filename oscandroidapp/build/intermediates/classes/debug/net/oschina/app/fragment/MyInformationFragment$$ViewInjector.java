// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MyInformationFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.MyInformationFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362047, "field 'mIvAvatar'");
    target.mIvAvatar = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362051, "field 'mIvGender'");
    target.mIvGender = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362048, "field 'mTvName'");
    target.mTvName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362053, "field 'mTvScore'");
    target.mTvScore = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362055, "field 'mTvFavorite'");
    target.mTvFavorite = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362057, "field 'mTvFollowing'");
    target.mTvFollowing = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362059, "field 'mTvFans'");
    target.mTvFans = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362043, "field 'mMesView'");
    target.mMesView = view;
    view = finder.findRequiredView(source, 2131361901, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131361942, "field 'mQrCode'");
    target.mQrCode = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362049, "field 'mUserContainer'");
    target.mUserContainer = view;
    view = finder.findRequiredView(source, 2131362060, "field 'mUserUnLogin'");
    target.mUserUnLogin = view;
    view = finder.findRequiredView(source, 2131362041, "field 'rootView'");
    target.rootView = (android.widget.LinearLayout) view;
  }

  public static void reset(net.oschina.app.fragment.MyInformationFragment target) {
    target.mIvAvatar = null;
    target.mIvGender = null;
    target.mTvName = null;
    target.mTvScore = null;
    target.mTvFavorite = null;
    target.mTvFollowing = null;
    target.mTvFans = null;
    target.mMesView = null;
    target.mErrorLayout = null;
    target.mQrCode = null;
    target.mUserContainer = null;
    target.mUserUnLogin = null;
    target.rootView = null;
  }
}
