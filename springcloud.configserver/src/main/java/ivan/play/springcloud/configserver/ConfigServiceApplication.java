package ivan.play.springcloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello Spring Cloud Config Server!
 * 
 * @author lchen283
 */

@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}
