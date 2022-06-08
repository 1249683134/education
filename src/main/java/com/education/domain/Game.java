package com.education.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Game {
    @TableId(value = "child_id")
    private String child_id;
    private Integer answers;
    private Integer accuracy;
}
