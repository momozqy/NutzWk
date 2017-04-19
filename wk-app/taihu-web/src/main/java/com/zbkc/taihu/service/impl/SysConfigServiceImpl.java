package com.zbkc.taihu.service.impl;
import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.zbkc.taihu.bean.Sys_config;
import com.zbkc.taihu.service.SysConfigService;
import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

import java.util.List;

/**
 * Created by wizzer on 2016/12/23.
 */
@IocBean(args = {"refer:dao"})
public class SysConfigServiceImpl extends BaseServiceImpl<Sys_config> implements SysConfigService {
    public SysConfigServiceImpl(Dao dao) {
        super(dao);
    }

    public List<Sys_config> getAllList() {
        return this.query(Cnd.where("delFlag", "=", false));
    }
}