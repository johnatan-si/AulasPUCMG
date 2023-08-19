import java.io.*;
import java.util.*;

public class BancoDeTalentos {

    public static void main(String[] args) {
        try {
            BancoDeHabilidades bdh = new BancoDeHabilidades("Programa\u00E7\u00E3o Modular\\Laborat\u00F3rio\\Revisao-1-Codigo\\arquivo1.txt", "Programa\u00E7\u00E3o Modular\\Laborat\u00F3rio\\Revisao-1-Codigo\\arquivo2.txt");

            Scanner sc = new Scanner(System.in);
            boolean sair = false;

            while (!sair) {
                System.out.println("\n---- Menu ----");
                System.out.println("1. Melhor candidato para uma habilidade");
                System.out.println("2. Melhor candidato para habilidade obrigatória e outra importante");
                System.out.println("3. Melhor candidato considerando todas as habilidades");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");

                int escolha = sc.nextInt();
                sc.nextLine();  
                switch (escolha) {
                    case 1:
                        System.out.print("Digite o nome da habilidade: ");
                        String habilidade = sc.nextLine();
                        int indiceHabilidade = bdh.getTecnologias().indexOf(habilidade);
                        if (indiceHabilidade != -1) {
                            Candidato melhorCandidato = bdh.melhorCandidatoParaHabilidade(indiceHabilidade);
                            System.out.println("Melhor candidato para " + habilidade + ": " + melhorCandidato.getNome());
                        } else {
                            System.out.println("Habilidade não encontrada.");
                        }
                        break;

                    case 2:
                        System.out.print("Digite a habilidade obrigatória: ");
                        String habilidadeObrig = sc.nextLine();
                        System.out.print("Digite a habilidade importante: ");
                        String habilidadeImp = sc.nextLine();
                        
                        int indiceHabilidadeObrig = bdh.getTecnologias().indexOf(habilidadeObrig);
                        int indiceHabilidadeImp = bdh.getTecnologias().indexOf(habilidadeImp);
                        
                        if (indiceHabilidadeObrig != -1 && indiceHabilidadeImp != -1) {
                            Candidato candidato = bdh.melhorCandidatoParaDuasHabilidades(indiceHabilidadeObrig, indiceHabilidadeImp);
                            System.out.println("Melhor candidato para as habilidades " + habilidadeObrig + " e " + habilidadeImp + ": " + candidato.getNome());
                        } else {
                            System.out.println("Uma ou ambas as habilidades não foram encontradas.");
                        }
                        break;

                    case 3:
                        Candidato candidatoGeral = bdh.melhorCandidatoGeral();
                        System.out.println("Melhor candidato considerando todas as habilidades: " + candidatoGeral.getNome());
                        break;

                    case 4:
                        sair = true;
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os arquivos: " + e.getMessage());
        }
    }
}