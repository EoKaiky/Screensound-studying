package spring.atividade.screensound.principal;

import java.util.Scanner;

import org.aspectj.apache.bcel.Repository;

import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;
import spring.atividade.screensound.model.Artista;
import spring.atividade.screensound.model.TypeArtist;
import spring.atividade.screensound.repository.ArtistRepository;

public class Principal {
    
    private final ArtistRepository repository;

    public Principal(ArtistRepository repository) {
        this.repository = repository;
    }

    private Scanner leitura = new Scanner(System.in);

    public void exibeMenu(){
        var opcao = -1;

        while (opcao != 9) {
            var menu = """
                    *** Screen Sound Musicas ***

                    1 - Cadastrar artistas
                    2 - Cadastrar músicas
                    3 - Listar músicas
                    4 - Buscar músicas por artistas
                    5 - Pesquisar dados sobre um artistas

                    9 - Finalizar a aplicação

                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:                        
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicaArtista();
                    break;
                case 5:
                    pesquisarArtista();
                    break;
                case 9:
                    System.out.println("Encerrando a aplicação");
                    break;
            }
        }
    }
                    
    private void cadastrarArtistas() {
        var cadastrarNovo = "S";

        while (cadastrarNovo.equalsIgnoreCase("s")) {
          System.out.println("Qual o nome do artista: ");
          var name = leitura.nextLine();
          System.out.println("Digite o tipo do artista: ");
          var type = leitura.nextLine();
          TypeArtist typeArtist = TypeArtist.valueOf(type.toUpperCase());
          Artista artist = new Artista(name, typeArtist);
          repository.save(artist);
          System.out.println("Quer pesquisar outro artista ?");
          cadastrarNovo = leitura.nextLine();
        }

    }

    private void cadastrarMusicas() {

    }

    private void listarMusicas() {

    }

    private void buscarMusicaArtista() {

    }

    private void pesquisarArtista() {

    }
}
