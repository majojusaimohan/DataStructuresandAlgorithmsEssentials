package Arrays;

public class PrintingPairs{
    void printParis(int array[]){

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length;j++){

                System.out.print("("+array[i]+","+array[j]+")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){

        int array[]={10,20,30,40,50,60};

        PrintingPairs p= new PrintingPairs();
        p.printParis(array);


    }
}
