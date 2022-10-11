# desktop
public class newJavaFile4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
    Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
          Scanner input3 = new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1 = input1.nextInt();
        int num2 = input2.nextInt();
        
        System.out.println("enter the choices");
        System.out.println("enter 1 for addition" + "\n " + "enter 2 for subtraction" + "\n" + "enter 3 for multiplication" + "\n" + "enter 4 for division" + "\n" );
        int num3 = input3.nextInt();
        
        //int a = 5;
        
        //evolution the expression that will retrun true to false
        
        switch (num3){
            case 1 :
               System.out.println("additon is" + ("num1 + num2"));
               break;
            case 2 :
                System.out.println("subtraction is" + ("num1 + num2"));
                break;
            case 3 :
                System.out.println("multiplication is" + ("num1 * num2"));
                break;
            case 4 :
                System.out.println("division is" + ("num1 / num2"));
              break;
            default :  
                System.out.println("some pther choices");
              break;
        }     
    }
}
