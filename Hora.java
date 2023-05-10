import java.util.Scanner;

public class Hora{
    Scanner ler = new Scanner(System.in);
    private int hora;
    private int min;
    private int seg;


    // CONSTRUTORES
    public Hora (){

    };

    public Hora (int h, int m, int s){
        setHor(h);
        setMin(m);
        setSeg(s);
    }


    // METÓDOS SETTER COM VALIDAÇÃO
    public void setHor(int h){
        while(h < 0 || h > 23){
            System.out.println("Valor inválido, por favor digite um valor entre 0 e 23");
            System.out.print("Insira um valor válido para horas: ");
            h = ler.nextInt();
        }

        hora = h;
    }

    public void setMin(int m){
        while(m < 0 || m > 59){
            System.out.println("Valor inválido, por favor digite um valor superior a 0 e inferior a 60");
            System.out.print("Insira um valor válido para minutos: ");
            m = ler.nextInt();
        }
        min = m;
    }

    public void setSeg(int s){
        while(s < 0 || s > 59){
            System.out.println("Valor inválido, por favor digite um valor superior a 0 e inferior a 60");
            System.out.print("Insira um valor válido para segundos: ");
            s = ler.nextInt();
        }

        seg = s;
    }


    // METÓDOS SETTER VAZIOS
    public void setHor(){
        int h;
        System.out.print("Insira um valor para horas: ");
        h = ler.nextInt();
        setHor(h);
    }

    public void setMin(){
        int m;
        System.out.print("Insira um valor para minutos: ");
        m = ler.nextInt();
        setMin(m);
    }

    public void setSeg(){
        int s;
        System.out.print("Insira um valor para segundos: ");
        s = ler.nextInt();

        setSeg(s);
    }


    // MÉTODOS GETTER
    public int getHor (){
        return hora;
    }

    public int getMin (){
        return min;
    }

    public int getSeg (){
        return seg;
    }

    public String getHora1 (){
        String h;

        h = hora + ":" + min + ":" + seg;
        return h;
    }

    public String getHora2 (){
        String h, sig = "AM";
        int pm = hora;

        if (hora > 11){
            pm = hora - 12;
            sig = "PM";
        }

        h = pm + ":" + min + ":" + seg + " " + sig;
        return h;
    }

    public int getSegundos(){
        int h;
        h = hora * 3600;
        h = h + (min * 60);
        h = h + seg;
        return h; 
    }

    public static void main(String[] args) {
        System.out.println("Olá, vamos testar essa classe!");
        Scanner ler = new Scanner(System.in);
        boolean quebra = false;
    
        Hora horario = new Hora();
    
        do{
            int seletor;
            System.out.println("Olá, seja bem-vindo ao menu inicial");
            System.out.println("------ SELECIONE UMA OPÇÃO ------");
    
            System.out.println("1. Testar o metódo Hora(h, m, s)");
            System.out.println("2. Testar metódo setHor(h)");
            System.out.println("3. Testar metódo setMin(m)");
            System.out.println("4. Testar metódo setSeg(s)");
            System.out.println("5. Testar metódo setHor()");
            System.out.println("6. Testar metódo setMin()");
            System.out.println("7. Testar metódo setSeg()");
            System.out.println("8. Testar metódo getHor()");
            System.out.println("9. Testar metódo getMin()");
            System.out.println("10. Testar metódo getSeg()");
            System.out.println("11. Testar metódo getHora1()");
            System.out.println("12. Testar metódo getHora2()");
            System.out.println("13. Testar metódo getSegundos()");
            System.out.println("14. Sair do sistema de testes");
    
            System.out.println("");
            System.out.println("");
            System.out.print("Insira um valor entre 1 e 14 para selecionar uma opção: ");
            seletor = ler.nextInt();
    
            switch (seletor) {
                case 1:
                int h, m, s;
                    System.out.print("Insira a hora do novo objeto: ");
                    h = ler.nextInt();
    
                    System.out.print("Insira os minutos do novo objeto: ");
                    m = ler.nextInt();
    
                    System.out.print("Insira os segundos do novo objeto: ");
                    s = ler.nextInt();
    
                    Hora Hora2 = new Hora(h, m, s);
                    System.out.println(Hora2.getHora2());
                    break;
    
                case 2:
                    System.out.print("Insira a nova hora: ");
                    h = ler.nextInt();
                    horario.setHor(h);
    
                    break;
                case 3:
                    System.out.print("Insira os novos minutos: ");
                    m = ler.nextInt();
                    horario.setMin(m);
    
                    break;
                case 4:
                    System.out.print("Insira os novos segundos: ");
                    s = ler.nextInt();
                    horario.setSeg(s);
    
                    break;
                case 5:
                    horario.setHor();
                    break;
                case 6:
                    horario.setMin();
                    break;
                case 7:
                    horario.setSeg();
                    break;
                case 8:
                    System.out.println(horario.getHor());
                    break;
                case 9:
                    System.out.println(horario.getMin());
                    break;
                case 10:
                    System.out.println(horario.getSeg());
                    break;
                case 11:
                    System.out.println("Horario na classe: " + horario.getHora1());
                    break;
                case 12:
                    System.out.println("Horario na classe: " + horario.getHora2());
                    break;
                case 13:
                    System.out.println("Segundos: " + horario.getSegundos());
                    break;
                case 14:
                    quebra = true;
                    break;
                default:
                    System.out.println("O valor selecionado é inválido. Retornando ao menu inicial...");
                    break;
                
            }
            
            System.out.println("");
    
        } while(quebra != true);
    
        System.out.println("Obrigado por testar a nossa classe!");
    }
}