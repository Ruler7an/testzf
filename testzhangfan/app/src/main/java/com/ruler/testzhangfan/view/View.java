package com.ruler.testzhangfan.view;

import com.ruler.testzhangfan.bean.HomeBean;

import java.util.ArrayList;

/**
 * name:SailCheung
 * date:2019-06-13
 * time:上午 11:25
 * year:2019
 * project_name:testzhangfan
 */
public interface View {
    void onSuccess(ArrayList<HomeBean> ok);
    void onFail(String no);
}
