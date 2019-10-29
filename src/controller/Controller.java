/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import storage.StorageMemoryProduct;
import storage.StorageMemoryUser;

/**
 *
 * @author Lazar-PC
 */
public class Controller {

    private final StorageMemoryUser storageMemoryUser;
    private final StorageMemoryProduct storageMemoryProduct;

    public Controller() {
        storageMemoryUser = new StorageMemoryUser();
        storageMemoryProduct = new StorageMemoryProduct();
    }
    public void login(String username,String password){
        
    }
    
}
