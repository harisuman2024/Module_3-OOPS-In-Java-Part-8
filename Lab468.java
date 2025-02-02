class A{
int x=10;
static int y=20;
}
class B extends A{
String x="JLC";
static String y="MyJLC";
}
public class Lab468{
public static void main(String args[]){
A ao= new B();
System.out.println(ao.x);
System.out.println(ao.y);
}
}