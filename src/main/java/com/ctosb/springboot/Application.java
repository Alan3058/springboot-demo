
package com.ctosb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 官方建议一个项目建立一个package，不推荐使用默认包，使用默认包可能导致一些 问题（在使用 @ComponentScan, @EntityScan
 * or @SpringBootApplication注解的情况下）， 因为它会扫描所有的jar包。<br>
 * 官方建议main类放在其他类上面的根包中， @EnableAutoConfiguration 注解通常放于
 * main类中，它的意图是告诉springboot，根据您添加的jar依赖项，“猜测”您将如何配置Spring。<br>
 * 通常建议在main方法类上加上 @Configuration ，我们不需要在每个类上添加 @Configuration 注解，只需 使用 @Import
 * 注解去导入其他配置类即可。<br>
 * 如果一定要使用xml配置，官方建议应以 @Configuration 注解开始，然后在附加 @ImportResource 注解去加载xml配置。<br>
 * 使用 @ComponentScan 注解，springboot将可以自动发现所有的spring组件，包括 @Configuration 类。<br>
 * springboot还有另外一个注解 @SpringBootApplication，
 * 它等价于 @Configuration, @EnableAutoConfiguration and @ComponentScan 三个
 * 注解的组合。如下三个注解可直接使用 @SpringBootApplication 代替。<br>
 * @author liliangang-1163
 * @date 2017年8月31日下午4:30:07
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
