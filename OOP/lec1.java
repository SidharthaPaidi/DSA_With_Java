public class lec1 {
    public static void main(String[] args) {

        Pen p = new Pen();//creating an object p
        p.setColor("yellow");
        System.out.println(p.color);
        p.tip = 3;
        System.out.println(p.tip);

    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void tip(int newtip) {
        tip = newtip;
    }
}