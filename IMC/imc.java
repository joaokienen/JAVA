import java.util.Scanner;

public class teste
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        float peso, altura;
        float imc;
 
        System.out.println("Peso da Pessoa  (kg): ");
        peso = ler.nextFloat();

        System.out.println("Altura da Pessoa  (m): ");
        altura = ler.nextFloat();

        imc = peso/(altura * altura);

        if (imc <= 19)
        {
            System.out.printf(" SEU IMC  \u00e9 %.1f  Você está abaixo do seu peso ideal" ,imc);
        }
        else if (imc <= 25)
        {
            System.out.printf(" SEU IMC \u00e9 %.1f  Você está no seu peso ideal" , imc);
        }
        else if(imc <=30)
        {
            System.out.printf(" SEU IMC \u00e9 %.1f  Você está um pouco acima do seu peso ideal" ,imc);
        }
        else
        {
            System.out.printf(" SEU IMC \u00e9 %.1f  Seu IMC indica OBESIDADE " ,imc);
        }
    }
}
