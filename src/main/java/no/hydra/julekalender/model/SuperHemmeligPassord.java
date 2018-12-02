package no.hydra.julekalender.model;

import org.springframework.data.annotation.Id;

public class SuperHemmeligPassord {

    @Id
    private String Id;

    private String passord;

    public SuperHemmeligPassord() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }
}
