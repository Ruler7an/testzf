package com.ruler.testzhangfan.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.ruler.testzhangfan.bean.HomeBean;

import com.ruler.testzhangfan.dao.HomeBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig homeBeanDaoConfig;

    private final HomeBeanDao homeBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        homeBeanDaoConfig = daoConfigMap.get(HomeBeanDao.class).clone();
        homeBeanDaoConfig.initIdentityScope(type);

        homeBeanDao = new HomeBeanDao(homeBeanDaoConfig, this);

        registerDao(HomeBean.class, homeBeanDao);
    }
    
    public void clear() {
        homeBeanDaoConfig.clearIdentityScope();
    }

    public HomeBeanDao getHomeBeanDao() {
        return homeBeanDao;
    }

}