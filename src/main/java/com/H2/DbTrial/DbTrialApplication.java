package com.H2.DbTrial;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.H2.DbModels.User;
import com.H2.Repositories.UserRepo;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan("com.H2.DbModels")
@EnableJpaRepositories("com.H2.Repositories")
@ComponentScan(basePackages = { "com.H2.DbModels", "com.H2.DbTrial"} )
@EnableSwagger2
public class DbTrialApplication {

	public static void main(String[] args) {
		
//		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(DbTrialApplication.class, args);
				
				
		
//		UserRepo userRepo = configurableApplicationContext.getBean(UserRepo.class);
//		RoleRepo roleRepo = configurableApplicationContext.getBean(RoleRepo.class);
//		Role role1 = new Role("1");
//		Role role2 = new Role("2");
//		User user = new User("jack", "pass");
//		user.setRoles(Arrays.asList(role1));
//		userRepo.save(user);
//		User user2 = new User("bob", "pass");
//		user2.setRoles(Arrays.asList(role1));
//		userRepo.save(user2);
//		User user3 = new User("apple", "pass");
//		user3.setRoles(Arrays.asList(role2));
//		userRepo.save(user3);
//		User user4 = new User("glaxo", "pass");
//		user4.setRoles(Arrays.asList(role2));
//		userRepo.save(user4);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
						.select()
						.apis(RequestHandlerSelectors.any())
						.paths(PathSelectors.ant("api/*"))
						.build();
	}

}
