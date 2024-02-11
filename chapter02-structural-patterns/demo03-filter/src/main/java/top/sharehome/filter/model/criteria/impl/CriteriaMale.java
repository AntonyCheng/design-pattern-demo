package top.sharehome.filter.model.criteria.impl;

import top.sharehome.filter.model.Person;
import top.sharehome.filter.model.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 男性规则判定实体类
 *
 * @author AntonyCheng
 */

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersonList = new ArrayList<Person>();
        for (Person person : personList) {
            if("MALE".equalsIgnoreCase(person.getGender())){
                malePersonList.add(person);
            }
        }
        return malePersonList;
    }
}
