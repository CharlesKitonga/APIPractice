package Array;

public class PassArrayToMethod {

    public static void findMin(int arrayOne[]){
        int min = arrayOne[0];

        for(int i = 1; i < arrayOne.length; i++){
            if (min > arrayOne[i]) {
                min = arrayOne[i];                
            }
        }
        System.out.println("Minimum element is " + min);
    }

    public static int[] getArray(){
        return new int[] {5,7,12,36,96,58,14};
    }

    public static void main(String[] args) {

        PassArrayToMethod pass = new PassArrayToMethod();

        int arrayTest[] = {16,45,7,8,3,5};

        pass.findMin(arrayTest);

        int arrayThree[] = pass.getArray();

        System.out.println("Array three: " + arrayThree[4]);
        
    }

}
