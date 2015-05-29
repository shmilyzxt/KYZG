// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FindUserFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.FindUserFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362040, "field 'mListView'");
    target.mListView = (android.widget.ListView) view;
    view = finder.findRequiredView(source, 2131361901, "field 'mErrorLayout'");
    target.mErrorLayout = (net.oschina.app.ui.empty.EmptyLayout) view;
  }

  public static void reset(net.oschina.app.fragment.FindUserFragment target) {
    target.mListView = null;
    target.mErrorLayout = null;
  }
}
