
public class Account {
double amount=20000;
public double deposit(double a)
{
	double a1=a+amount;
	System.out.println(a1+" "+"Rupees successfully deposited in your account");
	return a1;
}
public double withdraw(double b)
{
	System.out.println(b+" "+ "successfully withdrawn");
	return b;
}
public void checkBalance()
{
	double c1=100,c2;
	c2=amount-c1;
	System.out.println(c2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account n1;
n1=new Account();
n1.deposit(500.00);
n1.withdraw(100.00);
n1.checkBalance();
}

}
