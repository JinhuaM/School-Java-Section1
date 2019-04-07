public class LinearA{
 public static void main(String[] args){
	int i=0;
	int[] a=new int[10];
	for(i=0;i<a.length;i++)
	  System.out.print("a["+i+"]="+a[i]+" ");
	System.out.println(" ");
	for(i=a.length-1;i>-1;i--)
	{
	  a[i]=i;
	  System.out.print("a["+i+"]="+a[i]+" ");
	}
}
}