package com.ruler.testzhangfan.callback;

import com.ruler.testzhangfan.bean.HomeBean;

import java.util.ArrayList;

/**
 * name:SailCheung
 * date:2019-06-13
 * time:上午 11:18
 * year:2019
 * project_name:testzhangfan
 */
public interface HomeCallBack {
    void onSuccess(ArrayList<HomeBean> ok);
    void onFail(String no);
}
