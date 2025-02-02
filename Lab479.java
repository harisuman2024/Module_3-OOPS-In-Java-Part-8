interface Inter1{
int A=10;
public final static int B=20;
void m1();
public abstract void m2();
}
public class Lab479{
public static void main(String args[]){
System.out.println(Inter1.A);
System.out.println(Inter1.B);
//Inter1.A=99;
//Inter1.B=88;
}
}