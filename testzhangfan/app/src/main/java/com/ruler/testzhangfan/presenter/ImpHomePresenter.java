package com.ruler.testzhangfan.presenter;

import com.ruler.testzhangfan.bean.HomeBean;
import com.ruler.testzhangfan.callback.HomeCallBack;
import com.ruler.testzhangfan.model.ImpHomeModel;
import com.ruler.testzhangfan.view.View;

import java.util.ArrayList;

/**
 * name:SailCheung
 * date:2019-06-13
 * time:上午 11:37
 * year:2019
 * project_name:testzhangfan
 */
public class ImpHomePresenter implements HomePresenter, HomeCallBack {

    private ImpHomeModel model;
    private View view;

    public ImpHomePresenter(ImpHomeModel model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void getdata() {
        model.getdata(this);
    }

    @Override
    public void onSuccess(ArrayList<HomeBean> ok) {
        view.onSuccess(ok);
    }

    @Override
    public void onFail(String no) {
        view.onFail(no);
    }
}
