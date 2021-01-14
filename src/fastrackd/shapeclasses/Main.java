package fastrackd.shapeclasses;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle( 5 );
        circle.getArea();
        Rectangle rectangle = new Rectangle( 3 , 4 );

//        System.out.println(new Circle( 5 ));
    }
}

 class Circle{

    private double radius;
     public Circle(double radius){

         this.radius = radius;



    }
    int getArea(){

        return (int) Math.ceil(3.14159265 * radius * radius  );
    }


}

class Rectangle{

    private double width;
    private double height;
    public Rectangle(double width, double height){

        this.width = width;
        this.height  = height;



    }

    int getArea(){

        return (int) Math.ceil( width * height  );
    }
}

class Square{

    private double width;
    public Square(double width){

        this.width = width;



    }

    int getArea(){

        return (int) Math.ceil( width * width  );
    }


}
