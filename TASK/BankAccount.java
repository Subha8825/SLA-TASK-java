import java.util.*;
import java.math.BigInteger;
public class BankAccount{
    private BigInteger acc_Num;
    private double acc_bal;   
    public BigInteger getAccNum(){
        return acc_Num;
    }
    public void setAccNum(BigInteger acc_Num){
        this.acc_Num=acc_Num;
    }
    public double getAccBal(){
        return acc_bal;
    }
    public void setAccBal(double acc_bal){
        this.acc_bal=acc_bal;
    }
    public static void main(String[] args){
        BankAccount obj= new BankAccount();
        System.out.println("Account Details");
        obj.setAccNum(new BigInteger("987654345678"));
        System.out.println(obj.getAccNum());
        obj.setAccBal(10000);
        System.out.println(obj.getAccBal());
        
    }
}



