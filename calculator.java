import java.util.Scanner;

public class calculator{

    static int sum(int a, int b){
        int total=a+b;
        return total;
    }
    static int subt(int a, int b){
        int subtraction=(a-b);
        return subtraction;
    }
    static int multply(int a,int b){
        int multiplication=a*b;
        return multiplication;
    }
    static int div(int a, int b){
        int division=a/b;
        return division;
    }
    static int exp(int base, int exponent){
        int result=1;
        for(int i=1; i<=exponent;i++){
            result*=base;
        }
        return result;
    }
    static int fac(int a){
        int result=1;
        for(int i=1; i<=a;i++){
            result*=i;
        }
        return result;
    }
    static int mod(int a){
        int result=1;
        for(int i=1; i<=a;i++){
            result*=i;
        }
        return result;
    }

    static int rect(int a, int b){
        int area=a*b;
        return area;
    }




    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String menu= "1.Addition\n"
        +"2.Subtraction\n"
        +"3.Multiplication\n"
        +"4.Division\n"
        +"5.Exponential Number Calculation\n"
        +"6.Factorial Calculation\n"
        +"7.Finding The Area of a Rectangle\n"
        +"8.Exit\n";

        System.out.println("Please select the operation you want to perform");
        System.out.println(menu);
        int select;
        select=input.nextInt();
        
        

        switch(select){
            case 1:
            System.out.println("Number 1: ");
            int x=input.nextInt();
            System.out.println("Number 2: ");
            int y=input.nextInt();
            System.out.println(x+" plus "+y+": "+sum(x, y));
            break;

            case 2:
            System.out.println("Number 1: ");
            x=input.nextInt();
            System.out.println("Number 2: ");
            y=input.nextInt();
            System.out.println(x+" minus "+y+": "+subt(x, y));
            break;

            case 3:
            System.out.println("Number 1: ");
            x=input.nextInt();
            System.out.println("Number 2: ");
            y=input.nextInt();
            System.out.println(x+" times "+y+": "+multply(x, y));
            
            break;

            case 4:
            System.out.println("Number 1: ");
            x=input.nextInt();
            System.out.println("Number 2: ");
            y=input.nextInt();
            System.out.println(x+" divided by  "+y+": "+div(x, y));
            
            break;

            case 5:
            System.out.println("Base Number:  ");
            int q=input.nextInt();
            System.out.println("Exponent Number: ");
            int w=input.nextInt();
            System.out.println(q+" over "+w+": "+exp(q, w));
            
            break;

            case 6:
             System.out.println("Number:  ");
             int e=input.nextInt();
             System.out.println("Factoriel of "+e+": "+fac(e));
             break;

             case 7:
             System.out.println("What is lenght of the short side of the rectangle: ");
             int k=input.nextInt();
             System.out.println("What is lenght of the long side of the rectangle: ");
             int j=input.nextInt();
             System.out.println("Area of the rectangle: "+rect(k, j));
            
             break;

             case 8:
             System.out.println("Exiting...");
             break;

        }

        


    }
}