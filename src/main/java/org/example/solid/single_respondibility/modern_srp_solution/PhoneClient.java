package org.example.solid.single_respondibility.modern_srp_solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImpl(), new MessageManagerImpl());

        phone.dial("258935029");
        phone.send("Message text");
        phone.receive();
        phone.disconnect();
    }
}
