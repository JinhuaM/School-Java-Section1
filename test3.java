import java.util.*;
class test3{
 public static void main(String args[]){
	Scanner reader=new Scanner(System.in);
	System.out.print("������һ���ַ�����");
	String str=reader.nextLine();
	System.out.print("������ɾ�����ַ���");
	String dle=reader.nextLine();
	int i=str.indexOf(dle);
	String newStr=str.substring(0,i)+str.substring(i+1,str.length());
	System.out.print("�µ��ַ����ǣ�"+newStr);
 }	
}