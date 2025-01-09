public class TestAuto {
    public static void main(String[] args){
        Automobile seicento = new Automobile("Fiat", 45);
        System.out.println(seicento.getBenzina() + " sono i litri iniziali di benzina");
        Automobile clio = new Automobile("Clio", "Gialla","hw922lp", 50);
        seicento.setBenzina(80);
        System.out.println("La macchina ha " + seicento.getBenzina() + " litri" );
    }


}
