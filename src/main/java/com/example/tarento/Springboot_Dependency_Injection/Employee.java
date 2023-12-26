package com.example.tarento.Springboot_Dependency_Injection;



import java.util.List;


public class Employee {
    private String name;
    private int id;
    private String designation;
    private String doj;
    private List<String> skills;

    public Employee(String name, int id, String designation, String doj, List<String> skills) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.doj = doj;
        this.skills = skills;
    }

    public Employee() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Joining Date: " + doj);

        if (skills != null && !skills.isEmpty()) {
            System.out.println("Skills:");
            for (String skill : skills) {
                System.out.println("- " + skill);
            }
        }
    }
}



