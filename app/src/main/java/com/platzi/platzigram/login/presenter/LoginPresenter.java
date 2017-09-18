package com.platzi.platzigram.login.presenter;

import android.app.Activity;

/**
 * Created by Anika on 17/09/17.
 */

public interface LoginPresenter {

    void signIn(String username, String password, Activity activity);  // Interactor
    void loginSuccess();
    void loginError(String error);
}
