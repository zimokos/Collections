package ua.dp.zymokos.heorhii;

public abstract class Person {
    protected String name;
    protected Integer year;
    protected Integer phoneNumber;

    public Person() {
    }

    public Person(String name, int year, int phoneNumber) {
        this.name = name;
        this.year = year;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
