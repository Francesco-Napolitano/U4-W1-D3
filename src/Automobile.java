// definizione di classe
public class Automobile {

    //campi (o attributi o stati)

    //private [static] [final] tipoCampo nomeCampo

    private String modello;
    private String colore;
    private String targa;
    private double benzina;
    private final double serbatoio;
    private String[] passeggeri;
    private int numeroPasseggeri;

   // private Persona conducente;

    //metodi (i costruttori)
    public Automobile(String chooseModel, double serbatoio){
        this.modello = chooseModel;
        //inizializzare i valori (campi) dell'oggetto
        this.serbatoio = serbatoio;
    }

    public Automobile(String chooseModel, String chooseColor, String licensePlate, double serbatoio, int maxPasseggeri){
        this.modello = chooseModel;
        this.colore = chooseColor;
        this.targa = licensePlate;
        this.serbatoio = serbatoio;
    }

    //intestazione del metodo
    public String getModello(){
        return this.modello;
    }
    public String getTarga(){
        return this.targa;
    }
    public String getColore(){
        return this.colore;
    }
    public double getBenzina(){
        return this.benzina;
    }
    public double getSerbatoio(){
        return this.serbatoio;
    }


    //creo il metodo set
    public void setBenzina(double litri){
        if(this.benzina + litri > this.serbatoio){
            this.benzina = this.serbatoio;
            System.out.println("Serbatoio pieno !");
        } else {
            this.benzina += litri;
            System.out.println("Rifornimento concluso");
        }

    }
}
