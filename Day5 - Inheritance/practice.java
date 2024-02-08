class Account{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public Account(String acc,String n,String add,String phno,String dob){
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add){
        address=add;
    }
    public void setPhno(String phno){
        this.phno=phno;
    }
            
}

class SavingsAccount extends Account{
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }
    public void deposit(long amt){
        balance+=amt;
    }
    public void withdraw(long amt){
        balance-=amt;
    }
}

class LoanAccount extends Account{
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }
    public void payEMI(long amt){
        balance-=amt;
    }
    public void repay(long amt){
        if(balance==amt)
            balance=0;
    }
}

public class practice {
    public static void main(String[] args) {
        // Creating a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("S123", "John Doe", "123 Main St", "555-1234", "01/01/1990");
        
        // Deposit some money
        savingsAccount.deposit(1000);
        System.out.println("Savings Account Balance after deposit: " + savingsAccount.getBalance());
        
        // Withdraw some money
        savingsAccount.withdraw(500);
        System.out.println("Savings Account Balance after withdrawal: " + savingsAccount.getBalance());

        // Creating a LoanAccount
        LoanAccount loanAccount = new LoanAccount("L456", "Jane Smith", "456 Oak St", "555-5678", "05/05/1985");
        
        // Paying EMI
        loanAccount.balance=1000;
        loanAccount.payEMI(200);
        System.out.println("Loan Account Balance after paying EMI: " + loanAccount.getBalance());
        
        // Repaying the loan
        loanAccount.repay(200);
        System.out.println("Loan Account Balance after repayment: " + loanAccount.getBalance());
    } 
}
