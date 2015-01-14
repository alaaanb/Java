package br.com.java.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application
{
	@Bean
	IMessageService mockMessageService()
	{
		return new IMessageService()
		{
			@Override
			public String getMessage()
			{
				return "Beatriz Maria";
			}
		};
	}

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

		MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);

		messagePrinter.printMessage();
	}
}
