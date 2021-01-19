package com.example.bookings.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.bookings.ContactUS;
import com.example.bookings.MainNavigation;
import com.example.bookings.R;

public class NotificationsFragment extends Fragment {
    TextView name, email, phone, password;
    Button button;
    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        name =  root.findViewById(R.id.name);
        email =  root.findViewById(R.id.email);
        phone = root.findViewById(R.id.phone);
        password =  root.findViewById(R.id.password);
        button= root.findViewById(R.id.button6);
        String nametxt = getActivity().getIntent().getExtras().getString("Name");
        String emailtxt = getActivity().getIntent().getExtras().getString("Email");
        String phonetxt = getActivity().getIntent().getExtras().getString("Phone");
        String passtxt = getActivity().getIntent().getExtras().getString("Pass");


    //    final TextView textView = root.findViewById(R.id.text_notifications);
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                name.setText(nametxt);email.setText(emailtxt);phone.setText(phonetxt);password.setText(passtxt);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ContactUS.class);
                startActivity(intent);
            }
        });
        return root;
    }
}