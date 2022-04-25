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

        FileWriter arq = new FileWriter("distancias.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        Distancias distancias[];

        for (int i = 0; i < (cidades.length); i++) {
            gravarArq.printf("Id cidade: " + i + " | Nome da cidade: "
                    + cidades[i].getNome());
            for (int j = 0; j < (cidades.length); j++) {
                gravarArq.printf("\nDistancia entre as cidades " + cidades[i].getNome() + " e " + cidades[j].getNome()
                        + " é " + cidades[i].distancia(cidades[j]));
                distancias = new Distancias(cidades[i].getNome(), cidades[j].getNome(), cidades[i].distancia(cidades[j]));
            }
            gravarArq.printf("\n\n");
        }
        arq.close();

        Distancia distanciaOrd[];

        distanciaOrd = distancia;

        Collections.sort(distanciaOrd, new Comparable<Distancia>() {
            @Override
            public int compare(Object cid1, Object cid2) {
                if(cid1.compareTo(cid2) == 1) {
                    return 1;
                } else if (cid1.compareTo(cid2) == -1) {
                    return -1;
                }
                return 0;
            }
        });

        
        
    }
}
