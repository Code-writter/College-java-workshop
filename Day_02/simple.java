import 


class Bank{
    static int bal = 5000;
    void deposit(int x){
        bal = bal + x;
        System.out.println("Balance = " +bal);
    }

    void withdraw(int x){
        bal = bal - x;

        System.out.println("Balance = " +bal);
    }

    void show(){
        System.out.println("Balance = " +bal)
    }
}

class Test{
    public static void main(String arg[]){
        
        while(true){
            Enter 1 for withdraw and 2 for deposit and 3 for show balance = n
            if(n == 1){
                Entre amount for withdraw = 
                x = 
                Bank b1 = new Bank();
                b1.withdraw(x)
            }else if(n == 2){
                Entre amount for deposit 
                Bank b2 = new Bank();
                b2.deposit(x);
            }else if(n == 3){
                Bank b3 = new Bank()
                b3.show()
            }else{
                please entre btw 1 or 2 or 3
            }
        }
    }
}




