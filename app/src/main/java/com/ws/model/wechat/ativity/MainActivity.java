package com.ws.model.wechat.ativity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.ws.model.wechat.MyAdapter.AddressAdapter;
import com.ws.model.wechat.R;
import com.ws.model.wechat.biz.AddressBiz;

public class MainActivity extends AppCompatActivity {

    private Fragment fm_top,fm_wechat,fm_address,fm_find,fm_my,fm_buttom,current;
    private FragmentTransaction transaction;
    private FragmentManager manager;
    private   ListView lv_address;
    private AddressBiz addressBiz=new AddressBiz();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addressBiz.initAddress(this,lv_address,getApplicationContext());
    }

    private void init() {
        manager=getSupportFragmentManager();
        fm_top=manager.findFragmentById(R.id.fm_top);
        fm_wechat=manager.findFragmentById(R.id.fm_wechat);
        fm_address=manager.findFragmentById(R.id.fm_address);
        fm_find=manager.findFragmentById(R.id.fm_find);
        fm_my=manager.findFragmentById(R.id.fm_my);
        fm_buttom=manager.findFragmentById(R.id.fm_buttom);
        lv_address=(ListView)this.findViewById(R.id.lv_address);
        current=fm_wechat;

        transaction=manager.beginTransaction();
        transaction.hide(fm_find);
        transaction.hide(fm_address);
        transaction.hide(fm_my);
        transaction.commit();
    }



    //微信按钮单击事件
    public void weChat(View view) {
        if(current!=fm_wechat){
            transaction=manager.beginTransaction();
            transaction.hide(current);
            transaction.show(fm_wechat);
            transaction.commit();
            current=fm_wechat;
        }
    }

    //通讯录单击事件
    public void address(View view) {
        if(current!=fm_address){
            transaction=manager.beginTransaction();
            transaction.hide(current);
            transaction.show(fm_address);
            transaction.commit();
            current=fm_address;
        }
    }

    //发现单击事件
    public void find(View view) {
        if(current!=fm_find){
            transaction=manager.beginTransaction();
            transaction.hide(current);
            transaction.show(fm_find);
            transaction.commit();
            current=fm_find;
        }

    }

    //我 单击事件
    public void my(View view) {
        if(current!=fm_my){
            transaction=manager.beginTransaction();
            transaction.hide(current);
            transaction.show(fm_my);
            transaction.commit();
            current=fm_my;
        }
    }
}
