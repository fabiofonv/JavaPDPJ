import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Entrada e saída básica de dados, para realizar o registro de um caso judicial
        System.out.println("Registrar novo caso? (S/N) ");
        char reply = scanner.nextLine().toUpperCase().charAt(0);
        boolean cont = 'S' == reply? true: false;
        
        Caso caso = new Caso(1);
        
        while(cont) {
            //scanner.nextLine();
            System.out.println("Digite a matrícula do juiz: ");
            caso.setMatJuiz(scanner.nextInt());

            System.out.println("Digite a OAB do advogado de acusação: ");
            caso.setOabAdvAcu(scanner.nextLine());

            System.out.println("Digite a OAB do advogado de defesa: ");
            caso.setOabAdvDef(scanner.nextLine());

            System.out.println("Digite o cpf do reclamado: ");
            caso.setCpfReclamado(scanner.nextInt());

            System.out.println("Digite o cpf do reclamante: ");
            caso.setCpfReclamante(scanner.nextInt());
            
            caso.imprimir();

            System.out.println("Registrar novo caso? (S/N) ");
            reply = scanner.nextLine().toUpperCase().charAt(0);
            cont = 'S' == reply? true: false;

        }
        
        scanner.close();
    }
}

// Atividades - Trilha 1
// int numeroDeCasos = 10;
//         int casoAtual = 1;
//         int inocentes = 0, culpados = 0;

//         while (casoAtual <= numeroDeCasos) {
//             //código para imprimir o caso atual
//             System.out.println("Caso" + casoAtual + ":");

//             //Veredito: 1 - inocente, 2 - culpado
//             int veredito = (int) (Math.random() * 2) + 1;//(casoAtual % 2 == 0)? 2 : 1;
//             if(veredito == 1) {
//                 //código para imprimir o veredito
//                 System.out.println("Veredito: Inocente");
//                 inocentes++;
//             } else {
//                 //código para imprimir o veredito
//                 System.out.println("Veredito: Culpado");
//                 culpados++;
//             }
//             System.out.println();
//             casoAtual++;
//         }      

//         System.out.println("Inocentes: " + inocentes + "\nCulpados: " + culpados);
