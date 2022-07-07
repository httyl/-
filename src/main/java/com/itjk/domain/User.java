package com.itjk.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

//lombock 快速开发实体类
//@Setter
//@Getter
//@ToString
//@NoArgsConstructor
//@EqualsAndHashCode
@Data
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    @JsonIgnore//不显示
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String address;
}
