
public class callByReference {

    public static void main(String[] args) {
        MyRandom r1 = new MyRandom(4, 5);

        addTen(r1);

        System.out.println(r1.x);
    }

    static void addTen(MyRandom r) {
        r.x = r.x + 10;
        r.y = r.y+ 10;
    }
}

class MyRandom {
    int x;
    int y;

    MyRandom(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
