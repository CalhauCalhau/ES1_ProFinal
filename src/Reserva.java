import java.time.LocalDate;

public class Reserva {
    java.time.LocalDate data;
    Utilizador user;
    TipoReserva tipo;

    public Reserva(LocalDate data, Utilizador user, TipoReserva tipo) {
        this.data = data;
        this.user = user;
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Utilizador getUser() {
        return user;
    }

    public void setUser(Utilizador user) {
        this.user = user;
    }

    public TipoReserva getTipo() {
        return tipo;
    }

    public void setTipo(TipoReserva tipo) {
        this.tipo = tipo;
    }
}
