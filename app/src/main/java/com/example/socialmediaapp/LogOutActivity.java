package com.example.socialmediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.auth.FirebaseAuth;
public class LogOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(
                getApplication(), LoginActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
    }
}