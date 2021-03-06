package com.zbkc.taihu.service.impl;

import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.zbkc.taihu.bean.Sys_plugin;
import com.zbkc.taihu.service.SysPluginService;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * Created by wizzer on 2016/12/23.
 */
@IocBean(args = {"refer:dao"})
public class SysPluginServiceImpl extends BaseServiceImpl<Sys_plugin> implements SysPluginService {
    public SysPluginServiceImpl(Dao dao) {
        super(dao);
    }
}