class Shape{ // Concrete Class

void area(){  // Concrete method
System.out.println("Shape - area");
}

void draw(){  // Concrete method
System.out.println("Shape - draw");
}
}
public class Lab469{
public static void main(String args[]){
Shape myshape = new Shape();
myshape.area();
myshape.draw();
}
}