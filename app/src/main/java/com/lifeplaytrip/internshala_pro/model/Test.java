package com.lifeplaytrip.internshala_pro.model;

/**
 * Created by LifePlayTrip on 5/3/2018.
 */

public class Test {
    private String test_ques;
    private String test_option_a;
    private String test_option_b;
    private String test_option_c;
    private String test_option_d;
    private String test_ans;
    private int test_id;

    public Test(String test_ques, String test_option_a, String test_option_b, String test_option_c, String test_option_d, String test_ans, int test_id) {
        this.test_ques = test_ques;
        this.test_option_a = test_option_a;
        this.test_option_b = test_option_b;
        this.test_option_c = test_option_c;
        this.test_option_d = test_option_d;
        this.test_ans=test_ans;
        this.test_id = test_id;
    }

    public String getTest_ques() {
        return test_ques;
    }

    public void setTest_ques(String test_ques) {
        this.test_ques = test_ques;
    }

    public String getTest_option_a() {
        return test_option_a;
    }

    public void setTest_option_a(String test_option_a) {
        this.test_option_a = test_option_a;
    }

    public String getTest_option_b() {
        return test_option_b;
    }

    public void setTest_option_b(String test_option_b) {
        this.test_option_b = test_option_b;
    }

    public String getTest_option_c() {
        return test_option_c;
    }

    public void setTest_option_c(String test_option_c) {
        this.test_option_c = test_option_c;
    }

    public String getTest_option_d() {
        return test_option_d;
    }

    public void setTest_option_d(String test_option_d) {
        this.test_option_d = test_option_d;
    }

    public String getTest_ans() {
        return test_ans;
    }

    public void setTest_ans(String test_ans) {
        this.test_ans = test_ans;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }
}