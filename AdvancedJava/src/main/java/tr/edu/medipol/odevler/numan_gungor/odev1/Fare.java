package tr.edu.medipol.odevler.numan_gungor.odev1;


import org.omg.CORBA.PUBLIC_MEMBER;

public class Fare extends Hayvan {


    public void Uyu(){
        System.out.println("uyuyorum");
    }

    @Override
    public void SesCıkar(){
        System.out.println("Ses Çıkarmıyorum");
    }
    @Override
    public void YemekYe(){
        System.out.println("yemek yemiyorum");
    }
}
