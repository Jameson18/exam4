package jpa;

import jpa.entity.Alpinist;
import jpa.entity.Group;
import jpa.entity.Mountain;
import jpa.utils.HibernateUtils;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("entityManager");
        EntityManager manager = factory.createEntityManager();

        Group group = new Group();
        Mountain mountain = new Mountain();
        mountain.setName("Эльбрус");
        mountain.setCountry("Россия");
        mountain.setHeight(5100);
        group.setMountain(mountain);
        group.setRecruiting(true);
        group.setDateOfClimbing(LocalDate.of(2021, 3, 15));
        group.setDuration(14);
        Alpinist alpinist = new Alpinist();
        alpinist.setName("Dima");
        alpinist.setAge(30);
        alpinist.setAddress("Moscow");
        group.addAlpinist(alpinist);

        manager.getTransaction().begin();
        manager.persist(group);
        manager.getTransaction().commit();

    }
}
