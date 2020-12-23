package jpa.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "First_group")
public class Group extends BaseIdentity{

    @ManyToOne(cascade = {CascadeType.ALL})
    private Mountain mountain;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Alpinist> alpinistList = new ArrayList<>();
    private boolean recruiting;
    private LocalDate dateOfClimbing;
    private double duration;


    public void addAlpinist(Alpinist alpinist){
        alpinistList.add(alpinist);
    }

    public Mountain getMountain() {
        return mountain;
    }

    public void setMountain(Mountain mountain) {
        this.mountain = mountain;
    }

    public List<Alpinist> getAlpinistList() {
        return alpinistList;
    }

    public void setAlpinistList(List<Alpinist> alpinistList) {
        this.alpinistList = alpinistList;
    }

    public boolean isRecruiting() {
        return recruiting;
    }

    public void setRecruiting(boolean recruiting) {
        this.recruiting = recruiting;
    }

    public LocalDate getDateOfClimbing() {
        return dateOfClimbing;
    }

    public void setDateOfClimbing(LocalDate dateOfClimbing) {
        this.dateOfClimbing = dateOfClimbing;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
