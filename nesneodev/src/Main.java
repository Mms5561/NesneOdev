public class Main {
    private final String[] yarismacilar;
    private final int[] dakikalar;

    public Main(String[]isimler, int[] minutes){
        this.yarismacilar =isimler;
        this.dakikalar =minutes;
    }

    private String birinciKisi;
    private String ikinciKisi;
    private String ucuncuKisi;

    public int endusukZaman(){
        int birinciOlan = dakikalar[0];
        for (int i = 0; i< dakikalar.length; i++){
            if (birinciOlan> dakikalar[i]){
                birinciOlan = dakikalar[i];
                birinciKisi = yarismacilar[i];
            }
        }
        return birinciOlan;
    }
    public int ikinciZaman(){
        int ikinciOlan = dakikalar[0];
        for (int i = 0; i< dakikalar.length; i++){
            if (dakikalar[i]> endusukZaman() && ikinciOlan> dakikalar[i]){
                ikinciOlan = dakikalar[i];
                ikinciKisi = yarismacilar[i];
            }
        }
        return ikinciOlan;
    }
    public int ucuncuZaman(){
        int ucuncuOlan = dakikalar[0];
        for (int i = 0; i< dakikalar.length; i++){
            if (ucuncuOlan> dakikalar[i] && dakikalar[i]!= endusukZaman() && dakikalar[i]!= ikinciZaman()){
                ucuncuOlan = dakikalar[i];
                ucuncuKisi = yarismacilar[i];
            }
        }
        return ucuncuOlan;
    }
    public void siralama(){
        ucuncuZaman();
        System.out.println("Birinci: "+ birinciKisi + " " + endusukZaman() + "'");
        System.out.println("İkinci: "+ ikinciKisi + " " + ikinciZaman() + "'");
        System.out.println("Üçüncü: "+ ucuncuKisi + " " + ucuncuZaman() + "'");
    }

    public void outputBarChart(){
        int[] frequency = new int[3];
        for (int minute: dakikalar){
            frequency[(minute/100)-2]++;
        }
        System.out.println("A -> "+ frequency[0]);
        System.out.println("B -> "+ frequency[1]);
        System.out.println("C -> "+ frequency[2]);
    }
}