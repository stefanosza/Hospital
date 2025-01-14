/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import com.stefz.hospital.Doctor;
import com.stefz.hospital.Nurse;
import com.stefz.hospital.RestDaysController;
import com.stefz.hospital.SalaryController;
import com.stefz.hospital.Secretary;
import com.stefz.hospital.SurgeonDoctor;

/**
 *
 * @author stefz
 */
public class RunDemo {

    public RunDemo() {

        main();
    }

    private void main() {

        Doctor d1 = new Doctor(100, "Doctor1", "Doctor_1", "00001", "doctor1@hospital.com", "0123456789", "Greece", 40, 0, 0);
        Doctor d2 = new Doctor(50, "Doctor2", "Doctor_2", "00002", "doctot2@hospital.com", "0012345678", "Greece", 40, 0, 0);
        Doctor d3 = new Doctor(10, "Doctor3", "Doctor_3", "00003", "doctot3@hospital.com", "0001234567", "Greece", 40, 0, 0);

        SurgeonDoctor sd1 = new SurgeonDoctor(50, "Surgeon1", "Surgeon_1", "10000", "surgeon1@hospital.com", "1000123456", "Greece", 40, 0, 0);
        SurgeonDoctor sd2 = new SurgeonDoctor(10, "Surgeon2", "Surgeon_2", "10001", "surgeon2@hospital.com", "1000123457", "Greece", 40, 0, 0);

        Nurse n1 = new Nurse(100, "Nurse1", "Nurse_1", "20000", "nurse1@hospital.com", "2000036547", "Greece", 40, 0, 0);
        Nurse n2 = new Nurse(50, "Nurse2", "Nurse_2", "20001", "nurse2@hospital.com", "2000036548", "Greece", 40, 0, 0);
        Nurse n3 = new Nurse(10, "Nurse3", "Nurse_3", "20002", "nurse3@hospital.com", "2000036549", "Greece", 40, 0, 0);

        Secretary s1 = new Secretary(100, "Secretary1", "Secretary_1", "30000", "secretary1@hospital.com", "3000012345", "Greece", 40, 0, 0);
        Secretary s2 = new Secretary(50, "Secretary2", "Secretary_2", "30001", "secretary2@hospital.com", "3000012346", "Greece", 40, 0, 0);
        Secretary s3 = new Secretary(10, "Secretary3", "Secretary_3", "30002", "secretary3@hospital.com", "3000012347", "Greece", 40, 0, 0);

        RestDaysController restdays = new RestDaysController();
        SalaryController salary = new SalaryController();

        System.out.println("-------------------------------------------------");

        restdays.totalRest(d1);
        salary.totalSalary(d1);

        System.out.println("-------------------------------------------------");

        restdays.totalRest(d2);
        salary.totalSalary(d2);

        System.out.println("-------------------------------------------------");

        restdays.totalRest(d3);
        salary.totalSalary(d3);

        System.out.println("-------------------------------------------------");

        restdays.totalRest(sd1);
        salary.totalSalary(sd1);

        System.out.println("-------------------------------------------------");

        restdays.totalRest(sd2);
        salary.totalSalary(sd2);

        System.out.println("-------------------------------------------------");

        restdays.totalRest(n1);
        salary.totalSalary(n1);

        System.out.println("-------------------------------------------------");

        restdays.totalRest(n2);
        salary.totalSalary(n2);

        System.out.println("-------------------------------------------------");

        restdays.totalRest(n3);
        salary.totalSalary(n3);

        System.out.println("-------------------------------------------------");

        restdays.totalRest(s1);
        salary.totalSalary(s1);

        System.out.println("-------------------------------------------------");

        restdays.totalRest(s2);
        salary.totalSalary(s2);

        System.out.println("-------------------------------------------------");

        restdays.totalRest(s3);
        salary.totalSalary(s3);

        System.out.println("-------------------------------------------------");

    }
}
