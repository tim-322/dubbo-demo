package com.hooper.model;

import lombok.*;

import java.io.Serializable;

/**
 * @author Tim Hooper
 * @version 1.0
 * @time 2023/04/10/21:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;

    //生成序列化ID
    private static final long serialVersionUID = 1L;
}
