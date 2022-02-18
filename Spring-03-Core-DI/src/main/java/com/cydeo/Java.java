package com.cydeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Java {

//   Field Injection
//    @Autowired
//    OfficeHours officeHours;


  //Constructor Injection
    OfficeHours officeHours;
    public Java(OfficeHours officeHours) {
        this.officeHours=officeHours;

    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + (20+officeHours.getHours()));
    }


}
