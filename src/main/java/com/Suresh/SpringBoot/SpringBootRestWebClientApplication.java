package com.Suresh.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringBootRestWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestWebClientApplication.class, args);
		String url = "https://quoters.apps.pcfone.io/api/random";
		WebClient webClient = WebClient.create();
		
		String block = webClient.get()
		.uri(url)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve()
		.bodyToMono(String.class)
		.block();
		
		System.out.println("****************");
		System.out.println(block);
	}

}
