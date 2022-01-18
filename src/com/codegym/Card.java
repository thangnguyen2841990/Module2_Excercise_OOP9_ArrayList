package com.codegym;

public class Card {
    private int number;
    private String toDate;
    private String formDate;
    private String idOfBook;
    private Student student;

    public Card() {
    }

    public Card(int number, String toDate, String formDate, String idOfBook, Student student) {
        this.number = number;
        this.toDate = toDate;
        this.formDate = formDate;
        this.idOfBook = idOfBook;
        this.student = student;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getIdOfBook() {
        return idOfBook;
    }

    public void setIdOfBook(String idOfBook) {
        this.idOfBook = idOfBook;
    }

    public Student getstudent() {
        return student;
    }

    public void setstudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Thông tin sinh viên: "+ student.toString()+"\n"+
                "Số phiếu: "+ getNumber()+", Ngày mượn: "+getToDate()+", Hạn trả: "+getFormDate()+", Số hiệu sách: "+
                getIdOfBook();
    }
}
