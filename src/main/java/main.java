public class main {

    public static void main(String[] args)
    {
        Erkek teamLead = new Erkek("Serkan","Cura","1985-01-21");
        Departman.teamLead lead = new Departman().new teamLead(teamLead);
        Departman departman = new Departman(lead);

        Erkek eleman1 = new Erkek("Ozge","Sen","1995-05-21");
        departman.personelEkleme(eleman1);

        Erkek eleman2 = new Erkek("Ali","Kaya","1995-01-02");
        departman.personelEkleme(eleman2);

        departman.goreviTamamlandiOlarakIsaretleme("Personel Ekleme Tamamlandi");

        departman.personelCikarma(eleman2);

        departman.goreviTamamlandiOlarakIsaretleme("Personel Cikarilma Tamamlandi");

        Erkek eleman3 = new Erkek("Arda","XXX", "1986-01-03");

        departman.personelDegistirme(eleman1,eleman3);

        departman.goreviTamamlandiOlarakIsaretleme("Personel Degistirme Tamamlandi");

        Erkek teamLeadYeni = new Erkek("AAA","SSSS","1997-08-03");
        departman.teamLeadDegistirme(teamLeadYeni);

        departman.goreviTamamlandiOlarakIsaretleme("Takım Lideri Degisimi Tamamlandi");

        Personel x = new Personel("XX","yy","1944-04-07");
        x.emekliOlmaZamaniHesapla();



    }
}
