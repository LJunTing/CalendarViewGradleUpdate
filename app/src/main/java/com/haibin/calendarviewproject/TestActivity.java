package com.haibin.calendarviewproject;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.haibin.calendarview.CalendarView;
import com.haibin.calendarviewproject.base.activity.BaseActivity;
import com.haibin.calendarviewproject.colorful.ColorfulActivity;
import com.haibin.calendarviewproject.index.IndexActivity;
import com.haibin.calendarviewproject.meizu.MeiZuActivity;
import com.haibin.calendarviewproject.simple.SimpleActivity;

/**
 * 测试界面
 * Created by huanghaibin on 2018/8/7.
 */

public class TestActivity extends BaseActivity implements View.OnClickListener {

    private CalendarView mCalendarView;
    public static void show(Context context) {
        context.startActivity(new Intent(context, TestActivity.class));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    protected void initView() {
        setStatusBarDarkMode();
        findViewById(R.id.iv_next).setOnClickListener(this);
        findViewById(R.id.iv_pre).setOnClickListener(this);
        mCalendarView =  findViewById(R.id.calendar_view);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.iv_next){
            mCalendarView.scrollToNext(false);
        }
        else   if (v.getId()==R.id.iv_pre){
            mCalendarView.scrollToPre(false);
        }
    }
}
