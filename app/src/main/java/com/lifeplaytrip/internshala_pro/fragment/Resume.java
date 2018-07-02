package com.lifeplaytrip.internshala_pro.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.lifeplaytrip.internshala_pro.R;
import com.lifeplaytrip.internshala_pro.adapter.Education_Adapter;
import com.lifeplaytrip.internshala_pro.model.Education;
import com.lifeplaytrip.internshala_pro.utils.Utils;

import java.util.ArrayList;
import java.util.List;


public class Resume extends Fragment implements Education_Adapter.News_OnItemClicked {
    private RecyclerView recyclerView;
    private List<Education> educationList;
    private Education_Adapter adapter;
    private View view;
    private static FragmentManager fragmentManager;

    private ImageButton add_experience_btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_resume, container, false);

        fragmentManager = getActivity().getSupportFragmentManager();
        initId();
        recyclerView = (RecyclerView) view.findViewById(R.id.payment_history_recyclerview);
        educationList = new ArrayList<>();
        adapter = new Education_Adapter(getContext(), educationList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        adapter.setOnClick(this);

        add_experience_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.container, new Add_Experiance(),
                                Utils.Add_Experiance).commit();
            }
        });
        payment_historyApiRequest();
        return view;


    }

    private void initId() {
        add_experience_btn = (ImageButton) view.findViewById(R.id.add_experience_btn);
    }

    @Override
    public void news_onItemClick(int position) {

    }
    private void payment_historyApiRequest() {
        Education education = new Education("Banaras Hindu University", "MCA", "20", "Feb 10 2018", "02:00pm", 1);
        educationList.add(education);
        education = new Education("Banaras Hindu University", "MCA", "20", "Feb 10 2018", "02:00pm", 1);
        educationList.add(education);
        education = new Education("Banaras Hindu University", "MCA", "20", "Feb 10 2018", "02:00pm", 1);
        educationList.add(education);

        adapter.notifyDataSetChanged();
    }
}
