package Arrays;

public class PrintingSubarrays {

    void printSubArray(int array[]){

        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length;j++){
                System.out.print("(");
                for(int k=i; k<=j;k++){
                System.out.print(array[k]+",");
                }
                System.out.print(")");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args){

        int array[]={10,20,30,40,50,60};

        PrintingSubarrays p= new PrintingSubarrays();
        p.printSubArray(array);


    }
}
