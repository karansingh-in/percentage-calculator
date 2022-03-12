//coded by @karansingh_ind
package utilityz;


import java.util.Arrays;
import java.util.Scanner;


public class Utilityz {

   
    public static void main(String[] args) {
      
        
        
        System.out.println("# welcome to % calculator");
        System.out.println("# enter the marks of the subjects below: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("***");
        
        System.out.println("english 1: ");
        double e1=sc.nextInt();
        System.out.println("english 2: ");
        double e2=sc.nextInt();
        double e=(e1+e2)/2;
        
        System.out.println("hindi: ");
        double h=sc.nextInt();
        System.out.println("mathematics: ");
        double m=sc.nextInt();
        System.out.println("history & civics: ");
        double hc=sc.nextInt();
        System.out.println("geography: ");
        double g=sc.nextInt();
        double hcg=(hc+g)/2;
     
        System.out.println("physics: ");
        double p=sc.nextInt();
        System.out.println("chemistry: ");
        double c=sc.nextInt();
        System.out.println("biology: ");
        double b=sc.nextInt();
        double pcb=(p+c+b)/3;
        
        System.out.println("computer: ");
        double cs=sc.nextInt();
        double marks[]={h,pcb,m,cs,hcg};
     
         
        Arrays.sort(marks);
        double top[]=new double[5];
        top[0]=e;
        top[1]=marks[1];
        top[2]=marks[2];
        top[3]=marks[3];
        top[4]=marks[4];
        
        System.out.println(); 
        
        double total=0.0;
       
        for(int po=0;po<top.length;po++){
            
            total=(total+top[po]);
        }
     
        
       double per=(total/210)*100;
       
        
        System.out.println("Congratulations!! you scored "+per+"%");
    }
    
}
