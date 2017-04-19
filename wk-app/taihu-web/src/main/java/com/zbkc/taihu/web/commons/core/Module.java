package com.zbkc.taihu.web.commons.core;

import cn.wizzer.framework.shiro.ShiroSessionProvider;
import org.beetl.ext.nutz.BeetlViewMaker;
import org.nutz.mvc.annotation.*;
import org.nutz.mvc.ioc.provider.ComboIocProvider;
import org.nutz.plugins.view.pdf.PdfViewMaker;

/**
 * Created by momo on 2017/4/19.
 */
@Modules(scanPackage = true, packages = "com.zbkc.taihu")
@Ok("json:full")
@Fail("http:500")
@IocBy(type = ComboIocProvider.class, args = {"*json", "config/ioc/", "*anno", "com.zbkc.taihu", "cn.wizzer","*jedis", "*tx", "*quartz", "*async", "*rabbitmq"})
@Localization(value = "locales/", defaultLocalizationKey = "zh_CN")
@Encoding(input = "UTF-8", output = "UTF-8")
@Views({BeetlViewMaker.class, PdfViewMaker.class})
@SetupBy(value = Setup.class)
@ChainBy(args = "config/chain/nutzwk-mvc-chain.json")
@SessionBy(ShiroSessionProvider.class)
public class Module {

}
