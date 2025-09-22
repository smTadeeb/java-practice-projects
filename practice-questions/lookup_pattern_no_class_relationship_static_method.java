abstract class A {
    abstract void show();
}

class B extends A {
//    void show() { System.out.println("B"); }
}

class lookup_pattern_no_class_relationship_static_method {
    public static void main(String[] args) {
        A a = new B();
  //      a.show();  // Prints "A" → because static is resolved at compile time
    }
}
