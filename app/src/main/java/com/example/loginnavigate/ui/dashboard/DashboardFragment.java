package com.example.loginnavigate.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.loginnavigate.MainActivity;
import com.example.loginnavigate.WebActivity;
import com.example.loginnavigate.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    private EditText txt_url;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        txt_url = binding.txtUrl;
        binding.btnNavigateUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateUrl();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void navigateUrl() {
        Intent next = new Intent(this.getContext(), WebActivity.class);
        next.putExtra("url", txt_url.getText().toString());
        startActivity(next);
    }
}