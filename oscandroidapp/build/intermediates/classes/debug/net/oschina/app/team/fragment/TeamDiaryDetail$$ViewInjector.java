// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamDiaryDetail$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.fragment.TeamDiaryDetail target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362003, "field 'mList'");
    target.mList = (android.widget.ListView) view;
    view = finder.findRequiredView(source, 2131362002, "field 'mSwiperefreshlayout'");
    target.mSwiperefreshlayout = (android.support.v4.widget.SwipeRefreshLayout) view;
    view = finder.findRequiredView(source, 2131361901, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
  }

  public static void reset(net.oschina.app.team.fragment.TeamDiaryDetail target) {
    target.mList = null;
    target.mSwiperefreshlayout = null;
    target.mErrorLayout = null;
  }
}
