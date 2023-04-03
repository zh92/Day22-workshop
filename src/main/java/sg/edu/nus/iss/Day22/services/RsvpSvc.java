package sg.edu.nus.iss.Day22.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.Day22.models.Rsvp;
import sg.edu.nus.iss.Day22.repositories.RsvpRepo;

@Service
public class RsvpSvc {
    
    @Autowired
    private RsvpRepo rsvpRepo;

    public List<Rsvp> getAllRsvp() {
        return rsvpRepo.getAllRsvp();
    }
}
