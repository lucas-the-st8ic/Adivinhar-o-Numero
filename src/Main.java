//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner leitura = new Scanner(System.in);

    int numeroSecreto = 0;
    int chuteDoNumero = 0;
    int tentativas = 1;
    numeroSecreto = new Random().nextInt(100) + 1;

    System.out.println("Advinhe o número secreto entre 1 e 10 \n");

    while (chuteDoNumero != numeroSecreto) {
        System.out.println("Insira sua tentativa entre 1 e 100:");
        chuteDoNumero = leitura.nextInt();

        if (chuteDoNumero < numeroSecreto) {
            System.out.println("O número secreto é maior do que " + chuteDoNumero);
        } else if (chuteDoNumero > numeroSecreto) {
            System.out.println("O número secreto é menor do que " + chuteDoNumero);
        } else {
            System.out.println("Parabéns você descobriu o número secreto " + numeroSecreto);
            System.out.println("Com " +tentativas+ " tentativa(s)");

            break;
        }

        tentativas ++;
    }


}
