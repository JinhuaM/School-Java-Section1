public class CommandInput{
 public static void main(String[] args){
	if(args.length==0)
	System.out.println("û���������");
	else{
	System.out.println("��������"+args.length+"������");
	for(int i=0;i<args.length;i++)
	System.out.println("args["+i+"]="+args[i]+";   ");
}
}
}