package com.stefz.hospital;

public class RestController {

    private int totalDayOff;

    public void totalRest(Object o) {
        if(o instanceof Doctor) {
            Doctor d = (Doctor) o; 
            if (d.getIncident() <= 40) {
                totalDayOff = d.getDayOff(); 
                System.out.println(d.getFirstName() + " " + d.getLastName() + " with id: " + d.getId() + " has " + totalDayOff + " days off.");
            }
            
            if(d.getIncident()>40 && d.getIncident()<=60){
                totalDayOff=d.getDayOff() + 1;
                System.out.println(d.getFirstName() + " " + d.getLastName()+ " with id: " + d.getId() + " has " + totalDayOff + " days off.");
            }
            
            if(d.getIncident()>60){
                totalDayOff = d.getDayOff() + 2;
                System.out.println(d.getFirstName() + " " + d.getLastName()+ " with id: " + d.getId() + " has " + totalDayOff + " days off.");
            }
        }
        if(o instanceof Nurse){
            Nurse n = (Nurse) o;
            if(n.getVacicne()<=40){
                totalDayOff=n.getDayOff();
                System.out.println(n.getFirstName() + " " + n.getLastName()+ " with id: " + n.getId() + " has " + totalDayOff + " days off.");
            }
            if(n.getVacicne()>40 && n.getVacicne()<=60){
                totalDayOff=n.getDayOff() + 1;
                System.out.println(n.getFirstName() + " " + n.getLastName()+ " with id: " + n.getId() + " has " + totalDayOff + " days off.");
            }
            if(n.getVacicne()>60){
                totalDayOff = n.getDayOff() + 2;
                System.out.println(n.getFirstName() + " " + n.getLastName()+ " with id: " + n.getId() + " has " + totalDayOff + " days off.");
            }
        }

        if(o instanceof Secretary){
            Secretary s = (Secretary) o;
            if(s.getCall()<=80){
                totalDayOff=s.getDayOff();
                System.out.println(s.getFirstName() + " " + s.getLastName()+ " with id: " + s.getId() + " has " + totalDayOff + " days off.");
            }
            if(s.getCall()>80 && s.getCall()<=160){
                totalDayOff = s.getDayOff() + 1 ;
                System.out.println(s.getFirstName() + " " + s.getLastName()+ " with id: " + s.getId() + " has " + totalDayOff + " days off.");
            }
            if(s.getCall()>160){
                totalDayOff=s.getDayOff();
                System.out.println(s.getFirstName() + " " + s.getLastName()+ " with id: " + s.getId() + " has " + totalDayOff + " days off.");
            }
        }


    }
    
   // public void restDoctor( Doctor d){

    //     if(d.getIncident()<=40){
    //         totalDayOff=d.getDayOff();
    //         System.out.println(d.getFirstName() + " " + d.getLastName()+ " with id: " + d.getId() + " has " + totalDayOff);
    //         }

    //     if(d.getIncident()>40 && d.getIncident()<=60){
    //         totalDayOff=d.getDayOff() + 1;
    //         System.out.println(d.getFirstName() + " " + d.getLastName()+ " with id: " + d.getId() + " has " + totalDayOff);
    //     }

    //     if(d.getIncident()>60){
    //         totalDayOff = d.getDayOff() + 2;
    //         System.out.println(d.getFirstName() + " " + d.getLastName()+ " with id: " + d.getId() + " has " + totalDayOff);
    //     }
    // }

    // public void restNurse(Nurse n){

    //     if(n.getVacicne()<=40){
    //         totalDayOff=n.getDayOff();
    //         System.out.println(n.getFirstName() + " " + n.getLastName()+ " with id: " + n.getId() + " has " + totalDayOff + " days off.");
    //     }

    //     if(n.getVacicne()>40 && n.getVacicne()<=60){
    //         totalDayOff=n.getDayOff() + 1;
    //         System.out.println(n.getFirstName() + " " + n.getLastName()+ " with id: " + n.getId() + " has " + totalDayOff + " days off.");
    //     }
    //     if(n.getVacicne()>60){
    //         totalDayOff = n.getDayOff() + 2;
    //         System.out.println(n.getFirstName() + " " + n.getLastName()+ " with id: " + n.getId() + " has " + totalDayOff + " days off.");
    //     }
    // }   

    // public void restSecretary(Secretary s){
    //     if(s.getCall()<=80){
    //         totalDayOff=s.getDayOff();
    //         System.out.println(s.getFirstName() + " " + s.getLastName()+ " with id: " + s.getId() + " has " + totalDayOff + " days off.");
    //     }
    //     if(s.getCall()>80 && s.getCall()<=160){
    //         totalDayOff = s.getDayOff() + 1 ;
    //         System.out.println(s.getFirstName() + " " + s.getLastName()+ " with id: " + s.getId() + " has " + totalDayOff + " days off.");
    //     }
    //     if(s.getCall()>160){
    //         totalDayOff=s.getDayOff();
    //         System.out.println(s.getFirstName() + " " + s.getLastName()+ " with id: " + s.getId() + " has " + totalDayOff + " days off.");
    //     }
    // }


}
