/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author banyuheqaz163.com
 */
public class unit1test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        double r , s;
        
        r=in.nextDouble();
        if(r>0)
        {
            s = 3.14*r*r;
            System.out.println(s);   
        }
        else
        System.out.println("The radius of the circle has to be greater than 0");
                         
    }
}
