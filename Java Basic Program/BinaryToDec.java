import java.util.Scanner;

/**
 *
 * @author Vidhikara
 */
public class BinaryToDec {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary no. - ");
        String bin=sc.nextLine();
        int flag=1;
        long dec=0,num;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'|| bin.charAt(i)=='0')
                flag=1;
            else 
                flag=0;
        }
        if(flag==0){
            System.out.println("Not a valid Binary Number!!!!");
        }else{
            num=Long.parseLong(bin);
            for(int i=0;i<bin.length();i++){               
                dec+=((num%10)*Math.pow(2, i));
                num=num/10; 
            }
            System.out.println("Decimal Number is : "+(int)dec);
            
        }
        sc.close();
    }
    
}