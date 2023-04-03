package sg.edu.nus.iss.Day22.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.Day22.models.Rsvp;
import sg.edu.nus.iss.Day22.services.RsvpSvc;

@RestController
@RequestMapping(path ="/api/rsvps")
public class RsvpController {
    
    @Autowired
    private RsvpSvc rsvpSvc;

    @GetMapping
    public List<Rsvp> getAllRsvp() {
        return rsvpSvc.getAllRsvp();
    }
}
