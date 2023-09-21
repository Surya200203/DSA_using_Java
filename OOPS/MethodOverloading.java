

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.sum(2,3));
        System.out.println(calc.sum(2,3,4));
        System.out.println(calc.sum((float)2.5,(float)5.2));
        System.out.println(calc.sum((float)2.5,(float)5.2,(float)8.9));
        
    }
}


class Calculator{
    int sum(int num1,int num2){
        return num1+num2;
    }
    float sum(float num1,float num2){
        return num1+num2;
    }
    int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    float sum(float num1,float num2, float num3){
        return num1+num2+num3;
    }
}