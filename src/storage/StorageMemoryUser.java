/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lazar-PC
 */
public class StorageMemoryUser {

    List<User> users;

    public StorageMemoryUser() {
        users = new ArrayList<>();
        users.add(new User(1l, "pera", "pera", "pera@gmail.com", "Pera", "Peric"));
    }

}
