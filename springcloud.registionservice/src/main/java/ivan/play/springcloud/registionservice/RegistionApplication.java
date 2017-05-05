package ivan.play.springcloud.registionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello Eureka
 * @author lchen283
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistionApplication
{

	public static void main(String[] args) throws Exception
	{
		SpringApplication.run(RegistionApplication.class, args);
	}

}
