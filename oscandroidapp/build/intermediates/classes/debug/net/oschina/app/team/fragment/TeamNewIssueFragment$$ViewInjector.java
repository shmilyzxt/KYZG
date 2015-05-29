// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamNewIssueFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.fragment.TeamNewIssueFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362179, "field 'mEtTitle'");
    target.mEtTitle = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131362147, "field 'mTvProject'");
    target.mTvProject = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362184, "field 'mTvCatalog'");
    target.mTvCatalog = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362157, "field 'mTvToUser'");
    target.mTvToUser = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362189, "field 'mTvTime'");
    target.mTvTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362190, "field 'mRlGitPush'");
    target.mRlGitPush = view;
    view = finder.findRequiredView(source, 2131362193, "field 'mPushLine'");
    target.mPushLine = view;
    view = finder.findRequiredView(source, 2131362191, "field 'mTvPushSource'");
    target.mTvPushSource = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362192, "field 'mCbPush'");
    target.mCbPush = (android.widget.CheckBox) view;
  }

  public static void reset(net.oschina.app.team.fragment.TeamNewIssueFragment target) {
    target.mEtTitle = null;
    target.mTvProject = null;
    target.mTvCatalog = null;
    target.mTvToUser = null;
    target.mTvTime = null;
    target.mRlGitPush = null;
    target.mPushLine = null;
    target.mTvPushSource = null;
    target.mCbPush = null;
  }
}
