package Ders09Lab.Ornek1;

/**
 *
 * @author anizam
 */
public class OgrenciNot {

    int ogrenciNo;
    String dersAdi;
    int[] notlar;

    int getNotOrtalama() {
        int toplam = 0;

        for (int i = 0; i < notlar.length; i++) {
            toplam += notlar[i];
        }

        return (toplam / notlar.length);
    }
    
    
    OgrenciNot(int ogrenciNo, String dersAdi, int[] notlar){
        this.ogrenciNo = ogrenciNo;
        this.dersAdi = dersAdi;
        this.notlar = notlar;
    }
    
    
}
