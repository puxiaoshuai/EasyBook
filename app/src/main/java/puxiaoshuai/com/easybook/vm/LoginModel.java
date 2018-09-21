package puxiaoshuai.com.easybook.vm;

import android.content.Context;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.os.Handler;


import com.blankj.utilcode.util.ToastUtils;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import puxiaoshuai.com.easybook.activity.MainActivity;

/**
 * Created by Administrator on 2018/9/21 0021.
 * 这是登录界面的逻辑处理的地方
 */

public class LoginModel extends BaseViewModel  {

    public LoginModel(Context context) {
        super(context);
    }
    //分析在登录页面我们需要填写用户名，密码，清除用户名,显示隐，还有密码的看与加密，登录按钮监听
    public ObservableField<String> userName=new ObservableField<>();
    public ObservableField<String > password=new ObservableField<>();
    public BindingCommand loginOnclickCommand=new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ToastUtils.showShort("2s后跳转");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Bundle bundle=new Bundle();
                    bundle.putString("name",userName.toString());
                   startActivity(MainActivity.class,bundle);
                }
            },2000);
        }
    });


}
