package com.stefz.hospital;


public class Nurse extends HospitalEmployee implements BaseSalary {

    private int vacicne;

    public Nurse(int vacicne,String firstName, String lastName, String id, String email, String mobile, String address, int workHours,
            double salary, int dayOff) {
        super(firstName, lastName, id, email, mobile, address, workHours, salary=BASE_SALARY_NURSE, dayOff);
        this.vacicne = vacicne;
    }
    

    public int getVacicne() {
        return vacicne;
    }

    public void setVacicne(int vacicne) {
        this.vacicne = vacicne;
    }


    @Override
    public String toString() {
        return "Nurse [vacicne=" + vacicne + ", getVacicne()=" + getVacicne() + ", getFirstName()=" + getFirstName()
                + ", getLastName()=" + getLastName() + ", getId()=" + getId() + ", getEmail()=" + getEmail()
                + ", getMobile()=" + getMobile() + ", getAddress()=" + getAddress() + ", getWorkHours()="
                + getWorkHours() + ", getSalary()=" + getSalary() + ", getDayOff()=" + getDayOff() + "]";
    }

    @Override
    public  void baseSalary(){}
}


