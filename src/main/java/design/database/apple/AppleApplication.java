package design.database.apple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "design.database.apple.mapper")
public class AppleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppleApplication.class, args);
	}

}
