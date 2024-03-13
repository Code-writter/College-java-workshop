import java.io.IOException;


class Foo { 
    // Checked exception    
    void m() throws IOException {
        System.out.println("fkjfhkj");
    }
}

class Test{
    public static void main(String[] args) {
        Foo f = new Foo();

        try{
            f.m();
        }   
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}



