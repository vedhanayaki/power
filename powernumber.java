package guviset3;

public class powernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5,b=3,r=1;
if(a>=0&&b==0){
	r=1;
}
else if(a==0&&b>=1){
	r=0;
}
else{
	for(int i=0;i<=b;i++){
		r=r*a;
	}
}
System.out.println(a+"^"+b+"="+r);
	}

}
