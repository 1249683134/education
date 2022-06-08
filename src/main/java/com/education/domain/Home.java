package com.education.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Home {
    @TableId(value = "home_id", type = IdType.AUTO)
    private Integer home_id;
    private String home_password;
    private String home_name;
}
