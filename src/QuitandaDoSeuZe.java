import java.text.DecimalFormat;
import java.util.Scanner;

public class QuitandaDoSeuZe {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de morangos ( em Kg ) : ");
        double kgMorangos = scanner.nextDouble();

        System.out.println("Digite a quantidade de maçãs ( em Kg ) :");
        double kgMacas = scanner.nextDouble();

        double precoMorango;
        double precoMacas;

        if(kgMorangos <= 5){
             precoMorango =  2.50;
        }else {
            precoMorango = 2.20;
        }

        if(kgMacas <= 5){
            precoMacas =  1.80;
        }else {
            precoMacas = 1.50;
        }

        double precoTotal =  (precoMorango * kgMorangos) + (precoMacas * kgMacas);

        if((kgMorangos + kgMacas > 8) || ( precoTotal > 25)){
            precoTotal = precoTotal * 0.90;
        }

        DecimalFormat df = new DecimalFormat("#.##");


        System.out.println(df.format(precoTotal));
    }

}
