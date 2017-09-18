package com.platzi.platzigram.login.interactor;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Anika on 17/09/17.
 */

public interface LoginInteractor {
    void signIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth);
}
