/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.sales;

/**
 *
 * @author Sanjay
 */
public class Order {
    private final int idOrder;
    private final Product products[];
    private static int orderCounter;
    private int productCounter;
    private static final int MAX_PRODUCTS=10;
    
    public Order(){
        this.idOrder = ++orderCounter;
        products = new Product [MAX_PRODUCTS];
    }
    public void addProduct(Product product){
        if(productCounter<MAX_PRODUCTS){
            products[productCounter++]= product;
        }else{
            System.out.println("The maximum of products has been exceeded"+MAX_PRODUCTS);
        }
    }
    public double CalculationTotal(){
        double Total=0;
        for(int i=0;i<productCounter;i++){
            Total += products[i].getprice();
        }
        return Total;
    }
       public void showOrder(){
           System.out.println("Order"+idOrder);
           System.out.println("Total of the order"+CalculationTotal());
           System.out.println("Products in the order"+ productCounter);
           for(int i=0;i<productCounter;i++){
           System.out.println(products[i]);
       }
       }
}
