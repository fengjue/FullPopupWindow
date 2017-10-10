package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private ListView listView;
    private MyAdapter myAdapter;
    private ArrayList<ItemBean> ItemBeans = null;
    private LinearLayout dragItemTitle;//会移动的title

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        initView();
        setContentView(R.layout.activity_main);
    }

    private void initView() {
        dragItemTitle = (LinearLayout) findViewById(R.id.drag_item_title);
        listView = (ListView) findViewById(R.id.listview);
        setDragTitle();
        myAdapter = new MyAdapter();
        myAdapter.setList(ItemBeans);
        listView.setAdapter(myAdapter);
    }

    /**
     * 设置会移动的title
     */
    private void setDragTitle() {
        for (int i = 1; i < 20; i++) {
            TextView textView = new TextView(MainActivity.this);
            textView.setGravity(Gravity.CENTER);
            dragItemTitle.addView(textView);
        }
    }

    /**
     * 获取每一列的数据
     */
    private void initData() {
        ItemBeans = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            ItemBean itemBean = new ItemBean();
            itemBean.setZero("Zero" + i);
            itemBean.setFirst("First" + i);
            itemBean.setSecond("Second" + i);
            itemBean.setThird("Third" + i);
            itemBean.setFourth("Fourth" + i);
            itemBean.setFifth("Fifth" + i);
            itemBean.setSixth("Sixth" + i);
            itemBean.setSeventh("Seventh" + i);
            itemBean.setEighth("Eighth" + i);
            itemBean.setNinth("Ninth" + i);
            itemBean.setTenth("Tenth" + i);
            itemBean.setEleventh("Eleventh" + i);
            itemBean.setTwelfth("Twelfth" + i);
            itemBean.setThirteenth("Thirteenth" + i);
            itemBean.setFourteenth("Fourteenth" + i);
            itemBean.setFifteenth("Fifteenth" + i);
            itemBean.setSixteenth("Sixteenth" + i);
            itemBean.setSeventeenth("Seventeenth" + i);
            itemBean.setEighteenth("Eighteenth" + i);
            itemBean.setNineteenth("Nineteenth" + i);
            itemBean.setTwelfth("Twelfth" + i);
            ItemBeans.add(itemBean);
        }
    }
}
