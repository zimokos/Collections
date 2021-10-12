package ua.dp.zymokos.heorhii;

public class Employee extends Person {
    private String post;
    private Integer salary;

    public Employee() {
    }

    public Employee(String name, int year, int phoneNumber, String post, int salary) {
        super(name, year, phoneNumber);
        this.post = post;
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
