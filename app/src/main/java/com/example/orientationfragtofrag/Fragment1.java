package com.example.orientationfragtofrag;


import android.content.Context;
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


public class Fragment1 extends Fragment {


    private EditText e1;
    Button btn;
    private Frag frag;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);


        e1 = v.findViewById(R.id.ettext);

        btn = v.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               frag.set(e1.getText().toString());
            }
        });

        setRetainInstance(true);
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        frag= (Frag) context;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String save = e1.getText().toString();
        outState.putString("savetxt", save);
        Toast.makeText(getActivity(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();

    }


interface Frag{
        void set(String str);
}
}
