package no.hydra.julekalender.model;

import org.springframework.data.annotation.Id;

public class DagensVinner {

    @Id
    private String id;
    private Alv alv;

    public DagensVinner() {
    }

    public DagensVinner(String id, Alv alv) {
        this.id = id;
        this.alv = alv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Alv getAlv() {
        return alv;
    }

    public void setAlv(Alv alv) {
        this.alv = alv;
    }
}
