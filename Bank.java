public class Bank {
    private String acctNo;
    public Bank(String acctNo, String pIN, double balance, int attempt) {
      this.acctNo = acctNo;
      PIN = pIN;
      this.balance = balance;
      this.attempt = attempt;
    }
    private String PIN;
    private double balance;
    private int attempt;
    

    public int getAttempt() {
        return attempt;
    }
    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
    public String getAcctNo() {
        return acctNo;
    }
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }
    public String getPIN() {
        return PIN;
    }
    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    class bank {
    
}
}