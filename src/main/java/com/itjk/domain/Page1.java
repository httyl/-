package com.itjk.domain;
import lombok.Data;
import java.util.List;

@Data
public class Page1 {
    private List<User> records;//返回的数据
    private long size;//每页多少条
    private long current; //页码
    private Integer pages;//总页数
    private Integer total;//总数据条数

}
