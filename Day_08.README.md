# Day : 8 

### Generics        
    By the help of generics we achibe type safety and avoid type casting problem
    Array list memory allocate at run time.            
    forEx: 
    ArrayList<Type_of_data> obj_name ArrayList <Type_of_data> ();


    x = (int) name_of_obj.get(index)  
    
    
### forEach Loop

    for(data_type_Object index_name : arrayList ){
        <!-- Code block -->
    }                 

### List vs Queue vs Set        

    List : follow insertin order
            we can repeat elements   

    Queue : Dont follow insertion order
            we can repeat elements

    Set : follow diff insertion order
          we cannot repeat elements
          


## Array vs DB                  

    A friend after reading a book on PHP came to me and said: "Hey Emmanuel, I read this book on PHP and after playing around with the code samples which had a lot of arrays using a lot of memory, I got confused with the difference between an array and a database".


On analyzing this, I mentioned the biggest difference between the two approaches to data management as speed. In general, a database call is going to be much slower than accessing an element in an array. A reason you would want to choose a database is if users entered information one day, and retrieved it another day because Databases are good for holding data over long periods of time.


   Later on, I started to think that the old wisdom of "put your data in a DB is faster" is maybe not as accurate  as it was in the past.
   I've come across an app that stores large amounts of data in arrays in files instead of databases.
   The app was designed like that by choice and to my surprise, the application without any optimization or caching was able to serve 30 requests per second.
We played a bit changing the storing logic of few code samples with mysql and also implemented using arrays and we came to few conclusions that changed a bit
 my mind on the DB vs Array debate:
 * The biggest bottleneck of using arrays in files is I/O, but now SSDs are available even on the cheapest servers you can get which makes arrays in files more
 attractive as loading these files is barely noticeable.
 * Scaling databases and scaling code are two different skills, a good code optimizer is not necessarily a good DB optimizer, I think it is likely that I could
 get the same performances or better if I were (or had access to) a DB expert or spent very significant time mastering database administration, but this has a
 cost in terms of development that make it currently not worth it while we still have many easy performance gains on the PHP side like caching.
 * Not having a database allows us to focus on building views focused on displaying and analyzing the data which is what adds real value to the application.
 No database is actually also less code and dependencies to maintain.
 * If you work with read only data, this makes a database also less attractive because basically we don't need to do any insert/delete. That is something that I think is much easier to manage with a database than with arrays.
   It is likely that at some point, we will move to a database because we would have reached a bottleneck in terms of volume which would be more easily manageable with a database than with arrays but we are not there yet.

    So far I have to say that I am very impressed by how efficient and easy manipulating arrays can be.


# Entity Relationship diagram

    It is an overview relation of how data is stored in DB. 


1. Load the driver 
    Class.forname("driver")

2. create connection 
    connection cn Driver.getconnection
    ("url", username, "password")

3. make statement obj

4. execute query

5. close connection