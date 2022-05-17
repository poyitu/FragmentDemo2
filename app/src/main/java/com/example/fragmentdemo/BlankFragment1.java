package com.example.fragmentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BlankFragment1 extends Fragment {


    private static final String TAG = "Mytag";
    private View root;
    private TextView textView;
    private Button button;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        String message = bundle.getString("message");
        Log.d(TAG, "onCreate: " + message);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (root == null) {
            root = inflater.inflate(R.layout.fragment_blank1, container, false);
        }
        textView = root.findViewById(R.id.textview);
        button = root.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Yes,I am,and you?");
            }
        });
        return root;
    }
}