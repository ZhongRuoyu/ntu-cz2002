package exam.ay2021s2.Q2a;

public class TestClassApp {
    public static void main(String[] args) {
        // print the greetings from TestClass
        TestClass.greetings();
        // construct a TestClass object called myProduct
        // and initialize attribute name
        TestClass myProduct = new TestClass("Amazing");
        // print values of myProduct's attributes
        myProduct.print();
        // update myProduct
        myProduct.update(999.99, "AmazingII");
        // print values of myProduct's attributes
        myProduct.print();
        // pint myProduct's numberOfProduct
        myProduct.printNumberOfProduct();
        // construct a TestClass object called tomProduct
        // and initialize attribute name
        TestClass tomProduct = new TestClass("tomProduct");
        // print tomProduct's numberOfProduct
        tomProduct.printNumberOfProduct();
    }
}
