public class StringA{
 public static void main(String[] args){
	String str1="Hello";
	String str2="Hello";
	String str3=new String("Hello");
	String str4=new String("Hello");
	System.out.println("�������= =���бȽϽ�����£�");
	if(str1==str2)
	System.out.println("str1��str2���");
	else
	System.out.println("str1��str2�����");
if(str3==str4)
	System.out.println("str3��str4���");
	else
	System.out.println("str3��str4�����");
if(str2==str3)
	System.out.println("str2��str3���");
	else
	System.out.println("str2��str3�����");

	System.out.println("��equals()�������бȽϽ�����£�");
	if(str1.equals(str2))
	System.out.println("str1��str2���");
	else
	System.out.println("str1��str2�����");
if(str3.equals(str4))
	System.out.println("str3��str4���");
	else
	System.out.println("str3��str4�����");
if(str2.equals(str3))
	System.out.println("str2��str3���");
	else
	System.out.println("str2��str3�����");
	
}
}