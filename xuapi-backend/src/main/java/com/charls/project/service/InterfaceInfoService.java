package com.charls.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.charls.project.model.entity.InterfaceInfo;

/**
* @author Charls
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2025-04-15 21:32:17
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
