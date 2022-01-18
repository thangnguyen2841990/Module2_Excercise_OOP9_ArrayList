package com.codegym;

public class Student {
    private String name;
    private String mssv;
    private String birthDay;
    private String className;

    public Student() {
    }

    public Student(String name, String mssv, String birthDay, String className) {
        this.name = name;
        this.mssv = mssv;
        this.birthDay = birthDay;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return getName()+", MSSV: "+getMssv()+", Ngày sinh: "+getBirthDay()+", Lớp: "+getClassName();
    }
}
