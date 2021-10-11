package com.example.socialmediaapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.R;


import android.content.Context;

import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.firebase.auth.FirebaseAuth;


public class ProfileFragment extends Fragment {


    private TextView following,fullname,username, followers,bio,btn;
    private ToggleButton editProfile;
    public boolean flag;

    int count=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        String data = getContext().getSharedPreferences("PROFILE", Context.MODE_PRIVATE).getString("profileId", "none");
        followers = view.findViewById(R.id.followers);
        following = view.findViewById(R.id.following);

        fullname = view.findViewById(R.id.fullname);
        bio = view.findViewById(R.id.bio);
        username = view.findViewById(R.id.username);

        editProfile = view.findViewById(R.id.edit_profile);

        btn=view.findViewById(R.id.btn);

        flag=true;
        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag){
                    flag=false;
                    btn.setText("Following");

                  count++;
                    following.setText(String.valueOf(count));
                }
                else {
                    btn.setText("unfollow");
                    flag=true;
                    count--;
                    following.setText(String.valueOf(count));
                }


            }
        });



        return view;
    }




}
