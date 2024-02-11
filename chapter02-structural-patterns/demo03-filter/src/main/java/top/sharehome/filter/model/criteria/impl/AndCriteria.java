package top.sharehome.filter.model.criteria.impl;

import top.sharehome.filter.model.Person;
import top.sharehome.filter.model.criteria.Criteria;

import java.util.List;

/**
 * 与规则判定实体类
 *
 * @author AntonyCheng
 */

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersonList = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(firstCriteriaPersonList);
    }
}
