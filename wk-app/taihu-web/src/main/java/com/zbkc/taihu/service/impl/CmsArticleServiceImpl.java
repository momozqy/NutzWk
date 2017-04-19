package com.zbkc.taihu.service.impl;

import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.zbkc.taihu.bean.Cms_article;
import com.zbkc.taihu.service.CmsArticleService;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

@IocBean(args = {"refer:dao"})
public class CmsArticleServiceImpl extends BaseServiceImpl<Cms_article> implements CmsArticleService {
    public CmsArticleServiceImpl(Dao dao) {
        super(dao);
    }
}
