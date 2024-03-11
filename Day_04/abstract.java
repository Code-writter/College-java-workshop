abstract class Foo{
    void m(){
        System.out.println("Hello from abstract class ");
    }

    abstract void n();
}

class Doo extends Foo{
    void n(){
        System.out.println("Hello from n");
    }
}

class Too {
    public static void main(String arg[]){
        Foo f = new Doo();

        f.n();
    }
}