// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ShakeFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.ShakeFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362102, "field 'mImgShake'");
    target.mImgShake = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131361996, "field 'mProgress'");
    target.mProgress = (android.widget.ProgressBar) view;
    view = finder.findRequiredView(source, 2131362103, "field 'mLayoutBottom'");
    target.mLayoutBottom = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131361978, "field 'mImgHead'");
    target.mImgHead = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131361979, "field 'mTvTitle'");
    target.mTvTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361980, "field 'mTvDetail'");
    target.mTvDetail = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361981, "field 'mTvAuthor'");
    target.mTvAuthor = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361982, "field 'mTvCommentCount'");
    target.mTvCommentCount = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361983, "field 'mTvDate'");
    target.mTvDate = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.fragment.ShakeFragment target) {
    target.mImgShake = null;
    target.mProgress = null;
    target.mLayoutBottom = null;
    target.mImgHead = null;
    target.mTvTitle = null;
    target.mTvDetail = null;
    target.mTvAuthor = null;
    target.mTvCommentCount = null;
    target.mTvDate = null;
  }
}
