package com.lifeplaytrip.internshala_pro.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lifeplaytrip.internshala_pro.R;
import com.lifeplaytrip.internshala_pro.utils.Utils;

public class InternshipDetailFragment extends Fragment {

    private View view;
    private Button applyNow;
    private static FragmentManager fragmentManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_internship_detail, container, false);
        fragmentManager = getActivity().getSupportFragmentManager();

        applyNow = (Button) view.findViewById(R.id.applyNow);
        applyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Resume();
//        Bundle bundle = new Bundle();
//        bundle.putString("money", wallet_balance);
//        fragment.setArguments(bundle);
                fragmentManager
                        .beginTransaction()
                        .setCustomAnimations(R.anim.left_enter, R.anim.right_out)
                        .replace(R.id.container, fragment,
                                Utils.Resume).commit();
            }
        });
        return view;
    }


}
