package top.sharehome.filter;

import top.sharehome.filter.model.Person;
import top.sharehome.filter.model.criteria.Criteria;
import top.sharehome.filter.model.criteria.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器设计模式
 *
 * @author AntonyCheng
 */
public class FilterPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));
        System.out.println();

        System.out.println("Females: ");
        printPersons(female.meetCriteria(persons));
        System.out.println();

        System.out.println("Single Males: ");
        printPersons(singleMale.meetCriteria(persons));
        System.out.println();

        System.out.println("Single Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
        System.out.println();
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }

}
