import java.util.ArrayList;
import java.util.List;

public class Departman{

    public Departman() {

    }

    public class teamLead {

        Erkek lead;

        public teamLead(Erkek lead) {
            this.lead = lead;

        }
    }

    List<Erkek> personelList;
    List<String> assignmentList;


    public Departman(teamLead teamLead2)
    {
        personelList = new ArrayList<Erkek>();
        assignmentList = new ArrayList<>();

        personelList.add(teamLead2.lead);
    }

    public void teamLeadDegistirme(Erkek newLead)
    {
        teamLead teamLead = new teamLead(newLead);
        personelList.add(newLead);
        personelList.remove(this.personelList.get(0));
        System.out.println("Team Lead Değiştirildi: "+ newLead);
    }
    public void personelEkleme(Personel eklenecekKisi)
    {
        personelList.add((Erkek) eklenecekKisi);
        System.out.println("Personel eklendi! Eklenen kisi: "+ eklenecekKisi);
        System.out.println("Guncel personel listesi: "+personelList);

    }
    public void personelCikarma(Personel cikarilacakKisi)
    {
        personelList.remove(cikarilacakKisi);
        System.out.println("Personel cikarildi! Cikarilacak kisi: "+ cikarilacakKisi);
        System.out.println("Guncel personel listesi: "+personelList);
    }
    public void personelDegistirme(Personel cikarilacakEskiKisi, Erkek eklenecekYeniKisi)
    {
        personelList.remove(cikarilacakEskiKisi);
        personelList.add(eklenecekYeniKisi);
        System.out.println("Personel Degistirildi! Yeni Eklenen Kisi: " + eklenecekYeniKisi);
        System.out.println("Guncel personel listesi: "+ personelList);
    }
    public void gorevEkleme(String gorev)
    {
        assignmentList.add(gorev);
        System.out.println("Gorev eklemesi basarili! Eklenen Gorev: " +gorev);
    }

    public void goreviTamamlandiOlarakIsaretleme(String tamamlama)
    {
        assignmentList.remove(tamamlama);
        System.out.println("Gorev tamamlandi!");
    }


}
