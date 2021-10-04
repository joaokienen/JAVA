import java.util.Random;
 
public class carcoroa {
    public static void main(String[] args)
    {
    
        Random gerador = new Random();
        int n = gerador.nextInt(2);//0 a 1

        if(n==1)
        {
            System.out.print("\n\tCARA\n\n");
        }else{
            System.out.print("\n\tCOROA\n\n");

        }
    }
}
