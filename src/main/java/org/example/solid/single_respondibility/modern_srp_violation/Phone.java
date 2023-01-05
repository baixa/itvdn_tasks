package org.example.solid.single_respondibility.modern_srp_violation;

public class Phone implements IPhone{
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connected established");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");
    }

    @Override
    public void send(String message) {
        System.out.println("Data send successfully");
    }

    @Override
    public int receive() {
        System.out.println("Data got successfully");
        return 0;
    }
}
