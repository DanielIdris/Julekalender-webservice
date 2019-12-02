package no.hydra.julekalender.model;

import org.springframework.data.annotation.Id;

public class DagensVinner {

    @Id
    private String id;
    private Alv alv1;
    private Alv alv2;

    public DagensVinner() {
    }

    public DagensVinner(String id, Alv alv1, Alv alv2) {
        this.id = id;
        this.alv1 = alv1;
        this.alv2 = alv2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Alv getAlv1() {
        return alv1;
    }

    public void setAlv1(Alv alv1) {
        this.alv1 = alv1;
    }

    public Alv getAlv2() {
        return alv2;
    }

    public void setAlv2(Alv alv2) {
        this.alv2 = alv2;
    }
}
