public class RightTriangle extends Triangle {


    public RightTriangle(double Lenght1, double Lenght2, double Lenght3) {
        super(Lenght1, Lenght2, Lenght3);
    }

    public boolean Is90(){
    if(Angel1() == 90 || Angel2() == 90 || Angel3() == 90){
        return true;
    }
        return false;
    }

    public double Square90(double a, double b){
        return ((a*b)/2);
    }

    @Override
    public String toString(){
        if(!IsTriangle() || !Is90()){
            return "it is no the right tringle. The side first: " + getLenght_1() + " second: "+ getLenght_2() + " third:" + getLenght_3();
        }
        return "The side first have: length " + getLenght_1() + " and angle " + getAngel1() + ". Second: " + getLenght_2() + " and angle " + getAngel2() + ". And third " + getLenght_3() + " and angle " + getAngel3() + " Perimetr is: " + getPerimeter() + " Square is: " + getSquare();
    }


}

