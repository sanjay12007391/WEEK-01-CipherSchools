public class Furniture {

    //Inheritence

    //1.1 Memory Usage Optimization
    //1.2 Code Resusability
    //          --- faster development
    //          --- central code (Easy to debug/test)
    // Productivity / Efficiency
    int width;
    int height;
    void display(String item) {
        System.out.println(item + "width: " + width + "Height: " + height);
    }
    public static void main(String[] args) {
        Chair neelkamal = new Chair();
        neelkamal.foo();
    }
}
class Chair extends Furniture {
    void foo() {width=10;height=50;display("Chair");}
}
class Table extends Furniture {
    void foo() {width=10;height=50;display("Table");}
}
class Almirah extends Furniture {
    void foo() {width=10;height=50;display("Almirah");}
}