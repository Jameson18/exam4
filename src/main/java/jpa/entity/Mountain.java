package jpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Mountain extends BaseIdentity{


    private String name;
    private String country;
    private int height;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Group> groupList;

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 4){
            throw new IllegalArgumentException("Название горы должно быть не менее 4 символов");
        }
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() < 4){
            throw new IllegalArgumentException("Название страны должно быть не менее 4 символов");
        }
        this.country = country;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 100){
            throw new IllegalArgumentException("Высота не менее 100");
        }
        this.height = height;
    }
}
