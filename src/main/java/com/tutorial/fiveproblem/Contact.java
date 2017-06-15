package com.tutorial.fiveproblem;

/*Create a class structure to implement structure of a company and it’s employees.

Company should contain data about it’s name, date of foundation,
 director, domain of specialization, all employees, address,
  all contacts(phone, fax, web site …), all business partners (other companies).
Employee should contain personal data, home address,
 all phone numbers, job name, salary, date of employment.

 */

public class Contact {

    private String phone;
    private String fax;
    private String mobilePhone;
    private String webSite;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
