package top.sharehome.filter.model.criteria.impl;

import top.sharehome.filter.model.Person;
import top.sharehome.filter.model.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 女性规则判定实体类
 *
 * @author AntonyCheng
 */

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersonList = new ArrayList<Person>();
        for (Person person : personList) {
            if("FEMALE".equalsIgnoreCase(person.getGender())){
                femalePersonList.add(person);
            }
        }
        return femalePersonList;
    }
}
