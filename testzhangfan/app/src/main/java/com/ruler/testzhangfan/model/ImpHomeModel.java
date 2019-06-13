package com.ruler.testzhangfan.model;

import android.util.Log;

import com.ruler.testzhangfan.R;
import com.ruler.testzhangfan.bean.HomeBean;
import com.ruler.testzhangfan.callback.HomeCallBack;
import com.ruler.testzhangfan.dao.HomeBeanDao;
import com.ruler.testzhangfan.view.App;

import java.util.ArrayList;

/**
 * name:SailCheung
 * date:2019-06-13
 * time:上午 11:26
 * year:2019
 * project_name:testzhangfan
 */
public class ImpHomeModel implements HomeModel{
    @Override
    public void getdata(HomeCallBack homeCallBack) {
        ArrayList<HomeBean> list = new ArrayList<>();
        HomeBeanDao homeBeanDao = App.getmHomeBeanDao();
        for (int i = 0; i < 20; i++) {
            list.add(new HomeBean(null,"我是标题"+i,"我是内容"+i,R.mipmap.ic_launcher,"https://www.baidu.com/"));
            Log.e("Tag",""+list);
            homeBeanDao.insertOrReplaceInTx(new HomeBean(null,list.get(i).getTitle(),list.get(i).getContent(),R.mipmap.ic_launcher,list.get(i).getUrl()));
        }
        homeCallBack.onSuccess(list);
        homeCallBack.onFail(list.toString());
    }
}
