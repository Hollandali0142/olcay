public class deneme1 {

    public static void main(String[] args) {
        /*
        * method referansi:CLASS ISMI:Method ismi(bu methodun olmayacak())
        * orn==>String::Length
        * ArrayList::size
        *
        * */

        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        elyazdirFunctional(l);
        CiftSayiYazdir(l);
    }
    //List elemanlarini bir bosluk birakarak ayni satirda yazdiran bir method olusturun

    public static void elyazdirFunctional(List<Integer>l){
        l.stream().forEach(Utils::ayniuSatirdaBirboslukbirakYazdir);



    }
    ///List elemanlarindan cift olanlari bir bosluk birakarak ayni satirda yazdiran bir method olusturun

    public Satatic void CiftSayiYazdir(int x){

        l.stream().filter(Utils::ciftSayiAl).forEach(Utils::ayniuSatirdaBirboslukbirakYazdir);

    }
    //Cift sayilarin karesini bir bosluk birakarak ayni satirda yazdiran bir method olusturun

    public Satatic void CiftSayilarinKaresi(Listint <integer>l){

        l.stream().filter(Utils::ciftSayiAl).map.(Utils.sayiniKaresiniAlsin()).forEach(Utils::ayniuSatirdaBirboslukbirakYazdir);

    }

    //Birbirinden farkli olan tek sayilarin kuplerinin carpimini yazdiran bir method olusturun

    public Satatic void farkliSayilarinkupleriCarpimi(list<Integer>){

        l.stream().distinctr().


    }
}
