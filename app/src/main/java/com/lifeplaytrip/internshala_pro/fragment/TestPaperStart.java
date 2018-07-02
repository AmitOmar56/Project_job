package com.lifeplaytrip.internshala_pro.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lifeplaytrip.internshala_pro.R;
import com.lifeplaytrip.internshala_pro.activity.TestPaperNotification;

public class TestPaperStart extends Fragment {

    private View view;
    private TextView start_now;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_test_paper_start, container, false);
        start_now = (TextView) view.findViewById(R.id.start_now);
        start_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TestPaperNotification.class));
            }
        });
        return view;
    }


}
