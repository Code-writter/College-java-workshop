class Foo{
    Foo(int a, int b){
        int c = a + b;
        System.out.println("Add : "+c);
    }
}

class Doo extends Foo{ 
    Doo(){
        super(10, 20);
        System.out.println("Hello from Doo");
    }
}

class WorkDone{
    public static void main(String arg[]){
        Doo d = new Doo();
    }
}