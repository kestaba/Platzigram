package com.platzi.platzigram.login.interactor;

import android.app.Activity;

/**
 * Created by Anika on 17/09/17.
 */

public interface LoginInteractor {
    void signIn(String username, String password, Activity activity);
}
