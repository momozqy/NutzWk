package com.zbkc.taihu.service;

import cn.wizzer.framework.base.service.BaseService;
import com.zbkc.taihu.bean.Cms_channel;

public interface CmsChannelService extends BaseService<Cms_channel>{
    void save(Cms_channel channel, String pid);
    void deleteAndChild(Cms_channel channel);
}
