package challenge.controllers;

import challenge.models.Volunteer;
import challenge.services.VolunteerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
