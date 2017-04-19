package com.zbkc.taihu.service.impl;

import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.zbkc.taihu.bean.Sys_log;
import com.zbkc.taihu.service.SysLogService;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * Created by wizzer on 2016/12/22.
 */
@IocBean(args = {"refer:dao"})
public class SysLogServiceImpl extends BaseServiceImpl<Sys_log> implements SysLogService {
    public SysLogServiceImpl(Dao dao) {
        super(dao);
    }
}
