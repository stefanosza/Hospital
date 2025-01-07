/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.stefz.hospital;

/**
 *
 * @author stefz
 */
public class Hospital {

    public static void main(String[] args) {
           
        Doctor d1 = new Doctor(100, "stef", "stef", "stef", "stef", "stef", "stef", 30, 0, 0);
        Doctor d2 = new Doctor(50, "stef", "stef", "stef", "stef", "stef", "stef", 30, 0, 0);
        Doctor d3 = new Doctor(10, "stef", "stef", "stef", "stef", "stef", "stef", 30, 0, 0);
        SurgeonDoctor sd1 = new SurgeonDoctor(10, 10, "stef", "stef", "stef", "stef", "stef", "stef", 30, 0, 0);

        RestController r1 = new RestController();
        r1.totalRest(d1);
        r1.totalRest(d2);
        r1.totalRest(d3);

        SalaryController sal1 = new SalaryController();
        sal1.totalSalary(d3);
        sal1.totalSalary(sd1);


    
    }
}
