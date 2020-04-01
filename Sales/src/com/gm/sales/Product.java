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
public class Product {
    private int idProduct;
    private String name;
    private double price;
    private static int productsCounter;
    
    private Product(){
        this.idProduct= ++productsCounter;
    }
    public Product(String name,double price){
        this();
        this.name = name;
        this.price=price;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price=price;
    }
    @Override
    public String toString(){
        return "Product{" + "idProduct"+ idProduct + ",name"+name +" price" +price+ "}" ;
    }
    
}
    