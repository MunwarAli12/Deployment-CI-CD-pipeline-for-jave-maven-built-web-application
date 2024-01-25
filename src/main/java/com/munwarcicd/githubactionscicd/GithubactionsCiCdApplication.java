package com.munwarcicd.githubactionscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
@RestController
public class GithubactionsCiCdApplication {
	@GetMapping
	public Object hello() {
		Map<String, String> object = new HashMap<>();
		object.put("name", "Munwar Ali");
		object.put("email", "munwaralijmd@gmail.com");
		return object;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubactionsCiCdApplication.class, args);
	}

}
//echo "# munwarrrrrrrr" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/MunwarAli12/munwarrrrrrrr.git
//git push -u origin main
