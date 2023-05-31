import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

// JOÃO ANTONIO DIAS CB3020479

public class Data {
    
    Scanner scan = new Scanner(System.in);
    Date date = new Date();
    DateFormat formaData = DateFormat.getDateInstance(DateFormat.FULL);
    
    private int dia, mes, ano;
    
    public Data()
    {
        entraAno();
        entraMes();
        entraDia();
    }
    
    public Data(int d, int m, int a) 
    {
        entraDia(d);
        entraMes(m);
        entraAno(a);
    }
    
    public void entraDia(int d)
    {
        dia = d;
    }
    
    public void entraMes(int m)
    {
        mes = m;
    }
    
    public void entraAno(int a)
    {
        ano = a;
    }
    
    public void entraDia()
    {
        int limite_mes = limiteMes();
        do
        {
            System.out.println("Digite o dia: ");
            dia = scan.nextInt();
        }
        while(dia > limite_mes || dia < 1);
        
    }
    
    public void entraMes()
    {
        do
        {
            System.out.println("Digite o mes: ");
            mes = scan.nextInt();
        }
        while(mes >12 || mes <1);
    }
    
    public void entraAno()
    {
        do
        {
            System.out.println("Digite o ano: ");
            ano = scan.nextInt();
        }
        while(ano < 1);
    }
    
    public int retDia()
    {
        return dia;
    }
    
    public int retMes()
    {
        return mes;
    }
    
    public int retAno()
    {
        return ano;
    }
    
    public String mostra1() 
    {
        String string_dia = "";
        String string_mes = "";
        String string_ano = "";
        
        string_dia = String.format("%02d", dia);
        string_mes = String.format("%02d", mes);
        string_ano = String.format("%02d", ano);
        
        System.out.print(date);
        return string_dia + "/" + string_mes + "/" + string_ano;
    }
    
    public String mostra2()
    {
        String string_dia = "";
        String string_mes = "";
        String string_ano = "";
        
        string_dia = String.format("%02d", dia);
        string_mes = mesPorExtenso(mes);
        string_ano = String.format("%04d", ano);
        
        return string_dia + "/" + string_mes + "/" + string_ano;
    }
    
    public boolean bissexto()
    {
        boolean valor = false;
        if(ano%4 != 0)
        {
            valor = true;
        }
        
        return valor;
    }
    
    public int limiteMes()
    {
        boolean valor = bissexto();
        int[] meses = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(valor == true)
        {
            meses[1] = 28;
        }
        
        return meses[mes-1];
    }
    
    public String mesPorExtenso(int m)
    {
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        return meses[m-1];
    }
    
    public int diasTranscorridos()
    {
        boolean valor = bissexto();
        int data = 0;
        int[] meses = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (valor == true)
        {
            meses[1] = 28;
        }
        for(int i = 0; i <mes-1 ; i++)
        {
            data = data+meses[i];
        }
        
        return dia + data;
    }
    
    public void apresentaDataAtual(){
        System.out.println("Data atual formatada: " + formaData.format(date));
    }
    
    public static void main(String[] args) {
        Data data1 = new Data();
        System.out.println("Data 1: " + data1.mostra1());
        System.out.println("Data 1 por extenso: " + data1.mostra2());
        System.out.println("Dias transcorridos desde o início do ano: " + data1.diasTranscorridos());

        System.out.println();

        Data data2 = new Data(15, 6, 2023);
        System.out.println("Data 2: " + data2.mostra1());
        System.out.println("Data 2 por extenso: " + data2.mostra2());
        System.out.println("Dias transcorridos desde o início do ano: " + data2.diasTranscorridos());
        
        data2.apresentaDataAtual();
    }
}
