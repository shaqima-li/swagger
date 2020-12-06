package com.jutixueyuan.pojo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 康师傅biangbiang面
 * @date 2020/12/6 15:10
 * 今天写完十万个Bug了吗？
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationWithmethod {
}
