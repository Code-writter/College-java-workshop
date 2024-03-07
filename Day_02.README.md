# Day : 2

Hint :- class bank

###### How to set path in java
find java bin in jdk folder 
copy path 
open control panel -> sys security and find Environment variable 
edit envi variabl -> in User variable edit path and add new path
ok -> ok -> ok

###### Methods
are of two types : 
* Static => called on class name
* Non static => call on object name


* Static function 

    class Foo{
        static void m(){
            System.out.println("I'm great");
        }
    }
    
    class Test{
        public static void main(String arg[]){
            called Through class
            Foo.m();
        }
*   }



* Non static
    class Foo{
        void m(){
            System.out.println("I'm great");
        }
    }

    class Test{
        public static void main(String arg[]){
            // called through object
            Foo f = new Foo();
            f.m();
        }
*   }




