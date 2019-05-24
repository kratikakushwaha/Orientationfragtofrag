package com.example.orientationfragtofrag;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {
    TextView t;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment2, container, false);
        t = v.findViewById(R.id.txt);
        if (savedInstanceState == null) {
        } else {
            t.setText(savedInstanceState.getString("savetxt"));
            Toast.makeText(getActivity(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
        }


        setRetainInstance(true);
        return v;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String save = t.getText().toString();
        outState.putString("savetxt", save);
        Toast.makeText(getActivity(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();

    }


    public void setdata(String str) {
        t.setText(str);
    }
}
