package com.driver;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Product p = new Product();
               System.out.println( p.product(2, 3));
               System.out.println( p.product(2, 3, 4));   
               System.out.println(p.product(2.6, 3.5) );
    }

    
 public   static class Product {
        
        public int product(int x, int y) {
            return x * y;
        }

        
        public int product(int x, int y, int z) {
            return x * y * z;
        }
