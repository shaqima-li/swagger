package com.jutixueyuan.swaggerConfig;

import com.jutixueyuan.pojo.AnnotationWithmethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author 康师傅biangbiang面
 * @date 2020/12/6 14:39
 * 今天写完十万个Bug了吗？
 */
@Configuration
public class Myconfig {

    @Bean
    public Docket getDocket(){
     return   new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(swaggerDemoApiInfo())
                .select()
//             展示该包下面的方法
                .apis(RequestHandlerSelectors.basePackage("com.jutixueyuan.testController"))
            //             展示标注了该注解的方法
//                .apis(RequestHandlerSelectors.withMethodAnnotation(AnnotationWithmethod.class))
                .build();
    }

    private ApiInfo swaggerDemoApiInfo() {
       return new ApiInfoBuilder()
                .contact(new Contact("巨梯学院","http://www.jutixueyuan.com","12345@qq.com"))
                .title("项目文档")
//               描述
               .description("学习java的地方")
               .version("1.0.0")
                .build();
    }
}
