package com.lifeplaytrip.internshala_pro.activity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.lifeplaytrip.internshala_pro.R;
import com.lifeplaytrip.internshala_pro.adapter.TestPaper_Adapter;
import com.lifeplaytrip.internshala_pro.model.Test;

import java.util.ArrayList;

public class TestPaperScreen extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TextView submit_test, timerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_paper_screen);
        submit_test = (TextView) findViewById(R.id.submit_test);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        timerText = (TextView) findViewById(R.id.timerText);
        for (int i = 1; i <= 10; i++)
            tabLayout.addTab(tabLayout.newTab().setText(i + ""));

        viewPager = (ViewPager) findViewById(R.id.pager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // tabLayout.setupWithViewPager(viewPager);
        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                timerText.setText(""+ millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                timerText.setText("done!");
                startActivity(new Intent(TestPaperScreen.this, TestResultActivity.class));
            }

        }.start();
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabLayout.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                // uploadFunction("");
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        submit_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestPaperScreen.this, TestResultActivity.class));
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        manageViewPager();
    }

    private void manageViewPager() {

        ArrayList<View> pagerViews = new ArrayList<>();

        for (int i = 1; i < 10; i++) {

            View view = LayoutInflater.from(TestPaperScreen.this).inflate(R.layout.test_item, null);
            getDataAndSetToView(i, view);
            pagerViews.add(view);
        }

        TestPaper_Adapter testPaper_adapter = new TestPaper_Adapter(TestPaperScreen.this, pagerViews);
        viewPager.setAdapter(testPaper_adapter);
    }

    private void getDataAndSetToView(int i, final View view) {

        setDataToView(new Test("#include <stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "   int i, num, p = 0;\n" +
                "   printf(\"Please enter a number: \\n\");\n" +
                "   scanf(\"%d\", &num);\n" +
                "   for(i=1; i<=num; i++)\n" +
                "   {\n" +
                "      if(num%i==0)\n" +
                "      {\n" +
                "         p++;\n" +
                "      }\n" +
                "   }\n" +
                "   if(p==2)\n" +
                "   {\n" +
                "      printf(\"Entered number is %d \"\\\n" +
                "             \"and it is a prime number.\",num);\n" +
                "   }\n" +
                "   else\n" +
                "   {\n" +
                "      printf(\"Entered number is %d \"\\\n" +
                "             \"and it is not a prime number.\",num);\n" +
                "   }\n" +
                "}?", "1", "(n*(n-1))", "(n*(n-1))/2", "n-1", "n-1", i), view);


    }

    private void setDataToView(final Test test, View view) {

        final TextView question = (TextView) view.findViewById(R.id.question);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        RadioButton rb_A = (RadioButton) view.findViewById(R.id.optionA);
        RadioButton rb_B = (RadioButton) view.findViewById(R.id.optionB);
        RadioButton rb_C = (RadioButton) view.findViewById(R.id.optionC);
        RadioButton rb_D = (RadioButton) view.findViewById(R.id.optionD);
        Button next = (Button) view.findViewById(R.id.next);
        Button prev = (Button) view.findViewById(R.id.prev);

        question.setText(test.getTest_ques());
        rb_A.setText(test.getTest_option_a());
        rb_B.setText(test.getTest_option_b());
        rb_C.setText(test.getTest_option_c());
        rb_D.setText(test.getTest_option_d());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(test.getTest_id() + 1);
                Toast.makeText(TestPaperScreen.this, test.getTest_id() + "", Toast.LENGTH_LONG).show();
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TestPaperScreen.this, test.getTest_id() + "", Toast.LENGTH_LONG).show();
            }
        });

    }
}
