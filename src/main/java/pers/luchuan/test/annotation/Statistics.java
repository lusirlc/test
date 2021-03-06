package pers.luchuan.test.annotation;

import java.lang.annotation.*;

/**
 * 应用于切点表达式，该注解表示方法运行后访问量+1
 * Created By Lu Chuan On 2019/3/13
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Statistics {
}
