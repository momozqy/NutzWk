package com.zbkc.taihu.service.impl;

import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.zbkc.taihu.bean.Cms_link_class;
import com.zbkc.taihu.service.CmsLinkClassService;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

@IocBean(args = {"refer:dao"})
public class CmsLinkClassServiceImpl extends BaseServiceImpl<Cms_link_class> implements CmsLinkClassService {
    public CmsLinkClassServiceImpl(Dao dao) {
        super(dao);
    }
}
