package com.tutorial.fiveproblem;

import java.util.ArrayList;
import java.util.List;

/*Create a class structure to implement structure of a company and it’s employees.

Company should contain data about it’s name, date of foundation,
director, domain of specialization, all employees, address, all
contacts(phone, fax, web site …), all business partners (other companies).
Employee should contain personal data, home address, all phone
 numbers, job name, salary, date of employment.

 */

public class Company {

    private String dateOfFoundation;
    private String domainOfSpecialization;
    private String address;

    private List<Company> partners = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private Contact contact;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(String dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

    public String getDomainOfSpecialization() {
        return domainOfSpecialization;
    }

    public void setDomainOfSpecialization(String domainOfSpecialization) {
        this.domainOfSpecialization = domainOfSpecialization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Company> getPartners() {
        return partners;
    }

    public void setPartners(List<Company> partners) {
        this.partners = partners;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

}
