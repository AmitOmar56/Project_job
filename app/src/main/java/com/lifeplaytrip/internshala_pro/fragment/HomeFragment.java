package com.lifeplaytrip.internshala_pro.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifeplaytrip.internshala_pro.R;
import com.lifeplaytrip.internshala_pro.adapter.City_Adapter;
import com.lifeplaytrip.internshala_pro.adapter.Education_Adapter;
import com.lifeplaytrip.internshala_pro.model.Allinternship;
import com.lifeplaytrip.internshala_pro.model.City;
import com.lifeplaytrip.internshala_pro.model.Education;
import com.lifeplaytrip.internshala_pro.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements City_Adapter.News_OnItemClicked {

    private RecyclerView recyclerView, catogary_recyclerView;
    private List<City> cityList, catogarylist;
    private City_Adapter adapter;
    private City city;
    private View view;
    private static FragmentManager fragmentManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        fragmentManager = getActivity().getSupportFragmentManager();

        recyclerView = (RecyclerView) view.findViewById(R.id.city_recyclerView);
        cityList = new ArrayList<>();
        adapter = new City_Adapter(getContext(), cityList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager_new = new LinearLayoutManager(getContext());
        linearLayoutManager_new.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager_new);
        adapter.setOnClick(this);

        catogary_recyclerView = (RecyclerView) view.findViewById(R.id.catogary_recyclerView);
        catogarylist = new ArrayList<>();
        adapter = new City_Adapter(getContext(), catogarylist);
        //RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        catogary_recyclerView.setLayoutManager(mLayoutManager);
        catogary_recyclerView.setItemAnimator(new DefaultItemAnimator());
        catogary_recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        catogary_recyclerView.setLayoutManager(linearLayoutManager);
        adapter.setOnClick(this);

        city_ApiCall();
        catogary_ApiCall();
        return view;
    }


    @Override
    public void news_onItemClick(int position) {
        gotoAllInternshipFragment();
    }

    private void gotoAllInternshipFragment() {
        Fragment fragment = new AllInternshipFragment();
//        Bundle bundle = new Bundle();
//        bundle.putString("money", wallet_balance);
//        fragment.setArguments(bundle);
        fragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.left_enter, R.anim.right_out)
                .replace(R.id.container, fragment,
                        Utils.AllInternshipFragment).commit();
    }

    private void city_ApiCall() {
        city = new City("Delhi", "https://internshala.com/static/images/home/discover/city_delhi_new.jpg", 1);
        cityList.add(city);
        city = new City("Banglore", "https://internshala.com/static/images/home/discover/city_bangalore_new.jpg", 1);
        cityList.add(city);
        city = new City("Mumbai", "https://internshala.com/static/images/home/discover/city_mumbai_new.jpg", 1);
        cityList.add(city);
        city = new City("Hyderabad", "https://internshala.com/static/images/home/discover/city_hyderabad_new.jpg", 1);
        cityList.add(city);
        city = new City("Chennai", "https://internshala.com/static/images/home/discover/city_chennai_new.jpg", 1);
        cityList.add(city);
        city = new City("Delhi", "https://internshala.com/static/images/home/discover/city_delhi_new.jpg", 1);
        cityList.add(city);
        city = new City("Banglore", "https://internshala.com/static/images/home/discover/city_bangalore_new.jpg", 1);
        cityList.add(city);
        city = new City("Mumbai", "https://internshala.com/static/images/home/discover/city_mumbai_new.jpg", 1);
        cityList.add(city);
        city = new City("Hyderabad", "https://internshala.com/static/images/home/discover/city_hyderabad_new.jpg", 1);
        cityList.add(city);
        city = new City("Chennai", "https://internshala.com/static/images/home/discover/city_chennai_new.jpg", 1);
        cityList.add(city);

        adapter.notifyDataSetChanged();
    }

    private void catogary_ApiCall() {
        city = new City("Engineering", "https://internshala.com/static/images/home/discover/category_engineering_new.jpg", 1);
        catogarylist.add(city);
        city = new City("Mba", "https://internshala.com/static/images/home/discover/category_mba_new.jpg", 1);
        catogarylist.add(city);
        city = new City("Science", "https://internshala.com/static/images/home/discover/category_science_new.jpg", 1);
        catogarylist.add(city);
        city = new City("Humanities", "https://internshala.com/static/images/home/discover/category_humanities_new.jpg", 1);
        catogarylist.add(city);
        city = new City("Media", "https://internshala.com/static/images/home/discover/category_media_new.jpg", 1);
        catogarylist.add(city);
        city = new City("Engineering", "https://internshala.com/static/images/home/discover/category_engineering_new.jpg", 1);
        catogarylist.add(city);
        city = new City("Mba", "https://internshala.com/static/images/home/discover/category_mba_new.jpg", 1);
        catogarylist.add(city);
        city = new City("Science", "https://internshala.com/static/images/home/discover/category_science_new.jpg", 1);
        catogarylist.add(city);
        city = new City("Humanities", "https://internshala.com/static/images/home/discover/category_humanities_new.jpg", 1);
        catogarylist.add(city);
        city = new City("Media", "https://internshala.com/static/images/home/discover/category_media_new.jpg", 1);
        catogarylist.add(city);

        adapter.notifyDataSetChanged();
    }
}
