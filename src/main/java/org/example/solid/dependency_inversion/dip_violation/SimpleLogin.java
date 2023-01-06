package org.example.solid.dependency_inversion.dip_violation;

public class SimpleLogin {

    //low-level class

    public boolean authenticate(User user) {
        //logic - database

        return true;
    }
}
