package challenge.services;

import challenge.models.Volunteer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;


@Slf4j
@Service
public class VolunteerServiceImpl implements VolunteerService {

    public List<Volunteer> volunteersDataBase = new ArrayList<>();

    @Override
    public Volunteer registerVolunteer(Volunteer newVolunteer) {

        newVolunteer.setIDNr(UUID.randomUUID());
        volunteersDataBase.add(newVolunteer);
        log.info("Volunteer with ID {} successfully added", newVolunteer.getIDNr());
        return newVolunteer;
    }

    @Override
    public Volunteer showVolunteer(UUID IDNr) {
        for (Volunteer iterator : volunteersDataBase)
            if (iterator.getIDNr()==IDNr)
                return iterator;
                else throw new NoSuchElementException("No such volunteer");


        return null; //nu am stiut ce altceva sa returnez
    }
}
