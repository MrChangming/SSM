package Mrchangming.spring.pojo;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/4
 */
public class Student implements Person{
    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private Double score;
    private Clazz clazz;
    private String[] hobby;
    private Map<String, Teacher> teachermap;

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }


    public Student(Integer sid, String sname, String gender, Integer age) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.age = age;
    }

    public Student(Integer sid, String sname, String gender, Double score) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.score = score;
    }

    public Student() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", clazz=" + clazz +
                ", hobby=" + Arrays.toString(hobby) +
                ", teachermap=" + teachermap +
                '}';
    }

    public Map<String, Teacher> getTeachermap() {
        return teachermap;
    }

    public void setTeachermap(Map<String, Teacher> teachermap) {
        this.teachermap = teachermap;
    }
}
