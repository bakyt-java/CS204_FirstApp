package alatoo.kg.CS204_FirstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication


public class Cs204FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cs204FirstAppApplication.class, args);
	}
	@GetMapping("/")
	public String b1(){
		return "HelloWorld";
	}

}
