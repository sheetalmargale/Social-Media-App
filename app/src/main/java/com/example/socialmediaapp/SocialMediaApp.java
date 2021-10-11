package com.example.socialmediaapp;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class SocialMediaApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
