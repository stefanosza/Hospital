package com.stefz.hospital;

public class Doctor extends HospitalEmployee implements BaseSalary{

    private int incident;

    public Doctor(int incident, String firstName, String lastName, String id, String email, String mobile, String address, int workHours, double salary, int dayOff) {
        super(firstName, lastName, id, email, mobile, address, workHours, salary=BASE_SALARY_DOCTOR, dayOff);
        this.incident = incident;
    }

    public int getIncident() {
        return incident;
    }
    
    public void setIncident(int incident) {
        this.incident = incident;
    }

    @Override
    public String toString() {
        return "Doctor [incident=" + incident + ", getIncident()=" + getIncident() + ", getFirstName()="
                + getFirstName() + ", getLastName()=" + getLastName() + ", getId()=" + getId() + ", getEmail()="
                + getEmail() + ", getMobile()=" + getMobile() + ", getAddress()=" + getAddress() + ", getWorkHours()="
                + getWorkHours() + ", getSalary()=" + getSalary() + ", getDayOff()=" + getDayOff() + "]";
    }   
}