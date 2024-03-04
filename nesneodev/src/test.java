public class test {
    public static void main(String[] args) {
        int[] minutes={341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
        String[] isimler={"Kadir","Gökhan","Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        Main zamanSiralama=new Main(isimler,minutes);
        zamanSiralama.siralama();
        zamanSiralama.outputBarChart();
    }
}