package pl.edu.wat.wcy.isi.hd.sourcehd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class SourceHdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SourceHdApplication.class, args);
	}
}
