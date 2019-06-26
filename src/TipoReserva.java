public class TipoReserva {
    String descricao;
    int prazoreserva;
    Equipamento equipamento;
    Livro livro;

    public TipoReserva(String descricao, int prazoreserva, Equipamento equipamento) {
        this.descricao = descricao;
        this.prazoreserva = prazoreserva;
        this.equipamento = equipamento;
    }

    public TipoReserva(String descricao, int prazoreserva, Livro livro) {
        this.descricao = descricao;
        this.prazoreserva = prazoreserva;
        this.livro = livro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrazoreserva() {
        return prazoreserva;
    }

    public void setPrazoreserva(int prazoreserva) {
        this.prazoreserva = prazoreserva;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
