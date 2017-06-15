package com.tutorial.fiveproblem;

import java.util.Date;

/**
 * Created by dandrunakievich on 6/15/2017.
 */
/*Create a class structure to implement structure of a company and it’s employees.

        Company should contain data about it’s name, date of foundation,
        director, domain of specialization, all employees, address,
        all contacts(phone, fax, web site …), all business partners (other companies).
        Employee should contain personal data, home address,
        all phone numbers, job name, salary, date of employment.
        */

public class PersonalData {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String sex;
    private String address;
    private Contact contact;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


}
