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

    @RequestMapping("/")
    public String sayHello() {
		System.out.println("#####################################  /hanyun/api/v1/getname");
        return "#####################################  /hanyun/api/v1/getname.";
    }

}
