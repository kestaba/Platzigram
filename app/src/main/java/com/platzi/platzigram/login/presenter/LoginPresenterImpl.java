package com.platzi.platzigram.login.presenter;

import com.platzi.platzigram.login.interactor.LoginInteractor;
import com.platzi.platzigram.login.interactor.LoginInteractorImpl;
import com.platzi.platzigram.login.view.LoginView;

/**
 * Created by Anika on 17/09/17.
 */

public class LoginPresenterImpl implements LoginPresenter {

    private LoginView loginView;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void signIn(String username, String password){
        loginView.disableInputs();
        loginView.showProgressBar();

        interactor.signIn(username, password);
    }

    @Override
    public void loginSuccess() {
        loginView.goHome();
        loginView.hideProgressBar();
    }

    @Override
    public void loginError(String error) {
        loginView.hideProgressBar();
        loginView.enableInputs();
        loginView.loginError(error);
    }
}
