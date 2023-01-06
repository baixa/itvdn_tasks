package org.example.solid.interface_segregation.isp_violation;

public class A {
    private I1 i;

    public A(I1 i) {
        this.i = i;
    }

    public void callGetName() {
        System.out.println(i.getName());
    }
}
