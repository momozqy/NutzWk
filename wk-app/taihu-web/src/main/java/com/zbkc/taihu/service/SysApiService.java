package com.zbkc.taihu.service;

import cn.wizzer.framework.base.service.BaseService;
import com.zbkc.taihu.bean.Sys_api;

import java.io.IOException;
import java.util.Date;

/**
 * Created by wizzer on 2016/12/23.
 */
public interface SysApiService extends BaseService<Sys_api> {
    String generateToken(Date date, String appId)throws IOException, ClassNotFoundException;
    boolean verifyToken(String appId, String token);
}
