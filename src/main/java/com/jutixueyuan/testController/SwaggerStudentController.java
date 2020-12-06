package com.jutixueyuan.testController;

import com.jutixueyuan.pojo.AnnotationWithmethod;
import com.jutixueyuan.pojo.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author 康师傅biangbiang面
 * @date 2020/12/6 14:03
 * 今天写完十万个Bug了吗？
 */
@RestController
@RequestMapping("/peple")
@Api(tags = "学生api")
public class SwaggerStudentController {
    @GetMapping("/findStudent")
    public Student findStudent(Student student){

        student.setName("xiaoming");
        student.setAge(15);
        student.setInfo("好好学习");

        return student;
    }
    @ApiIgnore//表示该方法被忽略
    @AnnotationWithmethod//自定义注解
    @PostMapping("/listStudent")
    public Student listStudent(@ApiParam(name = "学号",required = true) Integer id,@ApiParam(name = "学生姓名",required = true) String name){
        return new Student("qumingzhu",18,"好好学习");
    }
}
