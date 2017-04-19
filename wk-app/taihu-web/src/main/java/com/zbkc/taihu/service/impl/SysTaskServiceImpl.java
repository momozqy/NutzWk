package com.zbkc.taihu.service.impl;

import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.zbkc.taihu.bean.Sys_task;
import com.zbkc.taihu.service.SysTaskService;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * Created by wizzer on 2016/12/22.
 */
@IocBean(args = {"refer:dao"})
public class SysTaskServiceImpl extends BaseServiceImpl<Sys_task> implements SysTaskService {
    public SysTaskServiceImpl(Dao dao) {
        super(dao);
    }
}
