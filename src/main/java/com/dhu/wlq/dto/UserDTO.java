package com.dhu.wlq.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by wanglongqing on 2018/2/1.
 */

@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 6704894643561703635L;

    private String username;
    private String password;

}
