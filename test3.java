import java.util.*;
class test3{
 public static void main(String args[]){
	Scanner reader=new Scanner(System.in);
	System.out.print("请输入一个字符串：");
	String str=reader.nextLine();
	System.out.print("输入欲删除的字符：");
	String dle=reader.nextLine();
	int i=str.indexOf(dle);
	String newStr=str.substring(0,i)+str.substring(i+1,str.length());
	System.out.print("新的字符串是："+newStr);
 }	
}