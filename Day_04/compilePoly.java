
//  Method overloading

class Foo {
    void m(){
        System.out.println("Byeeee");
    }

    void m(int a){
        System.out.println("A : " + a);
    }

    void m(int a, int b){
        System.out.println("A : " + a +  " B : "+ b);
    }
}

class Polymorphism{
    static public void main(String arg[]){
        Foo f = new Foo();

        f.m();

        f.m(10);
        
        f.m(10, 20);
    }
}

