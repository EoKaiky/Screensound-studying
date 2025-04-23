package spring.atividade.screensound.principal;

import java.util.Scanner;

public class Principal {
    
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
