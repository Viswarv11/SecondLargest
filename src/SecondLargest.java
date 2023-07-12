import java.util.Scanner;

public class SecondLargest {
    public static int secondMax(int []array,int size){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if(array[i]>max1){
                max1=array[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if(array[i]>max2 && array[i]!=max1){
                max2=array[i];
            }
        }
        if(max2==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return max2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println("The Second Largest is :"+secondMax(array,size));
    }
}
