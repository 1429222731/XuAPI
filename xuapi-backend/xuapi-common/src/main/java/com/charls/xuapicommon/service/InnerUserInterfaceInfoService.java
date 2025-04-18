package com.charls.xuapicommon.service;

/**
* @author Charls
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2025-04-17 10:53:51
*/
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
