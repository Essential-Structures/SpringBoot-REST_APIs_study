package challenge.services;

import challenge.models.Volunteer;

public interface VolunteerService {

    Volunteer registerVolunteer(Volunteer newVolunteer);
    Volunteer showVolunteer(String name);

}
