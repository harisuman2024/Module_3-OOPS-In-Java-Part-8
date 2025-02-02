interface Inter1{
int A=10;
int B=20;
}
interface Inter2{
int A=99;
int C=30;
}
class Hello implements Inter1,Inter2{
public void show(){
System.out.println("Hello - show");
System.out.println(Inter1.A);
System.out.println(B);
System.out.println(Inter2.A);
System.out.println(C);
}
}
class Lab491{
public static void main(String args[]){
Hello h = new Hello();
h.show();
}
}