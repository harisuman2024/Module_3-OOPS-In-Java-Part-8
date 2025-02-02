interface Inter1{
void m1();
void m3();
}
interface Inter2{
void m2();
void m3();
}
class Hello implements Inter1,Inter2{
public void m1(){
System.out.println("Hello - m1");
}
public void m3(){
System.out.println("Hello - m3");
}
public void m2(){
System.out.println("Hello - m2");
}
}
class Lab489{
public static void main(String args[]){
Inter1 iref1 = new Hello();
iref1.m1();
//iref1.m2();  
iref1.m3();
Inter2 iref2 = new Hello();
//iref2.m1();
iref2.m2();
iref2.m3();
}
}