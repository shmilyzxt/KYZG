// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamSelectMemberAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.adapter.TeamSelectMemberAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362047, "field 'aView'");
    target.aView = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362048, "field 'name'");
    target.name = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.team.adapter.TeamSelectMemberAdapter.ViewHolder target) {
    target.aView = null;
    target.name = null;
  }
}
