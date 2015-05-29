// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TweetRecordFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.TweetRecordFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362236, "field 'mLayout'");
    target.mLayout = (android.widget.RelativeLayout) view;
    view = finder.findRequiredView(source, 2131362240, "field 'mBtnRecort'");
    target.mBtnRecort = (net.oschina.app.widget.RecordButton) view;
    view = finder.findRequiredView(source, 2131362239, "field 'mTvTime'");
    target.mTvTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362235, "field 'mTvInputLen'");
    target.mTvInputLen = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362234, "field 'mEtSpeech'");
    target.mEtSpeech = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131362238, "field 'mImgVolume'");
    target.mImgVolume = (android.widget.ImageView) view;
  }

  public static void reset(net.oschina.app.fragment.TweetRecordFragment target) {
    target.mLayout = null;
    target.mBtnRecort = null;
    target.mTvTime = null;
    target.mTvInputLen = null;
    target.mEtSpeech = null;
    target.mImgVolume = null;
  }
}
