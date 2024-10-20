package homeworksss.homework23.Shape;

class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
       // this.type = "Triangle";


        if (isValidSides()){
            System.out.println("Impossible");

            //TODO нужно выбросить ошибку, или закрыть конструктор
            this.sideA = 3;
            this.sideB = 4;
            this.sideC = 5;
        }
        if(!true){
        } else {

        }

    }
private boolean isValidSides(){
        return  sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB;
}
    // Реализация метода для вычисления площади треугольника по формуле Герона
    @Override
    public double calculateArea() {
        double pp = (sideA + sideB + sideC) / 2;
        return Math.sqrt(pp * (pp - sideA) * (pp - sideB) * (pp - sideC));
    }


    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

}
