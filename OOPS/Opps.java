

public class Opps {

    public static void main(String args[]){

        // creating object 
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);

        p1.setTip(2);
        System.out.println(p1.tip);

        System.out.print("Color of Pen is : ");
        System.out.println(p1.getColor());

        System.out.print("Tip of Pen is : ");
        System.out.println(p1.getTip());
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void clacPercentage(int phy, int math, int chem){
        percentage = ((phy+math+chem)/3)*100;
    }
}
