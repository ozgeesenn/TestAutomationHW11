public class Personel {

    String ad = "";
    String soyad = "";
    String dogumTarihi = "";

    public Personel(String ad, String soyad, String dogumTarihi)
    {
        this.ad=ad;
        this.soyad=soyad;
        this.dogumTarihi=dogumTarihi;
    }

    public void emekliOlmaZamaniHesapla()
    {

        int kYas = 0;
        int eYas = 0;

        if(kYas >=65 && eYas>=60)
        {
            System.out.println("Emekli oldunuz!");

        }
        else
        {
            System.out.println("Emekli yasini henüz doldurmadiniz!");
        }

    }
}

class Erkek extends Personel
{
    int yas;

    public Erkek(String ad, String soyad, String dogumTarihi)
    {
        super(ad,soyad,dogumTarihi);
    }

}

class Kadin extends Personel
{
    int yas;

    public Kadin(String ad, String soyad, String dogumTarihi)
    {
        super(ad,soyad,dogumTarihi);
    }


}
