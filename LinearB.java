import java.util.*;
public class LinearB{
 public static void main(String[] args){
	int min,max,i;
	int[] a=new int[5];
	Scanner reader=new Scanner(System.in);
	for (i=0;i<a.length;i++){
	  System.out.print("从键盘输入一个整数到元素a["+i+"]:");
	  a[i]=reader.nextInt();
	}
	min=a[0];
	max=a[0];
	for (i=0;i<a.length;i++){
	  if(a[i]<min)
	   min=a[i];
	  else if(a[i]>max)
	   max=a[i];
	}
	System.out.println("最大的数是"+max);
	System.out.println("最小的数是"+min);
}
}