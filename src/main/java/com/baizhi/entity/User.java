package com.baizhi.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
}
