package ivan.play.springcloud.feignclient;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("HelloEurekaClient")
public interface EurekaClient
{
	@RequestMapping(value = "/books/list")
	List<String> listJavaBooks();
}
