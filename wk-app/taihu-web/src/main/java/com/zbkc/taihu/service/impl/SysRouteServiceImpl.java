package com.zbkc.taihu.service.impl;

import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.zbkc.taihu.bean.Sys_route;
import com.zbkc.taihu.service.SysRouteService;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * Created by wizzer on 2016/12/23.
 */
@IocBean(args = {"refer:dao"})
public class SysRouteServiceImpl extends BaseServiceImpl<Sys_route> implements SysRouteService {
    public SysRouteServiceImpl(Dao dao) {
        super(dao);
    }
}