package com.charls.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.charls.project.common.ErrorCode;
import com.charls.project.exception.BusinessException;
import com.charls.project.mapper.UserMapper;
import com.charls.xuapicommon.model.entity.User;
import com.charls.xuapicommon.service.InnerUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import javax.management.Query;

/**
 * @Author: charls
 * @Description: 内部用户服务实现类
 * @Date: 2025/04/18/ 20:35
 * @Version: 1.0
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
