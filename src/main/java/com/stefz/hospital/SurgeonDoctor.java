package com.stefz.hospital;

public class SurgeonDoctor extends HospitalEmployee implements BaseSalary{
    
    private int surgery;

    public SurgeonDoctor(int surgery, String firstName, String lastName, String id, String email, String mobile, String address, int workHours, double salary, int dayOff) {
        super(firstName, lastName, id, email, mobile, address, workHours, salary=BASE_SALARY_SURGEONDOCTOR, dayOff);
        this.surgery = surgery;
    }

    public int getSurgery() {
        return surgery;
    }

    public void setSurgery(int surgery) {
        this.surgery = surgery;
    }

    @Override
    public String toString() {
        return "SurgeonDoctor [surgery=" + surgery + ", getSurgery()=" + getSurgery() + ", getFirstName()="
                + getFirstName() + ", getLastName()=" + getLastName() + ", getId()=" + getId() + ", getEmail()="
                + getEmail() + ", getMobile()=" + getMobile() + ", getAddress()=" + getAddress() + ", getWorkHours()="
                + getWorkHours() + ", getSalary()=" + getSalary() + ", getDayOff()=" + getDayOff() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }
}
