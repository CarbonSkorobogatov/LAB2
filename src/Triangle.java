public class Triangle {

    private double Lenght_1, Lenght_2, Lenght_3;

    /*-----------------------------Realisation of creating angles----------------------*/
    public Triangle(double Lenght1, double Lenght2, double Lenght3){
        setLenght_1(Lenght1);
        setLenght_2(Lenght2);
        setLenght_3(Lenght3);
    }
    /*-------------------------------------------------------------------------*/
    public double getLenght_1() {
        return Lenght_1;
    }
    public void setLenght_1(double lenght_1){
        if(lenght_1 > 0){
            Lenght_1 = lenght_1;
        }else{
            Lenght_1 = 0;
        }
    }
    public double getLenght_2(){
        return Lenght_2;
    }
    public void setLenght_2(double lenght_2){
        if(lenght_2 > 0){
            Lenght_2 = lenght_2;
        }else{
            Lenght_2 = 0;
        }
    }
    public double getLenght_3() {
        return Lenght_3;
    }
    public void setLenght_3(double lenght_3){
        if(lenght_3 > 0){
            Lenght_3 = lenght_3;
        }else{
            Lenght_3 = 0;
        }
    }
    /*--------------------------------------------------------------------------------*/
    public double Angel1(){
        return Math.round( Math.toDegrees( Math.acos(( Math.pow(Lenght_2, 2) + Math.pow(Lenght_3, 2) - Math.pow(Lenght_1, 2) ) / (2 * Lenght_2 * Lenght_3))));
    }
    public double getAngel1() {
        return Angel1();
    }
    /*-------------------------------------------------------------------------------*/
    public double Angel2(){
        return Math.round( Math.toDegrees( Math.acos(( Math.pow(Lenght_3, 2) + Math.pow(Lenght_1, 2) - Math.pow(Lenght_2, 2) ) / (2 * Lenght_3 * Lenght_1))));
    }
    public double getAngel2() {
        return Angel2();
    }
    /*-----------------------------------------------------------------------------*/
    public double Angel3(){
        return Math.round( Math.toDegrees( Math.acos(( Math.pow(Lenght_1, 2) + Math.pow(Lenght_2, 2) - Math.pow(Lenght_3, 2) ) / (2 * Lenght_1 * Lenght_2))));
    }
    public double getAngel3() {
        return Angel3();
    }
    /*-------------------------------------------------------------------------*/
    public double Perimeter()
    {
        return Lenght_1 + Lenght_2 + Lenght_3;
    }
    public double getPerimeter() {
        return Perimeter();
    }
    /*----------------------------------------------------------------------------*/

    public double Square()
    {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - Lenght_1) * (p - Lenght_2) * (p - Lenght_3));
    }
    public double getSquare() {
        return Square();
    }
    /*---------------------------------------------------------------------------------------------------------------------*/
    public boolean IsTriangle() {
        double a = Lenght_1;
        double b = Lenght_2;
        double c = Lenght_3;
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a) && ((Angel1() + Angel2() + Angel3()) == 180)) {
            return true;
        }
        return false;
    }
    /*----------------------------------------------------------------------------------------------------------------*/
    @Override
    public String toString() {
        if(!IsTriangle()){
            return "it is no the tringle. The side first: " + Lenght_1 + " second: "+ Lenght_2 + " third:" + Lenght_3;
        }
        return "The side first have: length " + Lenght_1 + " and angle " + getAngel1() + ". Second: " + Lenght_2 + " and angle " + getAngel2() + ". And third " + Lenght_3 + " and angle " + getAngel3() + " Perimetr is: " + getPerimeter() + " Square is: " + getSquare();
    }
}
