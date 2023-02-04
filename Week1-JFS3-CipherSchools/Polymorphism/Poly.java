// Polymorphism
// an ability of an object to take many forms.
// static / dynamic
// static : overloading (function)
// dynamic: overloading (function)
public class Poly {

    // Function Overloading : defining multiple functions with same name with diff parameters
    // add is exisiting in multiple forms (using parameters)

    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    void add(float num1, float num2) {
        System.out.println(num1 + num2);
    }

    void add(int num1, float num2) {
        System.out.println(num1 + num2);
    }

    void add(float num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        // rules

        //16/18 : no of parameters must be different.
        // 16 / 20: no of parameters are same but it is valid because type is different
        // 22 / 24 : no of parameters are same and type are also almsot same. Its sequence/order of datatype.

        Poly p = new Poly();
        p.add(12.2f, 300);
    }
}
