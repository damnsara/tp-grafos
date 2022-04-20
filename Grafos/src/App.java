import java.util.ArrayList;

public class App {

    // #region CONSTANTE
    private static final String NOME_ARQUIVO = "./br.csv";
    // #endregion

    public static void main(String[] args) {

        ArquivoLeitura f = new ArquivoLeitura(NOME_ARQUIVO);

        int quant = f.contarLinhas() - 1;
        Cidade cidades[] = new Cidade[quant];
        f.fecharArq();

        f = new ArquivoLeitura(NOME_ARQUIVO);
        f.lerLinha();

        for (int i = 0; i < quant; i++) {
            String linha = f.lerLinha();

            String[] dadosCidade = linha.split(",");
            cidades[i] = new Cidade(dadosCidade[0],
                    Double.parseDouble(dadosCidade[1]),
                    Double.parseDouble(dadosCidade[2]));
        }

        f.fecharArq();

        for (int i = 0; i < quant; i++) {
            System.out.println(i);
            System.out.println(cidades[i].getNome() + " " + cidades[i].getLatitude() + " " + cidades[i].getLongitude());
        }

    }
}
