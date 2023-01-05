package org.example.solid.single_respondibility.modern_srp_solution;

public class Phone implements IConnectionManager, IMessageManager{

    private IConnectionManager connectionManager;
    private IMessageManager messageManager;

    public Phone(IConnectionManager connectionManager, IMessageManager messageManager) {
        this.connectionManager = connectionManager;
        this.messageManager = messageManager;
    }

    @Override
    public void dial(String phoneNumber) {
        connectionManager.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connectionManager.disconnect();
    }

    @Override
    public void send(String message) {
        messageManager.send(message);
    }

    @Override
    public int receive() {
        return messageManager.receive();
    }
}
