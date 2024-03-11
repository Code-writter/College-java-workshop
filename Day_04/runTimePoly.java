
class Foo{
    void m(){
        System.out.println("Hello from FOoo");
    }
}

class Doo{
    void m(){
        System.out.println("Hello from Doo");
    }
}

class Check{
    public static void main(String arg[]){
        Foo f = new Doo();

        f.m();
    }
}
