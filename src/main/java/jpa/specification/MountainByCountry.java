package jpa.specification;

import jpa.entity.Mountain;
import jpa.entity.Mountain_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class MountainByCountry implements Specification<Mountain>{
    private String country;

    public MountainByCountry(String country) {
        this.country = country;
    }

    @Override
    public Predicate getPredicate(Root<Mountain> mountainRoot, CriteriaBuilder builder) {
        return builder.like(mountainRoot.get(Mountain_.country), country);
    }
}
