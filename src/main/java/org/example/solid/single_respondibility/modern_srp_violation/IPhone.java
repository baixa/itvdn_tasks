package org.example.solid.single_respondibility.modern_srp_violation;

public interface IPhone {
    void dial (String phoneNumber);
    void disconnect();

    void send (String message);
    int receive();
}
