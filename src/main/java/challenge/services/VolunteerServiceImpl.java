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
    public Volunteer showVolunteer(String name) { //as f vrut sa il intorc dupa UUID
        for (Volunteer iterator : volunteersDataBase)
            if (iterator.getName().equals(name))
                return iterator;
                else throw new NoSuchElementException("No such volunteer");
                //ramane pt lectia de exceptii, de ce tipul asta de exceptie nu cere modificarea semnaturii clasei,
        // sau try/catch pe loc(pt ca e runtime/unchecked?)

        return null; //nu am stiut ce altceva sa returnez
    }
}
