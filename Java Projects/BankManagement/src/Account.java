public class Account {
    private String AccountNo;
    private String UserName;
    private double Balance;
    private String PhoneNumber;

    public Account(String AccountNo,String UserName,double Balance,String PhoneNumber){
        this.AccountNo=AccountNo;
        this.UserName=UserName;
        this.Balance=Balance;
        this.PhoneNumber=PhoneNumber;
    }

    public void Deposit(double DepositMoney){
        this.Balance+=DepositMoney;
        System.out.println("Deposit Successfully!"+"New Balance is: "+this.Balance);
    }

    public void Withdraw(double WithdrawMoney){
        if(this.Balance-WithdrawMoney<0){
            System.out.println("Insufficent Balance "+"Money Only Left"+this.Balance);
        }
        else{
            this.Balance-=WithdrawMoney;
            System.out.println("Withdrawal Successful "+"Ur Current Balance Is: "+this.Balance);
        }
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    

}
