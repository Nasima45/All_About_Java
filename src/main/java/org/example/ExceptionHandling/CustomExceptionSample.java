package org.example.ExceptionHandling;
class InvalidBalanceException extends Exception{
    private int money;
    public int getMoney(){
return this.money;
    }
    public InvalidBalanceException(String messsage,int money){
        super(messsage);
        this.money=money;
    }
}
public class CustomExceptionSample extends Exception {
    public static void main(String[] args) {
        try{
            withdrawBalance(1200);
        }
        catch(InvalidBalanceException e){
            System.out.println(e.getMessage());
            System.out.println("user entered which is not even enough:"+ e.getMoney());
        }
    }
    private static void withdrawBalance(int money) throws InvalidBalanceException{
        int balance=900;
        if(money>balance){
            throw new InvalidBalanceException("you are poor...",money);
        }
        balance=balance-money;
        System.out.println("current balance "+ balance);
    }

}
