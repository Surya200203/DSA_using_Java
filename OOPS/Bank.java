

public class Bank {

    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "sanket";
        myAcc.setPassword("coder@12");
        



    }
    
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }


}
