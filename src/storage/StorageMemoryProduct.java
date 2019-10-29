/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Product;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lazar-PC
 */
public class StorageMemoryProduct {

    List<Product> products;

    public StorageMemoryProduct() {
        products = new LinkedList<>();
    }

}
