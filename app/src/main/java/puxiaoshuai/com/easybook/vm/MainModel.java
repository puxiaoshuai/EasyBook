package puxiaoshuai.com.easybook.vm;

import android.content.Context;
import android.databinding.ObservableField;
import android.os.Bundle;

import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * Created by Administrator on 2018/9/21 0021.
 */

public class MainModel extends BaseViewModel {
  private String mName;
    public MainModel(Context context, String  name) {
        super(context);
        mName=name;
    }
    ObservableField<String> name=new ObservableField<>();

}
