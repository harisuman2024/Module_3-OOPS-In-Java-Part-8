abstract class Shape{
abstract void draw();
}
class Circle extends Shape{
void draw(){
System.out.println("Circle - draw");
}
}
class Square extends Shape{
void draw(){
System.out.println("Square - draw");
}
}
public class Lab475{
public static void main(String args[]){
Shape myshape = null;
myshape = new Circle();
myshape.draw();//1
myshape = new Square();
myshape.draw(); //2
}
}