class Outer {
    int outerNumber = 10;

    class Inner {
        void display() {
            System.out.println("Inner class says outerNumber = " + outerNumber);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();          // create outer object
        Outer.Inner inner = outer.new Inner();  // create inner object
        inner.display();                    // call inner method
    }
}