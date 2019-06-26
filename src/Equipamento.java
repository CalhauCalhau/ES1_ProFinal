public class Equipamento {
    int numero_equipamento;
    TipoEquipamento tipo;

    public Equipamento(int numero_equipamento, TipoEquipamento tipo) {
        this.numero_equipamento = numero_equipamento;
        this.tipo = tipo;
    }

    public int getNumero_equipamento() {
        return numero_equipamento;
    }

    public void setNumero_equipamento(int numero_equipamento) {
        this.numero_equipamento = numero_equipamento;
    }

    public TipoEquipamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEquipamento tipo) {
        this.tipo = tipo;
    }
}
