package jpa.specification;

import jpa.entity.Group;
import jpa.entity.Group_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class GroupByRecruiting implements Specification<Group>{

    @Override
    public Predicate getPredicate(Root<Group> groupRoot, CriteriaBuilder builder) {
        return builder.isTrue(groupRoot.get(Group_.recruiting));
    }
}
