package org.masterwill.tollstation.com.tollstationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TollStationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TollStationSystemApplication.class, args);
	}
}
