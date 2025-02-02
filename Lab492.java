interface Inter1{
void show();
}
class Hai{
public void show(){
System.out.println("Hai - show");
}
}
class Hello implements Inter1 extends Hai{
}
class Lab492{
public static void main(String args[]){
Hello h = new Hello();
h.show();
}
}