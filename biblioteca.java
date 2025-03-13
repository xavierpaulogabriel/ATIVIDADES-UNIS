public class BlocoCarnaval {
    private String nome;
    private String bairro;
    private String data;
    private String responsavel;
    private String descricao;

    public BlocoCarnaval(String nome, String bairro, String data, String responsavel, String descricao) {
        this.nome = nome;
        this.bairro = bairro;
        this.data = data;
        this.responsavel = responsavel;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void imprimirInformacoes() {
        System.out.println("Bloco: " + nome);
        System.out.println("Bairro: " + bairro);
        System.out.println("Data: " + data);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Descrição: " + descricao);
    }
}

public class CadastroBlocos {
    private List<BlocoCarnaval> blocos;

    public CadastroBlocos() {
        this.blocos = new ArrayList<>();
    }

    public void cadastrarBloco(BlocoCarnaval bloco) {
        blocos.add(bloco);
    }

    public void listarBlocos() {
        for (BlocoCarnaval bloco : blocos) {
            bloco.imprimirInformacoes();
            System.out.println("------------------------");
        }
    }

    public BlocoCarnaval buscarBlocoPorNome(String nome) {
        for (BlocoCarnaval bloco : blocos) {
            if (bloco.getNome().equals(nome)) {
                return bloco;
            }
        }
        return null;
    }
}