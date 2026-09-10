import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private int id;
    private String nome;
    private LocalDate data;
    private String descricao;

    private List<Jogador> jogador;
    private List<Participacao> participacoes;
    private List<Sessao> sessoes;
    private Mestre mestre;


    public Mesa(){
    }
    public Mesa(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.jogador = new ArrayList<>();
        this.participacoes = new ArrayList<>();
        this.sessoes =new ArrayList<>();
    }

    public int getId() {return id;}
    public String getNome() {return nome;}
    public Mestre getMestre(){return this.mestre;}

    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMestre(Mestre mestre){
        this.mestre = mestre;
    }

    public void adicionarJogador(Jogador jogador){
        this.jogador.add(jogador);
    }
    public List<Jogador> listarJogadores(){
        return this.jogador;
    }
    public void adicionarParticipacao(Participacao participacao){
        this.participacoes.add(participacao);
    }
    public List<Participacao> listarParticipacao(){
        return this.participacoes;
    }
    public Sessao criarSessao(LocalDate data, String descricao){
        Sessao novaSessao = new Sessao(1, data, descricao);

        this.sessoes.add(novaSessao);

        return novaSessao;
    }
    public List<Sessao> listarSessoes(){
        return this.sessoes;
    }
}
