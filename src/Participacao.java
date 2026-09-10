import java.time.LocalDate;

public class Participacao {

    private String papel;
    private LocalDate dataEntrada;

    public Participacao(){
    }

    public Participacao(String papel, LocalDate dataEntrada){
        this.papel = papel;
        this.dataEntrada = dataEntrada;
    }

    public String getPapel(){
        return papel;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public void setPapel(String papel) {
        this.papel = papel;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
