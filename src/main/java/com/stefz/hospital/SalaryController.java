package com.stefz.hospital;


public class SalaryController {

    private double total_salary;
    private double extra_salary;


    public void totalSalary(Object o){
        if(o instanceof Doctor){
            Doctor d = (Doctor) o;
            extra_salary=0;
            extra_salary = 50 * d.getIncident();
            total_salary = d.getSalary() + extra_salary;
            System.out.println(d.getFirstName() + " " + d.getLastName()+ " with id: " + d.getId() + " has " + total_salary + " Euro TOTAL");
            }
        if(o instanceof SurgeonDoctor){
            SurgeonDoctor sd= (SurgeonDoctor) o;
            extra_salary=0;
            extra_salary = 1000 * sd.getSurgery();
            total_salary = sd.getSalary() + extra_salary ;
            System.out.println(sd.getFirstName() + " " + sd.getLastName()+ " with id: " + sd.getId() + " has " + total_salary + " Euro EXTRA");
        }
        if(o instanceof Nurse){
            Nurse n = (Nurse) o;
            extra_salary=0;
            extra_salary=20*n.getVacicne();
            total_salary= n.getSalary() + extra_salary;
            System.out.println(n.getFirstName() + " " + n.getLastName()+ " with id: " + n.getId() + " has " + total_salary + " Euro TOTAL");
        }
        if(o instanceof Secretary){
            Secretary s = (Secretary) o;
            extra_salary=0;
            extra_salary=10*s.getCall();
            total_salary= s.getSalary() + extra_salary;
            System.out.println(s.getFirstName() + " " + s.getLastName()+ " with id: " + s.getId() + " has " + total_salary + " Euro TOTAL");

        }
    }
}
