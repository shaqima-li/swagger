package com.jutixueyuan.pojo;

import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.stereotype.Component;

/**
 * @author 康师傅biangbiang面
 * @date 2020/12/6 14:05
 * 今天写完十万个Bug了吗？
 */
@Component
public class Student {
    private String name;
    private Integer age;
    private String info;

    public Student() {
    }

    public Student(String name, Integer age, String info) {
        this.name = name;
        this.age = age;
        this.info = info;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", info = " + info + "}";
    }
}
