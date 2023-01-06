package org.example.solid.dependency_inversion.dip_violation;

// High level class

public class LoginManager {

    SimpleLogin simpleLogin = new SimpleLogin();

    public void login(User user) {
        simpleLogin.authenticate(user);
    }
}
