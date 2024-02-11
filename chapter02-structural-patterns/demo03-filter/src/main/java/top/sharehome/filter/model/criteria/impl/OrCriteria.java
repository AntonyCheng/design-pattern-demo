package top.sharehome.filter.model.criteria.impl;

import top.sharehome.filter.model.Person;
import top.sharehome.filter.model.criteria.Criteria;

import java.util.List;

/**
 * 或规则判定实体类
 *
 * @author AntonyCheng
 */

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(personList);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(personList);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
