abstract class Shape{
abstract void area();
abstract void draw();
}
abstract class Circle extends Shape{
void draw(){
System.out.println("Circle - draw");
}
}
class MyCircle extends Circle {
void area(){
System.out.println("MyCircle - area");
}
}
public class Lab474{
public static void main(String args[]){
Shape myshape = new MyCircle();
myshape.area();
myshape.draw();
} } 
