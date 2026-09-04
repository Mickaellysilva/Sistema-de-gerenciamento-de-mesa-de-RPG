public class Personagem {
    private int id;
    private String nome;
    private float nivel;
    private float vida;

    //Atribuição de associação entre o Mentor e o Inventário
    private Personagem mentor;
    private Item[] itens;
    public Personagem(int id, String nome, float nivel, float vida) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.itens = new Item[10];
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getNivel() {
        return nivel;
    }

    public float getVida() {
        return vida;
    }

    // Tipo de retorno especificado (Pernsoagem) e retorno da variável correta.
    public Personagem getMentor(){
        return this.mentor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNivel(float nivel){
        this.nivel = nivel;
    }

    public void setVida(float vida){
        this.vida = vida;
    }

    //métodos das classes.

    public void receberDano(String dano){
        this.vida -= dano;
    }

    public void curar(float valor){
        this.vida += valor;
    }

    public  void adicionarItem(Item item){
    }

    public boolean removerItem(int id){
        return false;
    }

    public Item[] listarItens(){
        return this.itens;
    }

    public void definirMentor(Personagem mentor){
        this.mentor = mentor;
    }

    public String atacar(){
        System.out.println("Ataque realizado!");
    }
}
