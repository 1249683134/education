package com.education.domain;

import lombok.Data;

@Data
public class UserInfo {
    private String id;
    private String name;
    private String sex;
    private String birthday;
    private Integer home_id;
    private Integer state;
}
