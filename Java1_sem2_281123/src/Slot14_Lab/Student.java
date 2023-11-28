package Slot14_Lab;

public class Student {
    private int id;
    private String name;
    private String date;
    private String address;
    private double gpa;

    public Student(int id, String name, String date, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Date of Birth: " + date+ ", Address: " + address + ", GPA: " + gpa;
    }
}