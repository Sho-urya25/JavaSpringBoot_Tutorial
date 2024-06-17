package org.task.two.demo.model;

public class Employee {

    public Employee() {
    }

    public Employee(
            Integer employee_id, String firstName,
            String lastName, String email, String title) {

        super();

        this.employee_id = employee_id;

        this.first_Name = firstName;

        this.last_Name = lastName;

        this.email = email;
        this.title = title;

    }

    private Integer employee_id;

    private String first_Name;

    private String last_Name;

    private String email;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Overriding the toString method
    // to find all the values
    @Override
    public String toString() {
        // “employee_id”: “string”,

        // “first_name”: “string”,

        // “last_name”: “string”,

        // “email”: “string”,

        // “title”: “string”

        return "Employee [id="
                + employee_id + ", firstName="
                + first_Name + ", lastName="
                + last_Name + ", email="
                + email + "title=" + title + "]";

    }

    // Getters and setters of
    // the properties
    public Integer getId() {

        return employee_id;
    }

    public void setId(Integer employee_id) {

        this.employee_id = employee_id;
    }

    public String getFirstName() {

        return first_Name;
    }

    public void setFirstName(
            String firstName) {

        this.first_Name = firstName;
    }

    public String getLastName() {

        return last_Name;
    }

    public void setLastName(
            String lastName) {

        this.last_Name = lastName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
}