import java.util.*;
class Task2
{
public static void main(String ar[])
{
System.out.println("----STUDENT GRADE CALCULATOR----");
System.out.println("Enter no. of subjects: ");
Scanner sub=new Scanner(System.in);
int n=sub.nextInt();

int []marks=new int[n];
System.out.println("Enter the marks for "+n+" subjects");
for (int i=0;i<n;i++)
{
marks[i]=sub.nextInt();
}

int total_marks=0;
for(int i=0;i<n;i++)
{
total_marks+=marks[i];
}
System.out.println("Total Marks obtained in all subjects: "+total_marks);

float average=total_marks/n;
System.out.println("Average in percentage: "+average+"%");

if (average>=90 && average<=100)
System.out.println("Grade :A+");
else if (average>=80 && average<90)
{System.out.println("Grade :A");}
else if(average>=70 && average<80)
System.out.println("Grade :C");
else if(average>=60 && average<70)
System.out.println("Grade :D");
else if(average<60)
System.out.println("Grade :E\nBetter Luck next Time!");

}
}