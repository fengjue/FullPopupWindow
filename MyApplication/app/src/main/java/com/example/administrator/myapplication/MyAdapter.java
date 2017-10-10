package com.example.administrator.myapplication;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/1.
 */

public class MyAdapter extends BaseAdapter {
    private ArrayList<ItemBean> itemBeans;
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    public void setList(ArrayList<ItemBean> itemBeans) {
        this.itemBeans = itemBeans;
    }
}
