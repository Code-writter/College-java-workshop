class Foo{
    Foo(){
        this(10, 20);
        System.out.println("hgsbfkugfyusdvbgkyu");
    }

    Foo(int a, int b){
        this();
        int c = a + b ;
        System.out.println("Add : "+c);
    }
}


class Test {
    public static void main(String arg[]){
        Foo f = new Foo();
    }
}