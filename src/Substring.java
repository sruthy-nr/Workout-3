import java.util.Scanner;

public class Substring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("Substrings of "+str+" are ");
        int l=str.length();
        for(int i=0;i<l;i++){
            System.out.println(str.substring(i,l));
            for (int j=0;j<i;j++){
                System.out.println(str.substring(j,i));

            }
        }
    }
}
