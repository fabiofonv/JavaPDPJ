public class App {
    public static void main(String[] args) throws Exception {
        int numeroDeCasos = 10;
        int casoAtual = 1;
        int inocentes = 0, culpados = 0;

        while (casoAtual <= numeroDeCasos) {
            //código para imprimir o caso atual
            System.out.println("Caso" + casoAtual + ":");

            //Veredito: 1 - inocente, 2 - culpado
            int veredito = (int) (Math.random() * 2) + 1;//(casoAtual % 2 == 0)? 2 : 1;
            if(veredito == 1) {
                //código para imprimir o veredito
                System.out.println("Veredito: Inocente");
                inocentes++;
            } else {
                //código para imprimir o veredito
                System.out.println("Veredito: Culpado");
                culpados++;
            }
            System.out.println();
            casoAtual++;
        }      

        System.out.println("Inocentes: " + inocentes + "\nCulpados: " + culpados);
    }
}
