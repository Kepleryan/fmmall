package com.qfedu.fmmall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /* swagger会帮助我们生成接口文档
    *  1.配置生成的文档信息
    *  2.配置生成规则*/

    // Docket封装接口文档信息
    @Bean
    public Docket getDocket(){

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("《fmmall》后端接口说明")
                .description("此文档详细说明了fmmall项目后端接口规范。。。")
                .version("v 2.0.1")
                .contact(new Contact("Kepler","abc","kepler_997@163.com"));
        // 如何获取一个接口/抽象类对象
        // new接口，需要在构造器后的{}实现接口中的所有抽线方法
        // new 子类/实现类
        // 工厂模式

        ApiInfo apiInfo = apiInfoBuilder.build();

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo) // 指定生成的文档中的封面信息：文档标题、版本、作者
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qfedu.fmmall.controller"))
                .paths(PathSelectors.any())
                .build();

        return docket;
    }
}
