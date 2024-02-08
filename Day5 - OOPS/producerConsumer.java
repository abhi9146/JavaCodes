
class Product{
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public String getItemNo() {return itemNo;}
    public String getName(){ return name;}
    public double getPrice(){ return price;}
    public int getQuantity(){ return qty; }

     public void setPrice(int pri){
        price=pri;
     }
     public void setQuantity(int qt){
        qty=qt;
     }
     public Product(String no,String name,double price,int qt){
        itemNo=no;
        this.name=name;
        this.price=price;
        qty=qt;
     }
     public Product(String no,String name){
        itemNo=no;
        this.name=name;
     }
     public void printDetails(){
        System.out.println("Item No : "+itemNo);
        System.out.println("Name : "+name);
        System.out.println("Price  : "+price);
        System.out.println("Quantity is : "+qty);
    }
}

class Customer{
    private String custid;
    private String name;
    private String address;
    private String phoneNo;

    public String getCustid(){ return custid;}
    public String getName(){ return name;}
    public String getAddress(){ return address;}
    public String getPhoneNo(){ return phoneNo;}

    public void setAddress(String add){
        address=add;
    }
    public void setPhoneNo(String num){
        phoneNo=num;
    }

    public Customer(String id,String Name,String add,String phone){
        custid=id;
        name=Name;
        address=add;
        phoneNo=phone;
    }
    public Customer(String id,String Name){
        custid=id;
        name=Name;
    }
    public void customerDetails(){
        System.out.println("Customer id : "+custid);
        System.out.println("Name : "+name);
        System.out.println("Address is  : "+address);
        System.out.println("Phone number is : "+phoneNo);
    }
}
public class producerConsumer {
    public static void main(String[] args) {
        System.out.println("Product Details ");
        Product p=new Product("A21-400","Mobile",80000,290);
        p.printDetails();

         System.out.println("\n");
        System.out.println("Customer Details ");
        Customer c=new Customer("2020BIT071","Abhishek", "Nanded","9146910339");
        c.customerDetails();
    }
}
