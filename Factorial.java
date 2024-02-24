class Factorial{

int n;
int f;


public Factorial(int n){

this.n=n;
f=1;
for (int i=n;i>0;i--){
f=f*i;
} 
}

public Factorial()
{

this(5);

System.out.println("factorial of " +n +"is" +f);
}

public static void main(String args[]){

Factorial v=new Factorial();
}
}




