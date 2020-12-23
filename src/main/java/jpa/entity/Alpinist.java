package jpa.entity;

import javax.persistence.*;

@Entity(name = "Alpinists")
public class Alpinist extends BaseIdentity{
    private String name;
    private String address;
    private int age;

    @OneToOne(cascade = {CascadeType.ALL})
    private Group group;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3){
            throw new IllegalArgumentException("Имя должно быть не менее 3 символов");
        }
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() < 5){
            throw new IllegalArgumentException("Адрес должен быть не менее 5 символов");
        }
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18){
            throw new IllegalArgumentException("Возраст 18+");
        }
        this.age = age;
    }
}
