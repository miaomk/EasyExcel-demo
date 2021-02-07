package cn.miao.controller;

import cn.miao.entity.User;
import cn.miao.service.IUserService;
import cn.miao.vo.UserVo;
import com.alibaba.excel.EasyExcel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author miao
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private IUserService userService;

    @RequestMapping("/request")
    private String test() {
        return "ok";
    }

    @RequestMapping("/download")
    private void download(HttpServletResponse response) {
        List<User> list = userService.list();

        // 写法1
        String fileName = System.currentTimeMillis() + ".xlsx";
        try {

            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xls");
            ServletOutputStream out = response.getOutputStream();

            EasyExcel.write(response.getOutputStream(), UserVo.class)
                    .sheet("sheet")
                    .doWrite(list);

        } catch (IOException e) {

            throw new RuntimeException("导出文件失败！");
        }

    }
}
