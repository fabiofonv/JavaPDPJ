public class App {
    public static void main(String[] args) throws Exception {
        int numeroDeCasos = 10;
        int casoAtual = 1;

        while (casoAtual <= numeroDeCasos) {
            //código para imprimir o caso atual
            System.out.println("Caso" + casoAtual + ":");

            //Veredito: 1 - inocente, 2 - culpado
            int veredito = (casoAtual % 2 == 0)? 2 : 1;
            if(veredito == 1) {
                //código para imprimir o veredito
                System.out.println("Veredito: Inocente");
            } else {
                //código para imprimir o veredito
                System.out.println("Veredito: Culpado");
            }
        }
        System.out.println();
        casoAtual++;
    }
}
