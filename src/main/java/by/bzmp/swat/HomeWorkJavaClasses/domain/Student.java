package by.bzmp.swat.HomeWorkJavaClasses.domain;

public class Student {

    private String secondName;

    private String firstName;

    private String middleName;

    private String address;

    private String group;

    private String faculty;

    private int phoneNumber;

    private int id;

    private int course;

    private int dayOfBirth;

    private int monthOfBirth;

    private int yearOfBirth;

    public Student(String secondName, String firstName, String middleName, String address, String group, String faculty, int phoneNumber, int id, int course, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.group = group;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.course = course;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", group='" + group + '\'' +
                ", faculty='" + faculty + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", id=" + id +
                ", course=" + course +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfMonth=" + yearOfBirth +
                '}';
    }
}
