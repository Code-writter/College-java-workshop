class Test {
    public static void main(String arg[]){
        StringBuffer str = new StringBuffer("Hello++++++++++");
        
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());

        // Add infront of existing string
        str.append("Byeeyeyye");
        System.out.println(str);

        System.out.println(str.length());
        System.out.println(str.capacity());


        


    }
}