import java.util.Scanner;

public class Data {
    Scanner ler = new Scanner(System.in);
    private int dia;
    private int mes;
    private int ano;


    // CONSTRUTORES
    public Data() {

    }

    public Data(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAno(a);
    }


    // METÓDOS SETTER COM VALIDAÇÃO
    public void setDia(int d) {
        while (d < 1 || d > 31) {
            System.out.println("Valor inválido, por favor digite um valor entre 1 e 31");
            System.out.print("Insira um valor válido para o dia: ");
            d = ler.nextInt();
        }

        dia = d;
    }

    public void setMes(int m) {
        while (m < 1 || m > 12) {
            System.out.println("Valor inválido, por favor digite um valor entre 1 e 12");
            System.out.print("Insira um valor válido para o mês: ");
            m = ler.nextInt();
        }
        mes = m;
    }

    public void setAno(int a) {
        while (a < 1) {
            System.out.println("Valor inválido, por favor digite um valor maior que 0");
            System.out.print("Insira um valor válido para o ano: ");
            a = ler.nextInt();
        }

        ano = a;
    }


    // METÓDOS SETTER VAZIOS
    public void setDia() {
        int d;
        System.out.print("Insira um valor para o dia: ");
        d = ler.nextInt();
        setDia(d);
    }

    public void setMes() {
        int m;
        System.out.print("Insira um valor para o mês: ");
        m = ler.nextInt();
        setMes(m);
    }

    public void setAno() {
        int a;
        System.out.print("Insira um valor para o ano: ");
        a = ler.nextInt();

        setAno(a);
    }


    // MÉTODOS GETTER
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getData1() {
        String d;

        d = dia + "/" + mes + "/" + ano;
        return d;
    }

    public String getData2() {
        String d;

        d = dia + "/" + mesPorExtenso(mes) + "/" + ano;
        return d;
    }

    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasTranscorridos() {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasTranscorridos = dia;

        for (int i = 1; i < mes; i++) {
            diasTranscorridos += diasPorMes[i];
        }

        if (mes > 2 && bissexto()) {
            diasTranscorridos++;
        }

        return diasTranscorridos;
    }

    public static String mesPorExtenso(int mes) {
        String[] meses = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes];
    }

    public void apresentaDataAtual() {
        java.util.Date dataAtual = new java.util.Date();
        java.text.DateFormat formatoData = java.text.DateFormat.getDateInstance(java.text.DateFormat.FULL);
        System.out.println("Data atual: " + formatoData.format(dataAtual));
    }

    public static void main(String[] args) {
        System.out.println("Olá, vamos testar essa classe!");
        Scanner ler = new Scanner(System.in);
        boolean quebra = false;

        Data data = new Data();

        do {
            int seletor;
            System.out.println("Olá, seja bem-vindo ao menu inicial");
            System.out.println("------ SELECIONE UMA OPÇÃO ------");

            System.out.println("1. Testar o método Data(d, m, a)");
            System.out.println("2. Testar método setDia(d)");
            System.out.println("3. Testar método setMes(m)");
            System.out.println("4. Testar método setAno(a)");
            System.out.println("5. Testar método setDia()");
            System.out.println("6. Testar método setMes()");
            System.out.println("7. Testar método setAno()");
            System.out.println("8. Testar método getDia()");
            System.out.println("9. Testar método getMes()");
            System.out.println("10. Testar método getAno()");
            System.out.println("11. Testar método getData1()");
            System.out.println("12. Testar método getData2()");
            System.out.println("13. Testar método bissexto()");
            System.out.println("14. Testar método diasTranscorridos()");
            System.out.println("15. Sair do sistema de testes");

            System.out.println("");
            System.out.println("");
            System.out.print("Insira um valor entre 1 e 15 para selecionar uma opção: ");
            seletor = ler.nextInt();

            switch (seletor) {
                case 1:
                    int d, m, a;
                    System.out.print("Insira o dia da nova data: ");
                    d = ler.nextInt();

                    System.out.print("Insira o mês da nova data: ");
                    m = ler.nextInt();

                    System.out.print("Insira o ano da nova data: ");
                    a = ler.nextInt();

                    Data data2 = new Data(d, m, a);
                    System.out.println(data2.getData2());
                    break;

                case 2:
                    System.out.print("Insira o novo dia: ");
                    d = ler.nextInt();
                    data.setDia(d);

                    break;
                case 3:
                    System.out.print("Insira o novo mês: ");
                    m = ler.nextInt();
                    data.setMes(m);

                    break;
                case 4:
                    System.out.print("Insira o novo ano: ");
                    a = ler.nextInt();
                    data.setAno(a);

                    break;
                case 5:
                    data.setDia();
                    break;
                case 6:
                    data.setMes();
                    break;
                case 7:
                    data.setAno();
                    break;
                case 8:
                    System.out.println(data.getDia());
                    break;
                case 9:
                    System.out.println(data.getMes());
                    break;
                case 10:
                    System.out.println(data.getAno());
                    break;
                case 11:
                    System.out.println("Data na classe: " + data.getData1());
                    break;
                case 12:
                    System.out.println("Data na classe: " + data.getData2());
                    break;
                case 13:
                    System.out.println("É bissexto? " + data.bissexto());
                    break;
                case 14:
                    System.out.println("Dias transcorridos: " + data.diasTranscorridos());
                    break;
                case 15:
                    quebra = true;
                    break;
                default:
                    System.out.println("O valor selecionado é inválido. Retornando ao menu inicial...");
                    break;

            }

            System.out.println("");

        } while (!quebra);

        System.out.println("Obrigado por testar a nossa classe!");
    }
}
