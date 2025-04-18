package com.charls.xuapicommon.service;

import com.charls.xuapicommon.model.entity.InterfaceInfo;

/**
* @author Charls
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2025-04-15 21:32:17
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在(请求路径、请求方法、请求参数)
     *
     * @param url
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String url, String method);
}
