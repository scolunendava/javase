package com.tutorial.fiveproblem;

import java.util.List;

/*Create a class structure to implement structure of a company and it’s employees.

Company should contain data about it’s name, date of foundation,
director, domain of specialization, all employees, address, all
contacts(phone, fax, web site …), all business partners (other companies).
Employee should contain personal data, home address, all phone
 numbers, job name, salary, date of employment.

 */
public class Company {
   private String name;
   private String dateOfFoundation;
   private String director;
   private String domainOfSpecialization;
   private String address;
   List<Company> partners;
   List<Employee> employees;
   Contact contact;
}
