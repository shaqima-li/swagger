package com.jutixueyuan.pojo;

import org.springframework.stereotype.Component;

/**
 * @author 康师傅biangbiang面
 * @date 2020/12/6 14:51
 * 今天写完十万个Bug了吗？
 */
@Component
public class Teacher {
    private Integer id;
    private String name;
    private Integer age;
    private Integer classRoom;

    public Teacher() {
    }

    public Teacher(Integer id, String name, Integer age, Integer classRoom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classRoom = classRoom;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * @return classRoom
     */
    public Integer getClassRoom() {
        return classRoom;
    }

    /**
     * 设置
     * @param classRoom
     */
    public void setClassRoom(Integer classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Teacher{id = " + id + ", name = " + name + ", age = " + age + ", classRoom = " + classRoom + "}";
    }
}
