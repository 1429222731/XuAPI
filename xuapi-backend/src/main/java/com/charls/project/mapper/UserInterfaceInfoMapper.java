package com.charls.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.charls.xuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author Charls
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2025-04-17 10:53:51
* @Entity com.charls.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    /*
    * select interfaceInfoId, SUM(totalNum) as totalNum
        from user_interface_info
        group by interfaceInfoId
        order by totalNum desc
        limit 3;
    * */
    /**
     * 查询最热门的接口信息
     *
     * @param limit
     * @return
     */
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




