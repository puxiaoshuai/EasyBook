package puxiaoshuai.com.easybook.activity;


import android.os.Bundle;


import me.goldze.mvvmhabit.base.BaseActivity;
import puxiaoshuai.com.easybook.R;
import puxiaoshuai.com.easybook.databinding.ActivityLoginBinding;
import puxiaoshuai.com.easybook.vm.LoginModel;
import puxiaoshuai.com.easybook.BR;

/**
 * Created by Administrator on 2018/9/21 0021.
 */

public class LoginActivity extends BaseActivity<ActivityLoginBinding,LoginModel> {
    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_login;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public LoginModel initViewModel() {
        return new LoginModel(this);
    }
}
