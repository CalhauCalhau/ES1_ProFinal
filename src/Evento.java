import java.time.LocalDate;

public class Evento {
    java.time.LocalDate data;
    String nome_evento;
    TipoEvento tipo;

    public Evento(LocalDate data, String nome_evento, TipoEvento tipo) {
        this.data = data;
        this.nome_evento = nome_evento;
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNome_evento() {
        return nome_evento;
    }

    public void setNome_evento(String nome_evento) {
        this.nome_evento = nome_evento;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
}
