public class Utilizador
{
    String nome;
    String estado;
    TipoUtilizador tipoutilizador;

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public Utilizador(String nome, String estado, TipoUtilizador tipoutilizador) {
        this.nome = nome;
        this.estado = estado;
        this.tipoutilizador = tipoutilizador;
    }

    public TipoUtilizador getTipoUtilizador() {
        return tipoutilizador;
    }

}
