// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamNewActiveActivity$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.ui.TeamNewActiveActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361899, "field 'mIbEmoji' and method 'onClick'");
    target.mIbEmoji = (android.widget.ImageButton) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361896, "field 'mIbPicture' and method 'onClick'");
    target.mIbPicture = (android.widget.ImageButton) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361897, "field 'mIbMention' and method 'onClick'");
    target.mIbMention = (android.widget.ImageButton) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361898, "field 'mIbTrendSoftware' and method 'onClick'");
    target.mIbTrendSoftware = (android.widget.ImageButton) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361895, "field 'mTvClear' and method 'onClick'");
    target.mTvClear = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361892, "field 'mLyImage'");
    target.mLyImage = view;
    view = finder.findRequiredView(source, 2131361893, "field 'mIvImage'");
    target.mIvImage = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131361890, "field 'mEtInput'");
    target.mEtInput = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131361894, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  public static void reset(net.oschina.app.team.ui.TeamNewActiveActivity target) {
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
