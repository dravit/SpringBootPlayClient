import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/*
@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		Coach coach = new Coach("dravit", "dravit.info@gmail.com", "2333333");

		return args -> {
			ResponseEntity<Coach> coachResponseEntity = restTemplate.postForEntity("http://localhost:8080/play/register", coach, Coach.class);
			log.info(coachResponseEntity.getBody().getName().toString());
		};
	}
}*/

public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		Coach coach = new Coach();
		coach.setName("arjun");
		coach.setEmail("arjun");
		coach.setMobile("arjun");
		Coach coachResponseEntity = restTemplate.postForObject("http://localhost:8080/play/register", coach, Coach.class);
		log.info(coachResponseEntity.getName().toString());
	}

}
