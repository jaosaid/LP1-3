import java.util.Scanner;

/**
 *
 * @author JOÃO ANTONIO DIAS CB3020479
 */

public class ProgramaTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Olá, vamos testar as classes Hora e Data!");

        // Teste da classe Hora
        System.out.println("Testando a classe Hora:");

        Hora horario = new Hora();

        System.out.print("Insira um valor para horas: ");
        int h = ler.nextInt();
        horario.setHor(h);

        System.out.print("Insira um valor para minutos: ");
        int m = ler.nextInt();
        horario.setMin(m);

        System.out.print("Insira um valor para segundos: ");
        int s = ler.nextInt();
        horario.setSeg(s);

        System.out.println("Horário: " + horario.getHora1());
        System.out.println("Horário com AM/PM: " + horario.getHora2());
        System.out.println("Total de segundos: " + horario.getSegundos());

        // Teste da classe Data
        System.out.println("\nTestando a classe Data:");

        Data data = new Data();

        System.out.print("Insira um valor para dia: ");
        int dia = ler.nextInt();
        data.setDia(dia);

        System.out.print("Insira um valor para mês: ");
        int mes = ler.nextInt();
        data.setMes(mes);

        System.out.print("Insira um valor para ano: ");
        int ano = ler.nextInt();
        data.setAno(ano);

        System.out.println("Data no formato dd/mm/aaaa: " + data.getData1());
        System.out.println("Data no formato dd/mesPorExtenso/ano: " + data.getData2());
        System.out.println("É bissexto? " + data.bissexto());
        System.out.println("Dias transcorridos: " + data.diasTranscorridos());

        data.apresentaDataAtual();

        System.out.println("\nObrigado por testar as classes Hora e Data!");
    }
}
