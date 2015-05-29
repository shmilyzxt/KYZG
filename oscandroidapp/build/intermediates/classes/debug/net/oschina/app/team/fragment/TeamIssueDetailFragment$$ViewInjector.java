// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamIssueDetailFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.fragment.TeamIssueDetailFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362145, "field 'mContent'");
    target.mContent = view;
    view = finder.findRequiredView(source, 2131361901, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131362146, "field 'mProjectView'");
    target.mProjectView = view;
    view = finder.findRequiredView(source, 2131362147, "field 'mTvProject'");
    target.mTvProject = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362149, "field 'mTvStateTitle'");
    target.mTvStateTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362150, "field 'mTvTitle'");
    target.mTvTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362157, "field 'mTvToUser'");
    target.mTvToUser = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362163, "field 'mTvCooperateUser'");
    target.mTvCooperateUser = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362160, "field 'mTvDieTime'");
    target.mTvDieTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362166, "field 'mTvState'");
    target.mTvState = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362168, "field 'mLLlabels'");
    target.mLLlabels = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131362171, "field 'mTvAttachments'");
    target.mTvAttachments = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362174, "field 'mTvRelations'");
    target.mTvRelations = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362153, "field 'mTvIssueChild'");
    target.mTvIssueChild = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362154, "field 'mLLChildIssues'");
    target.mLLChildIssues = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131362176, "field 'mLLComments'");
    target.mLLComments = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131362148, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131362164, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131362151, "method 'onClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  public static void reset(net.oschina.app.team.fragment.TeamIssueDetailFragment target) {
    target.mContent = null;
    target.mErrorLayout = null;
    target.mProjectView = null;
    target.mTvProject = null;
    target.mTvStateTitle = null;
    target.mTvTitle = null;
    target.mTvToUser = null;
    target.mTvCooperateUser = null;
    target.mTvDieTime = null;
    target.mTvState = null;
    target.mLLlabels = null;
    target.mTvAttachments = null;
    target.mTvRelations = null;
    target.mTvIssueChild = null;
    target.mLLChildIssues = null;
    target.mLLComments = null;
  }
}
