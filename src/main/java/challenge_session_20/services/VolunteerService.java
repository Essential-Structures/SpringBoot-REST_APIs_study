package challenge_session_20.services;

import challenge_session_20.models.Volunteer;

import java.util.UUID;

public interface VolunteerService {

    Volunteer registerVolunteer(Volunteer newVolunteer);
    Volunteer showVolunteer(UUID idNr);

}
