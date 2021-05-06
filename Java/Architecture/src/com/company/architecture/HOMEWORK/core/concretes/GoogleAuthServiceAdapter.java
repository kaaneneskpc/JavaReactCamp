package com.company.architecture.HOMEWORK.core.concretes;

import com.company.architecture.HOMEWORK.core.abstracts.GoogleAuthService;
import com.company.architecture.HOMEWORK.googleAuth.GoogleAuthManager;

public class GoogleAuthServiceAdapter implements GoogleAuthService {
    @Override
    public void signIn(String message) {
        GoogleAuthManager manager = new GoogleAuthManager();
        manager.signIn("Successfully Login");
    }
}
