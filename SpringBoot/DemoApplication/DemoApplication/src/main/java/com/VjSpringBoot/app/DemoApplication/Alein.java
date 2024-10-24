/*
//1
package com.VjSpring.app.DemoApplication;

import org.springframework.stereotype.Component;

@Component
public class Alein {
    public  void code(){
        System.out.println("Coding");
    }
}
 */

//2 AutoWiring
package com.VjSpringBoot.app.DemoApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alein {
    @Autowired
    Laptop laptop;
    public  void code(){
        laptop.complie();
    }
}
