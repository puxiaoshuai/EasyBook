package puxiaoshuai.com.easybook.activity;


import android.os.Bundle;

import me.goldze.mvvmhabit.base.BaseActivity;

import puxiaoshuai.com.easybook.BR;
import puxiaoshuai.com.easybook.R;
import puxiaoshuai.com.easybook.databinding.ActivityMainBinding;
import puxiaoshuai.com.easybook.vm.MainModel;

public class MainActivity extends BaseActivity<ActivityMainBinding,MainModel> {

    String name ;

    @Override
    public void initParam() {
        super.initParam();
     name=getIntent().getStringExtra("name");
    }

    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.mainModel;
    }

    @Override
    public MainModel initViewModel() {
        return new MainModel(this,name);
    }
}
