package com.example.chaos.monkey.errordemo;

import com.example.chaos.monkey.errordemo.component.DemoComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChaosMonkeyErrorDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ChaosMonkeyErrorDemoApplication.class, args);
		DemoComponent demoComponent = ctx.getBean(DemoComponent.class);
		demoComponent.sayHello();
	}

}
