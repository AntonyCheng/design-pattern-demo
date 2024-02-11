package top.sharehome.filter.model.criteria.impl;

import top.sharehome.filter.model.Person;
import top.sharehome.filter.model.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 单身规则判定实体类
 *
 * @author AntonyCheng
 */

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersonList = new ArrayList<Person>();
        for (Person person : personList) {
            if("SINGLE".equalsIgnoreCase(person.getMaritalStatus())){
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
