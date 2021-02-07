package cn.miao.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author miao
 */
@Data
public class UserVo {

    @ExcelProperty("用户名")
    private String name;

    @ExcelProperty("性别")
    private Boolean sex;

    @ExcelProperty("年龄")
    private Integer age;

    @ExcelProperty("手机号")
    private String phoneNumber;
}
