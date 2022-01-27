import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class desafio15 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double V, D, R, area, altura;
        while (leitor.hasNext()) {
            V = leitor.nextDouble();
            D = leitor.nextDouble();
            R = D / 2;
            area = 3.14 *   D / 2.0 * D / 2.0    ;
            altura = V /  area     ;
            System.out.println("\nALTURA = " + df.format( altura));
            System.out.println("\nAREA = " + df.format( area ) );

        }
    }

}