package org.example.solid.dependency_inversion.dip_solution;

// High level class

public class LoginManager {

    Authenticator authenticate;

    public LoginManager(Authenticator authenticate) {
        this.authenticate = authenticate;
    }

    public void login(User user) {
        authenticate.authenticate(user);
    }
}
