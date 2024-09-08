package challenge_session_20.models;

import lombok.Data;

import java.util.UUID;

@Data
public class Volunteer {
    private UUID IDNr;
    private String name,emailAddress, eventInterestedIn;
    private byte phoneNo;
}
