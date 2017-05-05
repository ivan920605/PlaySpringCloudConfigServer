package ivan.play.springcloud.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Spring Cloud Config Server!
 * 
 * @author lchen283
 */

@EnableConfigServer
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ConfigServiceApplication
{
	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${spring.application.description}")
	private String applicationDescription;

	public static void main(String[] args)
	{
		SpringApplication.run(ConfigServiceApplication.class, args);
	}
	
	
	@RequestMapping("/hello")
	public String HelloSpringCloudServerApp()
	{
		return applicationDescription;
	}

}
