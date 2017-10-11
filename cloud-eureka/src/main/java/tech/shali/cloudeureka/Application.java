package tech.shali.cloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  启动类
 * @author wensimin
 *
 * 		基础配置
 */
@SpringBootApplication
@EnableEurekaServer
//@EnableZuulProxy
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
