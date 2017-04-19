package com.zbkc.taihu.service.impl;

import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.zbkc.taihu.bean.Cms_site;
import com.zbkc.taihu.service.CmsSiteService;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

@IocBean(args = {"refer:dao"})
public class CmsSiteServiceImpl extends BaseServiceImpl<Cms_site> implements CmsSiteService {
    public CmsSiteServiceImpl(Dao dao) {
        super(dao);
    }
}
