package org.example.solid.single_respondibility.modern_srp_solution;

public class MessageManagerImpl implements IMessageManager{
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
