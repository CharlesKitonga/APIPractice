package TrainingJava;

public class Enginering implements Student{

    @Override
    public void displayName() { 

        System.out.println("Hi , we are from Engineering School");
    }

    @Override
    public void getStudentNumber() { 

        System.out.println("We are 120 students");
    }

    @Override
    public void getYear() { 

        System.out.println("We are 3rd years from Computer Science class");
    }

    public void getUniversity(){
        System.out.println("University is " + Student.university);
    }

    @Override
    public void getInterfaceName() {
        
    }

}
