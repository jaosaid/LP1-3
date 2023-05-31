// João Antonio Dias CB3020479

public class DataTeste extends Data {
    
    public static void main(String[] args)
    {
        Data data = new Data();
	System.out.println(data.mostra1());
	System.out.println(data.mostra2());
	System.out.println("Dias transcorridos: " + data.diasTranscorridos());
	data.apresentaDataAtual();
    }
        
}
