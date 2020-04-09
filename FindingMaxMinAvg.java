import java.util.Scanner;
public class Task1{
public static void main(String args[])
{

  int number[]={10, 30, 20, 50, 40};
  double max,min;
  max=number[0];
  min=number[0];
  int sum=number[0];
  for (int i=1;i<number.length;i++)
  {
   
    if(number[i]>max)
    {
    max=number[i];
        }
    
     if(min>number[i]){
       min=number[i];}
        
    sum+=number[i];
 
  }
  double avg=sum/number.length;
  System.out.println(max);
  System.out.println(avg);
  System.out.println(min);
  }
}


 
