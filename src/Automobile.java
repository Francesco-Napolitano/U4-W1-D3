// definizione di classe
public class Automobile {

    //campi (o attributi o stati)

    //private [static] [final] tipoCampo nomeCampo

    private String modello;
    private String colore;
    private String targa;
    private double benzina;
   // private Persona conducente;



    //metodi (i costruttori)
    public Automobile(String chooseModel){
        this.modello = chooseModel;
        //inizializzare i valori (campi) dell'oggetto
    }

    public Automobile(String chooseModel, String chooseColor, String licensePlate){
        this.modello = chooseModel;
        this.colore = chooseColor;
        this.targa = licensePlate;
    }

    //intestazione del metodo
    public String getModello(){
        return this.modello;
    }

}
