package com.platzi.platzigram.login.repository;

import com.platzi.platzigram.login.presenter.LoginPresenter;

/**
 * Created by Anika on 17/09/17.
 */

public class LoginRepositoryImpl implements LoginRepository {

    private LoginPresenter presenter;

    public LoginRepositoryImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void signIn(String username, String password) {
        boolean success = true;

        if (success){
            presenter.loginSuccess();
        }else{
            presenter.loginError("Ocurrió un error.");
        }
    }
}
