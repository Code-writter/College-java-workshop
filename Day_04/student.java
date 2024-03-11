
class Student{
    int roll;
    String name;
    double p, c, m;

    Student(){
        roll = 100;
        name = "aayush";
        p = 100;
        c = 1000;
        m = 10000;
    }

    void show(){
        System.out.println("Roll no. : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Physics : " + p);
        System.out.println("Chemistry : " + c);
        System.out.println("Maths : " + m);
    }
}


// class Show{
//     public static void main(String arg[]){
//         Student s = new Student();
//         s.show();
//     }
// }

// Editing the existing value of a class 
class Show{
    public static void main(String arg[]){
        Student s = new Student();
        s.p = 10;
        s.m = 20;
        s.c = 30;
        s.show();
    }
}



