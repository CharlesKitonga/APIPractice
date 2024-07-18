package TrainingJava;

public class JubileeBankLoan extends BankLoan{

    public static void main(String[] args) {
        
        BankLoan loan = new BankLoan();

        loan.setAge(50);
        loan.setAmount(500000);
        loan.setNamme("Kyalo");

        System.out.println("Name is: " + loan.getName() );
        System.out.println("Age is: " + loan.getAge() );
        System.out.println("Amount is: " + loan.getAmount() );
        
    }

}
