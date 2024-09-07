package challenge.controllers;

import challenge.models.Volunteer;
import challenge.services.VolunteerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class VolunteerController {

    private VolunteerService volunteerService;

    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @PostMapping("/api/volunteer")
    public ResponseEntity<Volunteer> registerVolunteer(@RequestBody Volunteer newVolunteer) {
        return ResponseEntity.ok(volunteerService.registerVolunteer(newVolunteer));
    }

    @GetMapping("/api/volunteer/{IDNr}")
    public ResponseEntity<Volunteer> getVolunteer ( Volunteer returnedVolunteer) {
        return ResponseEntity.ok(volunteerService.showVolunteer(returnedVolunteer.getIDNr()));
    }
}
