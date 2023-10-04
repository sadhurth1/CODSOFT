import java.util.*;
import java.util.Random;
class randomtask1
{
public static void main(String ar[])
{
Random r=new Random();
Scanner m2=new Scanner(System.in);
System.out.println("Enter min range: ");
int minran=m2.nextInt();
Scanner m1=new Scanner(System.in);
System.out.println("Enter max range: ");
int maxran=m1.nextInt();
int guess=r.nextInt(minran,maxran+1);
System.out.println("Welcome to the Number Guessing Game !\n\n");
System.out.println("Guess the number within 10 tries");
int count=0;
while(true){
while(true){
System.out.print("Enter a Number: ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num>guess)
{System.out.println("The given number is Larger than the guessed number");
count=count+1;}
if(num<guess)
{System.out.println("The given number is Smaller than the guessed number");
count=count+1;}
if(num==guess)
{count++;
System.out.println("Congratulations ! You guessed the number right! \nYour points is "+count);
break;}
if(count==10)
{System.out.println("Try again!");
break;}
}
System.out.println("Wanna Exit?\nPress 1 enter to exit or any other key to continue...");
Scanner ex=new Scanner(System.in);
int e1=ex.nextInt();
if (e1==1)
{break;}
}
}
}