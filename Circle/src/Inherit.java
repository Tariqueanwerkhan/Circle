class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc,String add,String phno,String dob)
    {
        accNo=acc;
        String n;
        //name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }

    public String getAccNo(){return accNo;}
    public String getName(){return accNo;}
    public String getAddress(){return accNo;}
    public String getPhno(){return accNo;}
    public String getDOB(){return accNo;}
    public String getBalance(){return accNo;}

    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

class SavingsAccount extends Account
{
    public SavingsAccount(String acc, String add, String phno, String dob) {
        super(acc, add, phno, dob);
    }

    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String acc, String add, String phno, String dob) {
        super(acc, add, phno, dob);
    }

    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class Inherit {
    public static void main(String[] args) {

    }

}
