import java.util.Scanner;

class Fest {
    public static void main(String arg[]){
        String str2 = "Ankit";
        String str1 = new String("Hello");

        System.out.println(str1);
        System.out.println(str2.length());
        System.out.println(str2.charAt(2));
        System.out.println(str2);

        System.out.println();
        for(int i = str2.length() - 1; i >= 0; i--){
            
            System.out.print(str2.charAt(i));
        }
        
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String str = sc.nextLine();

        System.out.println(str);
        
        if(str.contains("Dog")){
            str = str.replace("Dog", "***");
            
            System.out.println(str);
        }

        str = str.toUpperCase()
        System.out.println(str);

  
    }
}