package com.stefz.hospital;


public class Secretary extends HospitalEmployee implements BaseSalary{

    private int call;

    public Secretary(int call, String firstName, String lastName, String id, String email, String mobile, String address, int workHours, double salary, int dayOff) {
        super(firstName, lastName, id, email, mobile, address, workHours, salary = BASE_SALARY_SECRETARY, dayOff);
        this.call = call;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "Secretary [call=" + call + ", getCall()=" + getCall() + ", getFirstName()=" + getFirstName()
                + ", getLastName()=" + getLastName() + ", getId()=" + getId() + ", getEmail()=" + getEmail()
                + ", getMobile()=" + getMobile() + ", getAddress()=" + getAddress() + ", getWorkHours()="
                + getWorkHours() + ", getSalary()=" + getSalary() + ", getDayOff()=" + getDayOff() + "]";
    }    
}
