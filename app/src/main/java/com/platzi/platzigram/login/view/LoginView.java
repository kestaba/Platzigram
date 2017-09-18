package com.platzi.platzigram.login.view;

/**
 * Created by Anika on 17/09/17.
 */

public interface LoginView {

    void enableInputs();
    void disableInputs();

    void showProgressBar();
    void hideProgressBar();

    void loginError(String error);

    void goCreateAccount();
    void goHome();
    void goWeb();
}
