import java.util.*;
class test2{
 public static void main(String args[]){
	int i,n;
	n=(int)(100*Math.random());
	System.out.println("����һ��1��100������������²������");
	System.out.print("�������Ĳ²⣺");
	Scanner reader=new Scanner(System.in);
	i=reader.nextInt();
	while(i!=n){
	if(i<n){
	System.out.print("��С�ˣ����������Ĳ²⣺");
	i=reader.nextInt();
	}
	else if(i>n){
	System.out.print("�´��ˣ����������Ĳ²⣺");
	i=reader.nextInt();
	}
      }
	System.out.println("�¶��ˣ�");
 }
}