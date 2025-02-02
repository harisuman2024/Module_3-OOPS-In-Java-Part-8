interface Inter1{
int A=10;
void m1();
}
class Hello implements Inter1{
void m1(){
System.out.println("Hello - m1");
}
}
public class Lab483{
public static void main(String args[]){
Inter1 iref = new Hello();
iref.m1();
}
}