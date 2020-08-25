/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

public class CustomerMailApplication {
    
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        String type = nc.next();
        Customer myapp = CustomerFactory.createCustomer(type);
        System.out.println(myapp.createMail());        
        System.out.println("61050307 Siraphat Puranawong, Thank You");
    }
}
