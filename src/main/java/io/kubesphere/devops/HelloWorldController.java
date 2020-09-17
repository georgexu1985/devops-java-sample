package io.kubesphere.devops;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {
	private static int count = 0;

    @RequestMapping("/hanyun/get")
    public String sayHello() {
		System.out.println("#####################################" + count++);
        return "Really appreciate your star, that's the power of our life.";
    }
}
