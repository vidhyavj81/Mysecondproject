class Reverse
{
int n;
int r;



public Reverse(int n)
{
this.n=n;
r=0;
int rem=0;
while(n!=0){
rem=n%10;
r=r*10+rem;
n=n/10;
}
}

public Reverse()
{
this(123);
System.out.println( "Reverse number"+r);
}

public static void main(String args[]){
Reverse r1=new Reverse();
}
}





