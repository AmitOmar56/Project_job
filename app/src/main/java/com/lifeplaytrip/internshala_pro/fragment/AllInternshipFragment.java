package com.lifeplaytrip.internshala_pro.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.lifeplaytrip.internshala_pro.R;
import com.lifeplaytrip.internshala_pro.adapter.Allinternship_Adapter;
import com.lifeplaytrip.internshala_pro.model.Allinternship;
import com.lifeplaytrip.internshala_pro.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class AllInternshipFragment extends Fragment implements Allinternship_Adapter.News_OnItemClicked {

    private RecyclerView recyclerView;
    private List<Allinternship> allinternshipList;
    private Allinternship_Adapter adapter;
    private Allinternship allinternship;
    private View view;
    private static FragmentManager fragmentManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_all_internship, container, false);
        fragmentManager = getActivity().getSupportFragmentManager();

        recyclerView = (RecyclerView) view.findViewById(R.id.allinternship_recyclerView);
        allinternshipList = new ArrayList<>();
        adapter = new Allinternship_Adapter(getContext(), allinternshipList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        adapter.setOnClick(this);
        Allinternship_ApiCall();
        return view;
    }

    @Override
    public void news_onItemClick(int position) {
//        startActivity(new Intent(getContext(), InternshipDetailActivity.class));
        Fragment fragment = new InternshipDetailFragment();
//        Bundle bundle = new Bundle();
//        bundle.putString("money", wallet_balance);
//        fragment.setArguments(bundle);
        fragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.left_enter, R.anim.right_out)
                .replace(R.id.container, fragment,
                        Utils.InternshipDetailFragment).commit();

    }

    private void Allinternship_ApiCall() {
        allinternship = new Allinternship("Android Developer", "Life play Trip", "Gurgaon", "Immediate", "6 months", "10000/months", "17/05/2018", "Full Time");
        allinternshipList.add(allinternship);
        allinternship = new Allinternship("Android Developer", "Life play Trip", "Gurgaon", "Immediate", "6 months", "10000/months", "17/05/2018", "Full Time");
        allinternshipList.add(allinternship);
        allinternship = new Allinternship("Android Developer", "Life play Trip", "Gurgaon", "Immediate", "6 months", "10000/months", "17/05/2018", "Full Time");
        allinternshipList.add(allinternship);
        allinternship = new Allinternship("Android Developer", "Life play Trip", "Gurgaon", "Immediate", "6 months", "10000/months", "17/05/2018", "Full Time");
        allinternshipList.add(allinternship);
        adapter.notifyDataSetChanged();

    }
}
