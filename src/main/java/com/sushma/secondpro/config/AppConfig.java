package com.sushma.secondpro.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.sushma.secondpro")
@EnableTransactionManagement
public class AppConfig {

}
