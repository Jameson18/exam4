package jpa.specification;

import jpa.entity.Alpinist;
import jpa.entity.Alpinist_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class AlpAgePeriod implements Specification<Alpinist> {
    private int from;
    private int to;

    public AlpAgePeriod(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Predicate getPredicate(Root<Alpinist> alpinistRoot, CriteriaBuilder builder) {
        return builder.between(alpinistRoot.get(Alpinist_.AGE), from, to);
    }
}
