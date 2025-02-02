interface Inter1{
int A=10;
}
class Hai{
int A=20;
}
class Hello extends Hai implements Inter1 {
void show(){
//System.out.println(A);
System.out.println(super.A);
System.out.println(Inter1.A);
}
}
class Lab495{
public static void main(String args[]){
Hello h = new Hello();
h.show();
}
}