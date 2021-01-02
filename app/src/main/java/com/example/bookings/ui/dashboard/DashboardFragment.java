package com.example.bookings.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.bookings.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final Button b = root.findViewById(R.id.button);
        final TextView tv,tv2,tv3,tv4,tv5,tv6,tv7;
        tv=root.findViewById(R.id.textView);
        tv2=root.findViewById(R.id.textView2);
        tv3=root.findViewById(R.id.textView3);
        tv4=root.findViewById(R.id.textView4);
        tv5=root.findViewById(R.id.textView5);
        tv6=root.findViewById(R.id.textView6);
        tv7=root.findViewById(R.id.textView7);
        final EditText editText,editText1,editText2;
        editText=root.findViewById(R.id.editTextNumber);
        editText1=root.findViewById(R.id.editTextDate);
        editText2=root.findViewById(R.id.editTextDate2);
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //tv.setText(s);
            }
        });
        return root;
    }
}