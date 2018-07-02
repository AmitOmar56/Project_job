package com.lifeplaytrip.internshala_pro.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.lifeplaytrip.internshala_pro.R;
import com.lifeplaytrip.internshala_pro.model.Education;

import java.util.List;

/**
 * Created by LifePlayTrip on 5/1/2018.
 */

public class Education_Adapter extends RecyclerView.Adapter<Education_Adapter.MyViewHolder> {
    private Context context;
    private List<Education> educationList;

    //declare interface
    private Education_Adapter.News_OnItemClicked onClick;

    //make interface like this
    public interface News_OnItemClicked {
        void news_onItemClick(int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView education_school, education_course, education_year, education_discription;
        public ImageButton edit_education_btn;

        public MyViewHolder(View view) {
            super(view);
            education_school = (TextView) view.findViewById(R.id.education_school);
            education_course = (TextView) view.findViewById(R.id.education_course);
            education_year = (TextView) view.findViewById(R.id.education_year);
            education_discription = (TextView) view.findViewById(R.id.education_discription);
            edit_education_btn = (ImageButton) view.findViewById(R.id.edit_education_btn);
        }
    }

    public Education_Adapter(Context context, List<Education> educationList) {
        this.context = context;
        this.educationList = educationList;
    }

    @Override
    public Education_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.resume_item_education, parent, false);

        return new Education_Adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final Education_Adapter.MyViewHolder holder, final int position) {
        Education education = educationList.get(position);
        holder.education_school.setText(education.getEducation_name());
//        Glide.with(context).load(game.getWin_status_image()).into(holder.win_status_image);
    }

    public void setOnClick(Education_Adapter.News_OnItemClicked onClick) {
        this.onClick = onClick;
    }

    @Override
    public int getItemCount() {
        return educationList.size();
    }
}
