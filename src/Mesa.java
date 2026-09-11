import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private int id;
    private String nome;

    private List<Jogador> jogador = new ArrayList<>();
    private List<Participacao> participacoes = new ArrayList<>();
    private List<Sessao> sessoes = new ArrayList<>();
    private Mestre mestre;

    public Mesa(){
    }

    public Mesa(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.jogador = new ArrayList<>();
        this.participacoes = new ArrayList<>();
        this.sessoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Mestre getMestre(){
        return this.mestre;
    }

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

    public Participacao adicionarParticipacao(Jogador jogador, String papel, LocalDate dataEntrada){
        Participacao participacao = new Participacao(papel, dataEntrada, jogador, this);
        this.participacoes.add(participacao);
        return participacao;
    }

    public List<Participacao> listarParticipacao(){
        return this.participacoes;
    }

    public Sessao criarSessao(LocalDate data, String descricao){
        int novoId = this.sessoes.size() + 1;
        Sessao novaSessao = new Sessao(novoId, data, descricao);
        this.sessoes.add(novaSessao);
        return novaSessao;
    }

    public List<Sessao> listarSessoes(){
        return this.sessoes;
    }
}