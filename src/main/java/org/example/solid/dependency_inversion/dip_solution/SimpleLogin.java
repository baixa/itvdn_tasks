package org.example.solid.dependency_inversion.dip_solution;

public class SimpleLogin implements Authenticator {

    //low-level class

    @Override
    public boolean authenticate(User user) {
        //logic - database

        return true;
    }
}
