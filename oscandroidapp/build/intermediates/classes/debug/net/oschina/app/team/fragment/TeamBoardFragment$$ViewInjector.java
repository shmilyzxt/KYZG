// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamBoardFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.fragment.TeamBoardFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362118, "field 'mRlWaitDo'");
    target.mRlWaitDo = view;
    view = finder.findRequiredView(source, 2131362120, "field 'mRlWill'");
    target.mRlWill = view;
    view = finder.findRequiredView(source, 2131362122, "field 'mRlIng'");
    target.mRlIng = view;
    view = finder.findRequiredView(source, 2131362124, "field 'mRlAll'");
    target.mRlAll = view;
    view = finder.findRequiredView(source, 2131362119, "field 'mTvWaitDo'");
    target.mTvWaitDo = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362121, "field 'mTvOutdate'");
    target.mTvOutdate = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362123, "field 'mTvIng'");
    target.mTvIng = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362125, "field 'mTvAll'");
    target.mTvAll = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362047, "field 'mIvAvatarView'");
    target.mIvAvatarView = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362116, "field 'mTvName'");
    target.mTvName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362117, "field 'mTvDate'");
    target.mTvDate = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362126, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131362128, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131362130, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131362132, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131362134, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  public static void reset(net.oschina.app.team.fragment.TeamBoardFragment target) {
    target.mRlWaitDo = null;
    target.mRlWill = null;
    target.mRlIng = null;
    target.mRlAll = null;
    target.mTvWaitDo = null;
    target.mTvOutdate = null;
    target.mTvIng = null;
    target.mTvAll = null;
    target.mIvAvatarView = null;
    target.mTvName = null;
    target.mTvDate = null;
  }
}
