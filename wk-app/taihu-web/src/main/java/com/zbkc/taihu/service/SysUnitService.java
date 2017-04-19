package com.zbkc.taihu.service;

import cn.wizzer.framework.base.service.BaseService;
import com.zbkc.taihu.bean.Sys_unit;

/**
 * Created by wizzer on 2016/12/22.
 */
public interface SysUnitService extends BaseService<Sys_unit> {
    void save(Sys_unit unit, String pid);

    void deleteAndChild(Sys_unit unit);
}
