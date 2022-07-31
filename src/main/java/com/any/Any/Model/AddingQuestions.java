package com.any.Any.Model;

import javax.persistence.*;

@Entity
@Table(name = "jobsInfo", schema = "public")
public class AddingQuestions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String quesJoint;
    private String diplom;
    private String opyt;
    private String info;
    private String course;
    private String univer;

    public AddingQuestions(String name, String quesJoint, String diplom, String opyt, String info, String course, String univer) {
        this.name = name;
        this.quesJoint = quesJoint;
        this.diplom = diplom;
        this.opyt = opyt;
        this.info = info;
        this.course = course;
        this.univer = univer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuesJoint() {
        return quesJoint;
    }

    public void setQuesJoint(String quesJoint) {
        this.quesJoint = quesJoint;
    }

    public String getDiplom() {
        return diplom;
    }

    public void setDiplom(String diplom) {
        this.diplom = diplom;
    }

    public String getOpyt() {
        return opyt;
    }

    public void setOpyt(String opyt) {
        this.opyt = opyt;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getUniver() {
        return univer;
    }

    public void setUniver(String univer) {
        this.univer = univer;
    }

    public AddingQuestions() {
    }

}