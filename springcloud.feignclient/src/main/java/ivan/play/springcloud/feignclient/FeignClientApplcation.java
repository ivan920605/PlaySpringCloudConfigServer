package ivan.play.springcloud.feignclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class FeignClientApplcation
{
	public static void main(String[] args)
	{
		new SpringApplicationBuilder(FeignClientApplcation.class).run(args);
	}
}
