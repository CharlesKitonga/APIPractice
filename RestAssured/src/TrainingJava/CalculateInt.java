package TrainingJava;

public class CalculateInt {


    public static void main(String[] args){

        BankOfKenya bk = new BankOfKenya();
        StandardBank sb = new StandardBank();
        Ncba nba = new Ncba();

        System.out.println("Bank of kenya Interest is " + bk.getInterest());
        System.out.println("Standard Bank Interest is "+sb.getInterest());
        System.out.println("NCBA interest is "+nba.getInterest());

    }
    
}
