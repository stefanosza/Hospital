package com.stefz.hospital;

public class SurgeonDoctor extends Doctor {
    
    private int surgery;

    public SurgeonDoctor(int surgery, int incident, String firstName, String lastName, String id, String email, String mobile, String address, int workHours, double salary, int dayOff) {
        super(incident, firstName, lastName, id, email, mobile, address, workHours, salary, dayOff);
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
        return "SurgeonDoctor [surgery=" + surgery + ", getSurgery()=" + getSurgery() + ", getIncident()="
                + getIncident() + ", toString()=" + super.toString() + ", getFirstName()=" + getFirstName()
                + ", getLastName()=" + getLastName() + ", getId()=" + getId() + ", getEmail()=" + getEmail()
                + ", getMobile()=" + getMobile() + ", getAddress()=" + getAddress() + ", getWorkHours()="
                + getWorkHours() + ", getSalary()=" + getSalary() + ", getDayOff()=" + getDayOff() + "]";
    }

}
