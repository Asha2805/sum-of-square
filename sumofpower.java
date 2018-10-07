import java.util.*;
class sumofpower
{
public static void main(String[] args)
{
int num;
int sum=0;
Scanner w=new Scanner(System.in);
num=w.nextInt();
while(num>0)
{
int rem=rem%10;
sum=sum+rem*rem;
num=num/10;
}
System.out.println(sum);
}
}
