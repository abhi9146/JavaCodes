
interface Member{
    void callback();
}
class Customer implements Member{
    public int custid;
    public String custName;

    public Customer(int id,String name){
        custid=id;custName=name;
    }
    public void callback(){
        System.out.println(custName + " sale is started");
    }
}
class Store{
    Member members[]=new Member[10];
    int count=0;
       
    void register(Member m){
        members[count++]=m;
    }
    void inviteSale(){
        for(int i=0;i<count;i++)
            members[i].callback();
    }
}

public class studentChallange {
    public static void main(String[] args) {
        Store s=new Store();
        Customer c1=new Customer(2,"John");
        Customer c2=new Customer(3,"Smith");
        
        s.register(c1);
        s.register(c2);
        
        s.inviteSale();
    }
}
