package Arrays;

public class ReverseArray{

    public static void main(String[] args) {

        int array[] = {3, 4, 9, 3, 9, 3, 39};
        int start=0, last=array.length-1, e=0;
        for(int i =0; i<array.length; i++){
            System.out.print(" "+array[i]);}
        while (start<last){
            e=array[start];
            array[start]=array[last];
            array[last]=e;
            start=start+1;
            last=last-1;
        }
        System.out.println();

        for(int i =0; i<array.length; i++){
        System.out.print(" "+array[i]);}


    }

}
