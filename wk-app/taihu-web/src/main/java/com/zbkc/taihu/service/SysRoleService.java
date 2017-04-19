package com.zbkc.taihu.service;

import cn.wizzer.framework.base.service.BaseService;
import com.zbkc.taihu.bean.Sys_menu;
import com.zbkc.taihu.bean.Sys_role;

import java.util.List;

/**
 * Created by wizzer on 2016/12/22.
 */
public interface SysRoleService extends BaseService<Sys_role> {
    List<Sys_menu> getMenusAndButtons(String roleId);

    List<Sys_menu> getDatas(String roleId);

    List<Sys_menu> getDatas();

    List<String> getPermissionNameList(Sys_role role);

    void del(String roleid);

    void del(String[] roleids);
}
