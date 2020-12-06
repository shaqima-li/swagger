package com.jutixueyuan.controller;

import com.jutixueyuan.pojo.Teacher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 康师傅biangbiang面
 * @date 2020/12/6 14:49
 * 今天写完十万个Bug了吗？
 */
@RestController
@RequestMapping("/people")
public class SwaggerTeacherController {
    @PostMapping("/findTeacher")
    public Teacher findTeacher(Integer id,String name){
      return   new Teacher(1,"小静哥",18,13);

    }
}
