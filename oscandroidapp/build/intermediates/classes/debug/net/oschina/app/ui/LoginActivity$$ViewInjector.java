// Generated code from Butter Knife. Do not modify!
package net.oschina.app.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LoginActivity$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.ui.LoginActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361869, "field 'mEtUserName'");
    target.mEtUserName = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131361871, "field 'mEtPassword'");
    target.mEtPassword = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131361870, "field 'mIvClearUserName'");
    target.mIvClearUserName = view;
    view = finder.findRequiredView(source, 2131361872, "field 'mIvClearPassword'");
    target.mIvClearPassword = view;
    view = finder.findRequiredView(source, 2131361873, "field 'mBtnLogin'");
    target.mBtnLogin = (android.widget.Button) view;
    view = finder.findRequiredView(source, 2131361874, "field 'mBtnQQLogin'");
    target.mBtnQQLogin = (android.widget.Button) view;
  }

  public static void reset(net.oschina.app.ui.LoginActivity target) {
    target.mEtUserName = null;
    target.mEtPassword = null;
    target.mIvClearUserName = null;
    target.mIvClearPassword = null;
    target.mBtnLogin = null;
    target.mBtnQQLogin = null;
  }
}
