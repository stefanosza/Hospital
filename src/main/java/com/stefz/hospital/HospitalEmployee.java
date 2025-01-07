
package com.stefz.hospital;

public  abstract class HospitalEmployee implements Rest{
    
    private String firstName;
    private String lastName;
    private String id;
    private String email;
    private String mobile;
    private String address;
    private int workHours;
    private double salary;
    private int dayOff;

    public HospitalEmployee (String firstName, String lastName, String id, String email, String mobile, String address,
            int workHours, double salary, int dayOff) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.workHours = workHours;
        this.salary = salary;
        this.dayOff = STANDARD_REST;
    }
    
    public HospitalEmployee() {
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public int getWorkHours() {
        return workHours;
    }

    public double getSalary() {
        return salary;
    }

    public int getDayOff() {
        return dayOff;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }

    @Override
    public String toString() {
        return "HospitalEmployee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", email=" + email
                + ", mobile=" + mobile + ", address=" + address + ", workHours=" + workHours + ", salary=" + salary
                + ", dayOff=" + dayOff + "]";
    }

    @Override
    public void standardRest(){
       
    }
}
