# Day : 6

* ### Exception handling
    Any unwanted event that occur at runtime that may intract normal control flow of java program

* global variable stores 0 for int not garbage value

* What is object class

    parent class of all user define classes 

     
    ### CompileTime Exception 
    * I/O Exception 
    * SQL Exception 
    * Interrupted Exception


    ### Runtime Exception (program will compile)
    * IndexOfBoundException     
        1.) Array    
        2.) String  
    * Arithmetic Exception
    * NegativeArraySizeException      
    * ArraySortException     
    * NullPointerException     
    * InputMismatchException     
    * IllegleArgumentException     
    * NumberFormatException     
    * ClassCastException     
    * IllegleStateException     


* Try Catch

    try, catch  => valid                
    try, catch, catch  => valid                 
    try, catch, catch, catch  => valid              
    try, catch, catch, catch, finally  => valid                 
    try, catch, catch, catch, finally, finally  => valid                


    catch, try => Not valid             
    finally, try => Not valid           
    finally, catch, try => Not valid    

    ### Types of exception              
    * Checked Exception => Except Runtime exception and its decendent all exception are checked                 
    * Unchecked Exception  => Runtime Exception and its decendent are unchacked                 


 Throws => By the help of throws keyword we decleare a particular method can throw an exceptiion
            we use only checked exception           

 Throw => By the help of throw keyword we actually throw(generate) an exception in a programe                    
    

### Multithreading          
    Executing several task simultaneously where each task is a saperate independent process of same program          
    thread start to works at same time                  
    we decrease/reduce processor idle time                  


