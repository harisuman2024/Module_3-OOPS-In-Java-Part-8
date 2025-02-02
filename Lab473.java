abstract class Shape{
abstract void area();
abstract void draw();
}
class Circle extends Shape{
}
public class Lab473{
public static void main(String args[]){
Shape myshape = new Circle();
myshape.area();
myshape.draw();
}
} 
