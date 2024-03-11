import java.util.Scanner;


class Radius {
    double r;
    Scanner sc = new Scanner(System.in);
    
    Radius(){
        System.out.print("Enter Radius : ");
        r = sc.nextDouble();
    }
}


class Circle extends Radius{
    void area(){
        double a = 3.14*r*r;
        System.out.println("Area of circle : " + a);
    }
}

class Cyclinder extends Radius{
    double h;
    
    Cyclinder(){
        System.out.print("Enter height : ");
        h = sc.nextDouble();
    }
    void area(){
        double a = 2*3.14*r*(r + h);
        System.out.println("Area if cyclinder is : " + a);
        
    }
}


class Test{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for circle and 2 for cyclinder : ");
        int i = sc.nextInt();

        if(i == 1){
            Circle c = new Circle();
            c.area();
        }else if(i == 2){
            Cyclinder c = new Cyclinder();
            c.area();
        }else{
            System.out.println("Enter valid num");
        }
    }
}





