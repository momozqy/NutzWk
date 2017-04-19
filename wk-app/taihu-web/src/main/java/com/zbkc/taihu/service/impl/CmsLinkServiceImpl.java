package com.zbkc.taihu.service.impl;


import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.zbkc.taihu.bean.Cms_link;
import com.zbkc.taihu.service.CmsLinkService;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

@IocBean(args = {"refer:dao"})
public class CmsLinkServiceImpl extends BaseServiceImpl<Cms_link> implements CmsLinkService {
    public CmsLinkServiceImpl(Dao dao) {
        super(dao);
    }
}
