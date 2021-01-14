package com.example.boot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication(scanBasePackages = {"yxm.zyf.love","com.fire.foo","com.example.boot.service"})
public class BootApplication {
	private final static Logger LOGGER = Logger.getLogger(BootApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
		LOGGER.info("应用启动成功！202020202020202");
	}

}
