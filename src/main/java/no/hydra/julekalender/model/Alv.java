package no.hydra.julekalender.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Alv {

    @Id
    private String id;
    private String navn;
    private List<Pakke> pakker;
    private String bildeUrl;

    private Double handikapp;

    public Alv() {
    }

    public Alv(String id, String navn, List<Pakke> pakker, String bildeUrl) {
        this.id = id;
        this.navn = navn;
        this.pakker = pakker;
        this.bildeUrl = bildeUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public List<Pakke> getPakker() {
        return pakker;
    }

    public void setPakker(List<Pakke> pakker) {
        this.pakker = pakker;
    }

    public Double getHandikapp() {
        return handikapp;
    }

    public void setHandikapp(Double handikapp) {
        this.handikapp = handikapp;
    }

    public String getBildeUrl() {
        return bildeUrl;
    }

    public void setBildeUrl(String bildeUrl) {
        this.bildeUrl = bildeUrl;
    }
}
