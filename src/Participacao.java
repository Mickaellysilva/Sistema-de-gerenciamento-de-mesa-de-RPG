import java.time.LocalDate;

public class Participacao {

    private String papel;
    private LocalDate dataEntrada;
    private Jogador jogador;
    private Mesa mesa;

    public Participacao(){
    }

    public Participacao(String papel, LocalDate dataEntrada){
        this.papel = papel;
        this.dataEntrada = dataEntrada;
    }

    public Participacao(String papel, LocalDate dataEntrada, Jogador jogador, Mesa mesa){
        this.papel = papel;
        this.dataEntrada = dataEntrada;
        this.jogador = jogador;
        this.mesa = mesa;
    }

    public String getPapel(){
        return papel;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}