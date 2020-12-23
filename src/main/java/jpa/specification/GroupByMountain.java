package jpa.specification;

import jpa.entity.Group;
import jpa.entity.Group_;
import jpa.entity.Mountain;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class GroupByMountain implements Specification<Group>{
    private Mountain mountain;

    public GroupByMountain(Mountain mountain) {
        this.mountain = mountain;
    }

    @Override
    public Predicate getPredicate(Root<Group> root, CriteriaBuilder builder) {
        return builder.like(root.get(Group_.mountain.getName()), mountain.getName());
    }
}
