package com.ruler.testzhangfan.view;

import android.app.Application;

import com.ruler.testzhangfan.dao.DaoMaster;
import com.ruler.testzhangfan.dao.DaoSession;
import com.ruler.testzhangfan.dao.HomeBeanDao;

/**
 * name:SailCheung
 * date:2019-06-13
 * time:上午 11:32
 * year:2019
 * project_name:testzhangfan
 */
public class App extends Application {

    public static HomeBeanDao mHomeBeanDao;

    @Override
    public void onCreate() {
        super.onCreate();
        initView();
    }

    private void initView() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "zf.db");
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        mHomeBeanDao = daoSession.getHomeBeanDao();
    }

    public static HomeBeanDao getmHomeBeanDao() {
        return mHomeBeanDao;
    }
}
