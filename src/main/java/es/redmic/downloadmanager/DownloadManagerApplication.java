package es.redmic.downloadmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "es.redmic.downloadmanager" })
public class DownloadManagerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DownloadManagerApplication.class, args);
	}
}
