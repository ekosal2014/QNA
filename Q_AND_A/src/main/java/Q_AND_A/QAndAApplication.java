package Q_AND_A;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Q_AND_A.kh.com.utils.UtilConfig;

@SpringBootApplication
public class QAndAApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(QAndAApplication.class, args);
		UtilConfig.load("C:\\Users\\Mango\\git\\QNA\\Q_AND_A\\src\\main\\resources\\config.properties");
		
	}
}
