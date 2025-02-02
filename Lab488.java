interface Inter1{
void m1();
}
interface Inter2{
void m2();
}
class Hello implements Inter1,Inter2{
public void m1(){
System.out.println("Hello - m1");
}
public void m2(){
System.out.println("Hello - m2");
}
}
class Lab488{
public static void main(String args[]){
Hello hello= new Hello();
hello.m1();
hello.m2();
}
}