package io.kubesphere.devops;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/hanyun/api/v1")
public class HelloWorldController {
	private static int count = 0;

    @RequestMapping("/getname")
    public String sayHello() {
		System.out.println("#####################################  /hanyun/api/v1/getname");
        return "Really appreciate your star, that's the power of our life.";
    }

}
