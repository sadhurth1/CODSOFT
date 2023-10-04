import java.util.*;
class atm
{
protected int accno;
protected int balno;

public
void withdraw(int money)
{
//System.out.println("Enter the money to withdraw");
//Scanner m=new Scanner(System.in);
//int w=m.nextInt();
balno=balno-money;
System.out.println("Money withdrwan Successfully !");
System.out.println("Available Balance: "+balno);
}

void deposit(int money)
{
//System.out.println("Enter the money to deposit");
//Scanner n=new Scanner(System.in);
//int x=n.nextInt();
if (money<=0)
{
System.out.println("Invalid amount to deposit");
}
else{
balno=balno+money;
System.out.println("Money deposited Successfully");
System.out.println("Available Balance: "+balno);
}
}
void checkBalance()
{
System.out.println("Available Balance: "+balno);
}
}
class task3
{
public static void main(String ar[])
{
atm a=new atm();
System.out.println("-----ATM INTERFACE-----");
System.out.println("\n1. Enter 1 to withdraw\n2. Enter 2 to deposit\n3. Enter 3 to Check Balance\n4. Enter 4 to Exit\n");
while(true)
{
Scanner c=new Scanner(System.in);
int choice=c.nextInt();
switch(choice)
{
case 1:
{
System.out.println("Enter the money to withdraw: ");
int money=c.nextInt();
a.withdraw(money);
break;
}
case 2:
{
System.out.println("Enter the money to deposit: ");
int money=c.nextInt();
a.deposit(money);
break;
}
case 3:
{
a.checkBalance();
break;
}
case 4:
{System.out.println("Thank You !!!");
System.exit(0);
break;}
}
}
}
}