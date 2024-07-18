package Array;

public class TestArray {

    public static void main(String[] args) {
        
        int arrayOne[] = new int[8];

        arrayOne[0] = 5;
        arrayOne[1] = 15;
        arrayOne[2] = 35;
        arrayOne[3] = 55;
        arrayOne[4] = 65;
        arrayOne[5] = 75;
        arrayOne[6] = 85;
        
        System.out.println(arrayOne[2]);
        for(int i=0; i < arrayOne.length; i++ ){

            System.out.println(arrayOne[i]);

        }

        int arrayTwo[] = {5,20,36,45,78,14,78}; // one dimensional array
        System.out.println("Size of Array Two is " + arrayTwo.length);

    }

}
