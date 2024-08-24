import java.util.Scanner;
public class IT24102434Lab5Q3{
    public static void main(String []args){

        int sDay,eDay,fDay;
        double fPay;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start date(1-31):");
        sDay = input.nextInt();
       
         System.out.print("Enter End date(1-31):");
         eDay = input.nextInt();

        
         if(sDay<eDay)
       

         { 
             System.out.println(""); 
            System.out.println("Room Charge Per Day: Rs. 48000.0/=");
            fDay = eDay - sDay;
            
            System.out.println("Number of Days Reserved:"+ fDay);

            if(fDay<3)
            {
              fPay = fDay*48000.0;
               System.out.print("Total Amount to be Paid:"+ fPay);
            }
            else if(fDay==3 || fDay==4)
            {
                fPay = fDay*48000.0-(fDay*48000.0*0.1);
                 System.out.print("Total Amount to be Paid:"+ fPay);
            }
            else if(fDay>=5)
            {
                fPay = fDay*48000.0-(fDay*48000.0*0.2);
                System.out.print("Total Amount to be Paid:"+ fPay);
            }
           
              
         }

        
         else if (sDay<=0 || sDay>31 )
         {
            System.out.println("Error:Days must be between 1 and 31");
         }
         else if (eDay<=0 || eDay>31)
         {
            System.out.println("Error:Days must be between 1 and 31");
         }

          else if(sDay>eDay)
         {
            System.out.println("Error:Start Date must be less than End date");
         }

        
    }
}