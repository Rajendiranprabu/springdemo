package com.manipal.restdemo.demo;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
@EnableEurekaClient
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
@Bean
public LocaleResolver localeResolver()
{
	SessionLocaleResolver localeResolver=new SessionLocaleResolver();
	localeResolver.setDefaultLocale(Locale.US);
	return localeResolver;
	
}

@Bean
public ResourceBundleMessageSource messageSource()
{
	ResourceBundleMessageSource bundleSource= new ResourceBundleMessageSource();
	bundleSource.setBasename("message");
	return bundleSource;
}

}
