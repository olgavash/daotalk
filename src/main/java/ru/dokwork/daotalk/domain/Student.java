package ru.dokwork.daotalk.domain;

import ru.dokwork.daotalk.dao.Identified;

import java.io.Serializable;
import java.util.Date;

/**
 * Объектное представление сущности Судент.
 */
public class Student implements Identified<Integer> {

    private Integer id = null;
    private String name;
    private String surname;
    private Date enrolmentDate;
    private Integer groupId;

    public Integer getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getEnrolmentDate() {
        return enrolmentDate;
    }

    public void setEnrolmentDate(Date enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
