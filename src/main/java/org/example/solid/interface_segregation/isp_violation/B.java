package org.example.solid.interface_segregation.isp_violation;

public class B {
    private I2 i;

    public B(I2 i) {
        this.i = i;
    }

    public void callGetDate() {
        System.out.println(i.getDate());
    }
}
