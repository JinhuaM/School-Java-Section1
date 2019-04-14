import java.util.*;

class test1{
  public static void main(String args[]) {
	int a[]={2,5,1,23,34,9,15};
	int start=0,end,middle;
	int n=a.length;
	for (int i=0;i<n;i++){
	  for (int j=i+1;j<n;j++){
		if(a[j]<a[i]){
		int t=a[j];
		a[j]=a[i]; 
		a[i]=t; 
		 }
    	   }
}
	System.out.println(Arrays. toString(a));
	Scanner reader=new Scanner(System.in);
	System.out.println("请输入一个整数判断是否在数组中");
	int num=reader.nextInt();
	int count=0;
	end=n;
	middle=(start+end)/2;
	while(num!=a[middle]){
		if(num<a[middle])
		   end=middle;
		else if(num>a[middle])
		   start=middle;
		middle=(start+end)/2;
		count++;
		if(count>n/2)
		  break;	
   	}
	if(count<n/2)
		System.out.println(num+"在数组中");
	else
		System.out.println(num+"不在数组中");
    }
}