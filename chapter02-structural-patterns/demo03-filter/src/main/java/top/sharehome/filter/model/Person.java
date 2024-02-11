package top.sharehome.filter.model;

/**
 * 人实体类
 *
 * @author AntonyCheng
 */

public class Person {

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 婚姻状况
     */
    private String maritalStatus;

    /**
     * 全参构造器
     */
    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
