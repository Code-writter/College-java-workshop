

class Child extends MiddleChild{
    public static void main(String arg[]){
        Child c = new Child();

        c.call();
        c.callFromMiddleChild();
        c.hello();
    }
}