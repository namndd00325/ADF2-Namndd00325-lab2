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
public class Customer {
    private int id;
    private String name;
    private String email;
    private String birthday;
    private String balance;
    private String avatar;
    private String Status;

    public Customer() {
    }

    public Customer(int id, String name, String email, String birthday, String balance, String avatar, String Status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.balance = balance;
        this.avatar = avatar;
        this.Status = Status;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Thông tin khách hàng: \n" + "ID: " + id +"\n"+ "Họ tên: " + name +"\n"+ "Email: " + email +"\n"+ "Ngày tháng năm sinh: " + birthday +"\n"+ "Số tiền trong tài khoản: " + balance +"\n" +"Hình dại diện: " + avatar +"\n"+ "Trạng thái tài khoản: " + Status ;
    }
    
    public void selectProduct(String productName){
        
        System.out.println("Khách hàng "+ this.name +" đã chọn sản phẩm " + productName);
    
    }
    
    public void checkOut(){
        System.out.println("Người dùng thực hiện thanh toán hóa đơn!");
    }
    
    
    
            
   
}
