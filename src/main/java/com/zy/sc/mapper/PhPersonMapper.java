package com.zy.sc.mapper;

import com.zy.sc.entity.PhPerson;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wanglei
 * @since 2019-12-18
 */
@DS("master")
public interface PhPersonMapper extends BaseMapper<PhPerson> {

}
