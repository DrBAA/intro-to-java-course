package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    protected double overdraftLimit;

    public CurrentAccount (int accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance); // calling the constructor from parent class
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit >= 0) {
            this.overdraftLimit = overdraftLimit;
        }
    }

    @Override
    public double withdraw(double requested) {
        if((getBalance() + this.overdraftLimit < requested)){
            return 0;
        }
        
        else {
            this.balance -= requested;
            return requested;            
        }
    }

    // @Override
    // public double withdraw(double requested) {
    //     double grant = 0;

    //     if {
            
    //         ((getBalance() + this.overdraftLimit >= requested)){

    //     }{
    //         grant = Math.abs(requested);
    //         balance -= grant;
    //     }
    //     return grant;
    //     }
    // }
    


    // @Override
    // public double withdraw(double requested) {
    //     if((getBalance() + this.overdraftLimit >= requested)){

    //     }
        
    //     else {
    //         this.balance -= requested;
    //         return requested;            
    //     }
    //     return 0;        
    // }

    

}

    // with no overriding methods  

    // *PASSES withdraw() method IGNORES requested amount exceeding overdraft
    // *FAILS withdraw() method withdraws requested amount within overdraft
    // PASSES withdraw() method withdraws requested amount within balance 

    // --======================================================================================
 
    // text command
//  ./mvnw --projects accounts clean test -Dtest=CurrentAccountTest,SavingsAccountTest




// with below method overriding
    // FAILS withdraw() method IGNORES requested amount exceeding overdraft
    // *PASSES withdraw() method withdraws requested amount within overdraft
    // FAILS withdraw() method withdraws requested amount within balance 

/*
   @Override    
    public double withdraw(double requested) {

        

        if (requested <= this.overdraftLimit)
        {
            return requested; 
        }        

        else
        {
            this.balance -= requested;
            return requested; 
        }
    }
*/

    // @Override    
    // public double withdraw(double requested) {
    //     if(requested < 0 || requested > this.overdraftLimit)
    //     {
    //         return 0;
    //     }

    //     else if (requested >= this.overdraftLimit)
    //     {
    //         return requested; 
    //     }        

    //     else
    //     {
    //         this.balance -= requested;
    //         return requested; 
    //     }
    // }    

//     else if (requested <= this.overdraftLimit);
//     {            
//     return requested;           
//     }
// else
// {
//     this.balance -= requested;
//     return requested; 
// }


// with below method overriding
    // *PASSES withdraw() method IGNORES requested amount exceeding overdraft
    // FAILS withdraw() method withdraws requested amount within overdraft
    // FAILS withdraw() method withdraws requested amount within balance 

/*    @Override    
    public double withdraw(double requested) {
        if(this.balance < requested || requested < 0 || requested > this.overdraftLimit){
            return 0;
        } else {
            requested = this.overdraftLimit;
            // this.balance -= requested;
            return requested;            
        }

    }
*/

// with below method overriding
    // *PASSES withdraw() method IGNORES requested amount exceeding overdraft
    // FAILS withdraw() method withdraws requested amount within overdraft
    // FAILS withdraw() method withdraws requested amount within balance 

/*    @Override
    public double withdraw(double requested) {
        if(requested > this.overdraftLimit || requested < 0){
            return 0;
        } else if (requested <= this.overdraftLimit){
            return requested;                    
        } else {
            this.balance -= requested;
            return requested;
        }
    }

 */


// text command
//  ./mvnw --projects accounts clean test -Dtest=CurrentAccountTest,SavingsAccountTest
