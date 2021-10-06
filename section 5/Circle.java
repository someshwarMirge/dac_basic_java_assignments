public class Circle {
    private int radius;
   
    public  Circle(int r){

    this.radius=r ;

    }
    double calArea(){
        return 3.14*radius*radius;

    }
    double calPerimeter(){
        return 2*3.14*radius;
    }
}
