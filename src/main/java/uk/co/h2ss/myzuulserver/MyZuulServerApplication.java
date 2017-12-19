package uk.co.h2ss.myzuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MyZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyZuulServerApplication.class, args);
	}
}
