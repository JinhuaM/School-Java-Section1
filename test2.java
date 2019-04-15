import java.util.*;
class test2{
 public static void main(String args[]){
	int i,n;
	n=(int)(100*Math.random());
	System.out.println("给你一个1至100的整数，请你猜猜这个数");
	System.out.print("输入您的猜测：");
	Scanner reader=new Scanner(System.in);
	i=reader.nextInt();
	while(i!=n){
	if(i<n){
	System.out.print("猜小了，再输入您的猜测：");
	i=reader.nextInt();
	}
	else if(i>n){
	System.out.print("猜大了，再输入您的猜测：");
	i=reader.nextInt();
	}
      }
	System.out.println("猜对了！");
 }
}