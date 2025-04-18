package com.charls.project.service.impl.inner;

import com.charls.project.service.UserInterfaceInfoService;
import com.charls.xuapicommon.model.entity.UserInterfaceInfo;
import com.charls.xuapicommon.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @Author: charls
 * @Description: 内部接口调用接口服务实现类
 * @Date: 2025/04/18/ 20:37
 * @Version: 1.0
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}
