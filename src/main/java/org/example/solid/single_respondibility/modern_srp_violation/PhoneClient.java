package org.example.solid.single_respondibility.modern_srp_violation;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();

        phone.dial("03952382095832");
        phone.send("Message text");
        phone.receive();
        phone.disconnect();
    }
}
