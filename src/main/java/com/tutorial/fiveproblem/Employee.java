package com.tutorial.fiveproblem;

/*Create a class structure to implement structure of a company and it’s employees.

Company should contain data about it’s name, date of foundation,
director, domain of specialization, all employees, address,
 all contacts(phone, fax, web site …), all business partners (other companies).
Employee should contain personal data, home address,
 all phone numbers, job name, salary, date of employment.

 */

import java.util.Date;

public class Employee {

    private String salary;
    private String jobName;
    private Date dateOfEmployment;
    private Company companyName;
    private PersonalData personalData;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Company getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Company companyName) {
        this.companyName = companyName;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }
}
