package TrainingJava;

public class Medicine implements Student {

    @Override
    public void displayName() {
         System.out.println("We are from Medical School");
    }

    @Override
    public void getStudentNumber() {
         System.out.println("We are 170 students");
    }

    @Override
    public void getYear() {
         System.out.println("We are 5th years from pharmacology");
    }

    public void getUniversity(){
        System.out.println("We are from Harvard Uni");
    }

    public static void main(String[] args){

        Enginering eng = new Enginering();
        Medicine mdn = new Medicine();

        mdn.displayName();
        mdn.getStudentNumber();
        mdn.getYear();
        mdn.getUniversity();

        System.out.println("***********");

        eng.displayName();
        eng.getStudentNumber();
        eng.getYear();
        eng.getUniversity();
    }

    @Override
    public void getInterfaceName() {
         
    }

}
