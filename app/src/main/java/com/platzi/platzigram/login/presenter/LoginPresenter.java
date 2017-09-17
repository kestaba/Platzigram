package com.platzi.platzigram.login.presenter;

/**
 * Created by Anika on 17/09/17.
 */

public interface LoginPresenter {

    void signIn(String username, String password);  // Interactor
    void loginSuccess();
    void loginError(String error);
}
