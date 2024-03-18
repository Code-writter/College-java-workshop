# Day : 9
### Basic data manipulation


- put all steps in try and catch                            
    1. load a driver class  <Class.forName("com.mysql.cj.jdbc.Driver")>                             
                            
        import java.sql.Connction                           
        import java.sql.DriverManager                                   
    2. create connnection  <Connection cn = DriverManager.getConnection("url", "username", "passowrd");>                            
        url : jdbc:mysql://localhost:3306/college/                          
        username : root                         
        password :                          
    3.  Create statement object                             
        Statement smt = cn.createStatement();                           
                            
    4. Execute query                            
        import java.sql.Statement                           
                                    
        int i = smt.executUpdate("insert into employee values (1001, 'Amit', 800.8)");                          
                            
    5. close connection   

    - 3. replacing statement interface with prepare statement

    create prepare statement obj

    import java.utils.PreparedStatement;

    PreparedStatement ps = cn.prepareStatement("insert into employee values (?, ?, ?)");

    ps.setInt(1, id);
    ps.setString(2, name);
    ps.Float(3, sal);

    boolean b = ps.execute();
    if(b == false){
        System.out.println("Data inserted successfully : ");
    }

    String name = sc.nextInt();

    System.out.println("Enter ID which you want to update : ");
    int id = sc.nextInt();

    ps.setString(1, name);
    ps.setInt(2, id);

    boolean b = ps.execute();
    if(!b){
        System.out.println("Data updated successfully ");
    }

    cn.close();



    ### Update


    preparedStatement ps = cn.preparedStatement ("update employee name ? where id ?);
    ps.setString(1, name);
    ps.setInt(2, id);

    boolean b = ps.execute();

    if(!b){
        System.out.println("Data updated sucessfully");
    }


    ### Delete      

        System.out.println("Enter id = " );
        int id = sc.nextInt();

        // make connectio obj

        // change query
        prepareStatement ps = cn.prepareStatement("delete from employee where id ?);

        ps.setInt(1, id);

        boolean b = ps.execute();

        if(!b){
            System.out.println("Data deleted ");
        }


    ### Select  

    ResultSet rs = smt.executeQuery("select * from employee ");

    while(rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        float salary = rs.getFloat("salary");

        System.out.println("id", "+ name + ","+ salary" )
    }

    cn.close();

    

