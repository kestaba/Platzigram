package com.platzi.platzigram.login.repository;

import android.app.Activity;

/**
 * Created by Anika on 17/09/17.
 */

public interface LoginRepository {
    void signIn(String username, String password, Activity activity);
}
