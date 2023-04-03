package sg.edu.nus.iss.Day22.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sg.edu.nus.iss.Day22.services.RsvpSvc;


@SpringBootApplication
public class Day22WorkshopApplication implements CommandLineRunner {

	@Autowired
	private RsvpSvc rsvpSvc;
	public static void main(String[] args) {
		SpringApplication.run(Day22WorkshopApplication.class, args);
	}

	@Override
	public void run(String...args) {
		System.out.println(rsvpSvc.getAllRsvp());
	}

}
