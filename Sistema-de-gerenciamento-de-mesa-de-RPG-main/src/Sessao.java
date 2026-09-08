import java.time.LocalDate;

public class Sessao {

    private int id;
    private LocalDate data;
    private String descricao;

    public Sessao(){};

    public Sessao(int id, LocalDate data, String descricao) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData(){
        return data;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setData(LocalDate data){
        this.data=data;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
