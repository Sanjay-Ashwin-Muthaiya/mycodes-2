/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

import com.gm.sales.Order;
import com.gm.sales.Product;
/**
 *
 * @author Sanjay
 */
public class Sales {
    public static void main(String[] args) {
        Product p1 = new Product("T-shirt",55.00);
        Product p2 = new Product("Cap",30.00);
        Product p3 = new Product("Jeans",150.00);
            
        Order order1 = new Order();
        
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);
        
        order1.showOrder();
        
        Order order2 = new Order();
        Product p4 = new Product("Shoues",100);
        Product p5 = new Product("Shirt",50);
        
        order2.addProduct(p1);
        order2.addProduct(p4);
        order2.addProduct(p5);
        order2.addProduct(p3);
        
        System.out.println("");
        order2.showOrder();
    }
}
