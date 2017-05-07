package ivan.play.springcloud.eurekaclient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller
{
	@RequestMapping(value = "/hello")
	public String hello()
	{
		return "Welcome to EurekaClient!";
	}

	@RequestMapping(value = "/books/list")
	public List<String> listJavaBooks()
	{
		List<String> books = new ArrayList<>(2);
		Collections.addAll(books, "Thinking in Java", "Spring In Action");
		return books;
	}
}
