package top.sharehome.filter.model.criteria;

import top.sharehome.filter.model.Person;

import java.util.List;

/**
 * 判断接口
 *
 * @author AntonyCheng
 */

public interface Criteria {

    /**
     * 判断方法
     * 将参数中的Person按照一定规则过滤出来
     */
    List<Person> meetCriteria(List<Person> personList);

}
