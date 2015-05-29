// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TweetPubFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.TweetPubFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361899, "field 'mIbEmoji'");
    target.mIbEmoji = (android.widget.ImageButton) view;
    view = finder.findRequiredView(source, 2131361896, "field 'mIbPicture'");
    target.mIbPicture = (android.widget.ImageButton) view;
    view = finder.findRequiredView(source, 2131361897, "field 'mIbMention'");
    target.mIbMention = (android.widget.ImageButton) view;
    view = finder.findRequiredView(source, 2131361898, "field 'mIbTrendSoftware'");
    target.mIbTrendSoftware = (android.widget.ImageButton) view;
    view = finder.findRequiredView(source, 2131361895, "field 'mTvClear'");
    target.mTvClear = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361892, "field 'mLyImage'");
    target.mLyImage = view;
    view = finder.findRequiredView(source, 2131361893, "field 'mIvImage'");
    target.mIvImage = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131361890, "field 'mEtInput'");
    target.mEtInput = (android.widget.EditText) view;
  }

  public static void reset(net.oschina.app.fragment.TweetPubFragment target) {
    target.mIbEmoji = null;
    target.mIbPicture = null;
    target.mIbMention = null;
    target.mIbTrendSoftware = null;
    target.mTvClear = null;
    target.mLyImage = null;
    target.mIvImage = null;
    target.mEtInput = null;
  }
}
