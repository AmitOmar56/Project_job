package com.lifeplaytrip.internshala_pro.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lifeplaytrip.internshala_pro.R;

public class TestPaperNotification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_paper_notification);
    }

    public void agreeAndContinue(View view) {
        startActivity(new Intent(this, TestPaperScreen.class));
    }
}
