package com.example.loginnavigate.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.loginnavigate.ProfileActivity;
import com.example.loginnavigate.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private EditText txt_email, txt_password;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        txt_email = binding.txtEmail;
        txt_password = binding.txtPassword;
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void login() {
        String email = txt_email.getText().toString();
        String password = txt_password.getText().toString();
        if (email.equals("admin@admin.com") && password.equals("admin")) {
            Toast.makeText(this.getContext(), "Login Success", Toast.LENGTH_SHORT).show();
            navigateToProfile();
        } else {
            Toast.makeText(this.getContext(), "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }

    public void navigateToProfile() {
        Intent next = new Intent(this.getContext(), ProfileActivity.class);
        next.putExtra("i_email", txt_email.getText().toString());
        startActivity(next);
    }
}