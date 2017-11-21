package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Spring Boot的Web项目启动类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年11月19日 下午4:41:34
 * @version 1.0
 */
public class ServletInitializer extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		
		System.out.println("=====ServletInitializer======");
		/** 设置Application类 */
		builder.sources(Application.class);
		/** 设置横幅模式: 关闭 */
		builder.bannerMode(Mode.OFF);
		return builder;
	}
}
