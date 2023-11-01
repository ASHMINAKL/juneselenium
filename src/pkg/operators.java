package pkg;

public class operators {
	public static void main(String[] args) {
	//arithmetic operators
		int a=20,b=10;
		System.out.println("---------arithmetic operators-----------");
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
	//assignment operators	
		System.out.println("---------assignment operators-----------");	
		System.out.println("a=b="+(a=b));
		System.out.println("a+=b="+(a=a+b));
		System.out.println("a-=b="+(a=a-b));	
		System.out.println("a/=b="+(a=a/b));
		System.out.println("a%=b="+(a=a%b));
		
    //relational operators
		System.out.println("---------relational operators-----------");	
		int n1=30,n2=20;
		System.out.println(n1<n2);
		System.out.println(n1>n2);
		System.out.println(n1<=n2);
		System.out.println(n1>=n2);
		System.out.println(n1==n2);
		System.out.println(n1!=n2);
		
	//logical operators
		System.out.println("---------logical operators-----------");
		
		
		
		
		
		
		
		
	//ternary operator	
		System.out.println("---------ternary operators-----------");	
		int num1=20,num2=5;
		String v=num1>num2?"num1 is greater":"num2 is greater";
		System.out.println(v);
		
		
		
		
		
		
	}
	
	
	

}
