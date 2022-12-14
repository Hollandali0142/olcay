import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class deneme {

    public static void main(String[] args) {

        List<Integer> lt = new ArrayList<Integer>();
        lt.add(2);
        lt.add(9);
        lt.add(131);
        lt.add(4);
        lt.add(9);
        lt.add(6);
        lt.add(2);
        lt.add(6);
        lt.add(15);
        System.out.println(lt);// [12, 9, 131, 14, 9, 10, 4, 12, 15]
        kupunuAlTekliSayi(lt);
        farkliCiftsayitoplami(lt);
        farkliCiftSayiKupleriCarpimi(lt);
        enBuyukDeger(lt);


    }


    public static void kupunuAlTekliSayi(List<Integer> lt) {
        // lt.stream().filter(t -> t % 2 != 0).distinct().map(t -> t * t * t).forEach(t-> System.out.print(t +" "));
        lt.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }


    //5 List elemanlarindan birbirinden farkli olan cift sayilarin karelerinin toplamini bulan bir method olusturun

    public static void farkliCiftsayitoplami(List<Integer> lt) {

        Integer toplam = lt.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);

        System.out.println(toplam);
    }

    // 6 List elemanlarindan birbirinden farkli olan cift sayilarin kuplerinin carpimini bulan bir method olusturun

    public static void farkliCiftSayiKupleriCarpimi(List<Integer> lt) {

        Integer carpma = lt.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);

        System.out.println(carpma);


    }

    //7 List'in elemanlarindan en buyuk degeri bulan bir method olusturun

    public static void enBuyukDeger(List<Integer> lt) {

        Integer enbuyukSayi = lt.stream().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);

        System.out.println(enbuyukSayi);
        System.out.println(Integer.MIN_VALUE);


    }

    //8 Listin elemanlarindan en kucuk degeri bulan bir method olusturun

    public static void enKucukDeger(List<Integer> lt) {

        Integer enKucukSayi = lt.stream().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);

        System.out.println(enKucukSayi);
        System.out.println(Integer.MAX_VALUE);
    }

        //9-Listte 7 den buyuk olan enkucuk cift sayi bulan bir method yaziniz

        public static void YdidenBuyukCiftDeger(List<Integer> lt){

            lt.stream().distinct().filter(t->(t%2==0 && t>7)).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->);


        }

        //10. Elemanlarin yarisini alan  birbirinden farkli ve 5 ten buyuk olan list icinde   buyukten kucuge siralanan bir method olusturun

                   public static void yarisiniAl(List<Integer> lt){

                       List<Double> sonuc= lt.stream().distinct().filter(t->t>5).map(t->/2).sorted(Comparator.reverseOrder()).collect(Collectors.toCollection());

                       System.out.println(sonuc);



                   }




}