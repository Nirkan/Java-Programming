public class Triangle{

    static int numOfSides = 3;

    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    //Constructor : is a method a class can have.
    public Triangle(double base, double height,
                   double sideLenOne, double sideLenTwo,
                   double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    //function
    public double findArea(){
        return (this.base * this.height)/2 ;
    }
}
