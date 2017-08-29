/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Nam Nguyen
 */
public class MainThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer cus01= new Customer(01, "Nguyễn Duy Nam", "namnd00325@fpt.edu.vn", "03/08/1995", "30,000,000VND", "Đẹptrai.png","Đang hoạt động!");
        System.out.println(cus01.toString());
        
        System.out.println("==========================================");
        cus01.selectProduct("Iphone 7 Plus 64g Màu Gold");
        cus01.checkOut();
    }
    
}
