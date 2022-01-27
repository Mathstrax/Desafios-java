import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class desafio16 {
    public static void main(String[] args) throws IOException {
        String linha;
        Float n;
        int Pos, i;

        Pos=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for ( i = 0; i < 10;  i++  ) {
            linha = br.readLine();
            n = Float.parseFloat(linha);
            if( n > 0   )Pos++;
        }

        System.out.println(" " + Pos + " valores positivos");
    }
}