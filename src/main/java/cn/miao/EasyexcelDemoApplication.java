package cn.miao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author miao
 */
@SpringBootApplication
@MapperScan("cn.miao.mapper")
public class EasyexcelDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyexcelDemoApplication.class, args);
    }

}
