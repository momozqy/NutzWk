package com.zbkc.taihu.service;

import cn.wizzer.framework.base.service.BaseService;
import com.zbkc.taihu.bean.Sys_config;

import java.util.List;

/**
 * Created by wizzer on 2016/12/23.
 */
public interface SysConfigService extends BaseService<Sys_config> {
    List<Sys_config> getAllList();
}
