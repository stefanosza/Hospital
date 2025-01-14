package com.stefz.hospital;

public class SalaryController {

    private double total_salary;
    private double extra_salary = 0;

    private String output(Object o, double totalSalary) {

        StringBuilder strBuilder = new StringBuilder();

        HospitalEmployee employee = new HospitalEmployee() {};

        if (o instanceof Doctor) {
            employee = (Doctor) o;
        }
        if (o instanceof SurgeonDoctor) {
            employee = (SurgeonDoctor) o;
        }
        if (o instanceof Nurse) {
            employee = (Nurse) o;
        }
        if (o instanceof Secretary) {
            employee = (Secretary) o;
        }

        strBuilder.append(employee.getFirstName())
                .append(" ")
                .append(employee.getLastName())
                .append(" with id:")
                .append(employee.getId())
                .append(" has ")
                .append(totalSalary)
                .append(" Euro TOTAL")
                .append(employee.getDayOff());
                

        return strBuilder.toString();
    }

    public void totalSalary(Object o) {
        if (o instanceof Doctor) {
            Doctor d = (Doctor) o;
            extra_salary = 50 * d.getIncident();
            total_salary = d.getSalary() + extra_salary;
            System.out.println(output(d, total_salary));
        }
        if (o instanceof SurgeonDoctor) {
            SurgeonDoctor sd = (SurgeonDoctor) o;
            extra_salary = 1000 * sd.getSurgery();
            total_salary = sd.getSalary() + extra_salary;
            System.out.println(output(sd, total_salary));
        }
        if (o instanceof Nurse) {
            Nurse n = (Nurse) o;
            extra_salary = 20 * n.getVacicne();
            total_salary = n.getSalary() + extra_salary;
            System.out.println(output(n, total_salary));
        }
        if (o instanceof Secretary) {
            Secretary s = (Secretary) o;
            extra_salary = 10 * s.getCall();
            total_salary = s.getSalary() + extra_salary;
            System.out.println(output(s, total_salary));

        }
    }
}