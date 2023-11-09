public class getters_setters {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setcolor("blue");
        System.out.println(p.getcolor());
        p.settip(2);
        System.out.println(p.gettip());

    }
}

class Pen {
    private String color;
    private int tip;

    String getcolor() {
        return this.color;

    }

    int gettip() {
        return this.tip;

    }

    void setcolor(String color) {
        this.color = color;

    }

    void settip(int tip) {
        this.tip = tip;

    }
}
