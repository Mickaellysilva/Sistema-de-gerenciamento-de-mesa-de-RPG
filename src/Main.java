import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando a mesa e o mestre
        Mesa mesa = new Mesa(1, "Mesa dos Aventureiros");
        Mestre mestre = new Mestre(1, "Mestre Aldric");
        mesa.setMestre(mestre);

        System.out.println(" MESA CRIADA ");
        System.out.println("Mesa: " + mesa.getNome() + " | Mestre: " + mesa.getMestre().getNome());

        // Criando jogadores e adicionando à mesa
        Jogador joao = new Jogador(1, "João");
        Jogador maria = new Jogador(2, "Maria");

        mesa.adicionarJogador(joao);
        mesa.adicionarJogador(maria);

        System.out.println("\n JOGADORES NA MESA ");
        for (Jogador j : mesa.listarJogadores()) {
            System.out.println("- " + j.getNome());
        }

        // Criando personagens (Guerreiro, Mago, Arqueiro) associando aos jogadores
        Guerreiro conan = new Guerreiro(1, "Conan", 5, 100, 80);
        Mago gandalf = new Mago(2, "Gandalf", 8, 70, 95);
        Arqueiro legolas = new Arqueiro(3, "Legolas", 6, 85, 90);

        joao.adicionarPersonagem(conan);
        maria.adicionarPersonagem(gandalf);
        maria.adicionarPersonagem(legolas);

        System.out.println("\n PERSONAGENS DE CADA JOGADOR");
        System.out.println(joao.getNome() + ":");
        for (Personagem p : joao.listarPersonagens()) {
            System.out.println("  - " + p.getNome());
        }
        System.out.println(maria.getNome() + ":");
        for (Personagem p : maria.listarPersonagens()) {
            System.out.println("  - " + p.getNome());
        }

        // Testando ataques
        System.out.println("\n TESTANDO ATAQUES ");
        System.out.println(conan.atacar());
        System.out.println(gandalf.atacar());
        System.out.println(legolas.atacar());

        // Testando mentor
        gandalf.definirMentor(conan);
        System.out.println("\n MENTOR");
        System.out.println(gandalf.getNome() + " tem como mentor: " + gandalf.getMentor().getNome());

        // Testando Item
        Item espada = new Item(1, "Espada Longa", "Arma");
        conan.adicionarItem(espada);
        System.out.println("\n ITENS DE " + conan.getNome());
        for (Item i : conan.listarItens()) {
            System.out.println("- " + i.getNome() + " (" + i.getTipo() + ")");
        }

        // Testando dano e cura
        System.out.println("\n TESTANDO DANO E CURA ");
        System.out.println(conan.getNome() + " começa com vida cheia.");
        conan.receberDano(30);
        System.out.println("Após receber 30 de dano...");
        conan.curar(10);
        System.out.println("Após curar 10...");

        // Criando sessões
        Sessao sessao1 = mesa.criarSessao(LocalDate.of(2026, 9, 10), "Sessão de introdução");
        Sessao sessao2 = mesa.criarSessao(LocalDate.of(2026, 9, 17), "A caverna misteriosa");

        System.out.println("\n SESSÕES DA MESA ");
        for (Sessao s : mesa.listarSessoes()) {
            System.out.println("Sessão " + s.getId() + " - " + s.getData() + ": " + s.getDescricao());
        }

        // Criando participações
        mesa.adicionarParticipacao(joao, "Jogador", LocalDate.of(2026, 9, 10));
        mesa.adicionarParticipacao(maria, "Jogador", LocalDate.of(2026, 9, 10));

        System.out.println("\n PARTICIPAÇÕES NA MESA");
        for (Participacao part : mesa.listarParticipacao()) {
            System.out.println("- " + part.getJogador().getNome() + " (" + part.getPapel() + ") desde " + part.getDataEntrada());
        }
    }
}