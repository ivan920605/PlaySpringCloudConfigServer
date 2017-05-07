package ivan.play.springcloud.feignclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
	@Autowired
	private EurekaClient eurekaClient;

	@RequestMapping(value = "/hello")
	public String HelloFeignService()
	{
		return "Welcome to feign service!";
	}

	@RequestMapping(value = "/books/listall")
	public List<String> listJavaBooks()
	{
		return eurekaClient.listJavaBooks();
	}
}
