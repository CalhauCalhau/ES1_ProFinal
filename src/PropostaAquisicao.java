import java.time.LocalDate;

public class PropostaAquisicao {

    LocalDate data;
    String infoLivro;
    Utilizador utilizador;

    public PropostaAquisicao(LocalDate data, Utilizador utilizador, String infoLivro) {
        this.data = data;
        this.utilizador = utilizador;
        this.infoLivro = infoLivro;
    }

    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public String getInfoLivro() {
        return infoLivro;
    }
}

