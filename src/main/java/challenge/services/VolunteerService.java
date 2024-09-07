package challenge.services;

import challenge.models.Volunteer;

import java.util.UUID;

public interface VolunteerService {

    Volunteer registerVolunteer(Volunteer newVolunteer);
    Volunteer showVolunteer(UUID idNr);

}
