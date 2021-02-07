package cn.miao.entity;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author miao
 * @since 2021-02-07
 */
@Data
public class User {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String name;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 手机号
     */
    private String phoneNumber;
}
