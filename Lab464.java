class Hello {
void sum(int a,int b){
System.out.println("Hello - sum(int,int)");
}
void sum(int a,int b,int c){
System.out.println("Hello - sum(int,int,int)");
}
}
public class Lab464{
public static void main(String args[]){
Hello h = new Hello();
h.sum(10);
h.sum(10,20);
h.sum(10,20,30);
}
}