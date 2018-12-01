package no.hydra.julekalender.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Pakke {

    private Date date;

    public Pakke() {
    }

    public Pakke(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
