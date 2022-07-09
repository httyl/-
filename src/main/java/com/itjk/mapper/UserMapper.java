package com.itjk.mapper;

import com.itjk.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author baomidou
 * @since 2022-07-09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
