interface Inter1{
int A=10;
static void show(){
System.out.println("Inter1 - show()");
System.out.println(A);
}
}
class Lab497{
public static void main(String args[]){
Inter1.show();
}
}