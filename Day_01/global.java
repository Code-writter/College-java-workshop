
class Foo{
    static int x = 100;

    void m(){
        System.out.println(x);
    }
    
    void n(){
        x = x + 100;
        System.out.println(x);
    }
}

class Work{
    public static void main(String arg[]){
        Foo f1 = new Foo();
        Foo f2 = new Foo();
        Foo f3 = new Foo();

        f1.m();
        f2.m();
    }
}
