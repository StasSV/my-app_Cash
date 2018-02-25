

package com.mycompany.app;

public class Driver implements Person {
    private String fullName;
    private int number;

    public Driver(String fullName){
        this.fullName = fullName;
    }
    public void personInfo() {
        System.out.println("I'm your driver My  name is " + fullName );
    };
}
