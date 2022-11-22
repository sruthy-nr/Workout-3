import java.util.Scanner;
public class ArraySearchSort {
    static void search(int ar[], int n) throws Exception {
        boolean flag=false;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==n){
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("The element is found");
        }
        else
        {
            System.out.println("The element is not found");
        }

    }

    static void sort(int ar[]) throws Exception {
        int temp;
        for(int i=0;i<ar.length;i++){
            for (int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] ar=new int[l];
        System.out.println("Enter "+l+" elements");
        for(int i=0;i<ar.length;i++){
            ar[i]= sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int n=sc.nextInt();
        try{
            search(ar,n);
            sort(ar);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}