interface Inter1{
int A=10;
}
class Hello implements Inter1 {
void show(){
System.out.println(A);
System.out.println(Inter1.A);
// System.out.println(super.A); //
}
}
class Lab494{
public static void main(String args[]){
Hello h = new Hello();
h.show();
}
}