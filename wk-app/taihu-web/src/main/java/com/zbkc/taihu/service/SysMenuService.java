package com.zbkc.taihu.service;

import cn.wizzer.framework.base.service.BaseService;
import com.zbkc.taihu.bean.Sys_menu;

/**
 * Created by wizzer on 2016/12/22.
 */
public interface SysMenuService extends BaseService<Sys_menu> {
    void save(Sys_menu menu, String pid);
    void deleteAndChild(Sys_menu unit);
}
