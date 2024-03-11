class Collage{
    int roll;
    String name;
    double percent;
}
class Student extends Collage{
    Student(int roll, String name, double percent){
        this.roll = roll;
        this.name = name;
        this.percent = percent;
    }
}

class Test{
    public static void main(String arg[]){
        Student s = new Student(101, "Hii", 90.3);

        System.out.println("Roll : " + s.roll);
        System.out.println("Roll : " + s.name);
        System.out.println("Roll : " + s.percent);
    }
}
