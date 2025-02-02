interface Inter1{
void show();
}
class Hai{
public void show(){
System.out.println("Hai - show");
}
}
class Hello extends Hai implements Inter1 {
}
class Lab493{
public static void main(String args[]){
Hello h = new Hello();
h.show();
}
} 
