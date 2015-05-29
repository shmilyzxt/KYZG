// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class NoteBookFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.fragment.NoteBookFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362071, "field 'mGrid'");
    target.mGrid = (net.oschina.app.widget.KJDragGridView) view;
    view = finder.findRequiredView(source, 2131362072, "field 'mImgTrash'");
    target.mImgTrash = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362002, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = (android.support.v4.widget.SwipeRefreshLayout) view;
    view = finder.findRequiredView(source, 2131361901, "field 'mEmptyLayout'");
    target.mEmptyLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
  }

  public static void reset(net.oschina.app.team.fragment.NoteBookFragment target) {
    target.mGrid = null;
    target.mImgTrash = null;
    target.mSwipeRefreshLayout = null;
    target.mEmptyLayout = null;
  }
}
