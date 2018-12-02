package no.hydra.julekalender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class JulekalenderApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(JulekalenderApplication.class, args);
	}
}
