import java.util.Scanner; // import edip kullanacağım scanner
public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;  // değişkenleri belirle ve oluştur

        Scanner inp = new Scanner(System.in);  //Scanner sınıfı tanımlama
        // kullanıcıdan değerleri al

        System.out.print(" Matematik Notunuzu Girin : ");   // ortalamaya katılacak mat notu için değer girin
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print(" Fizik Notunuzu Girin : ");       // ortalamaya katılacak fizik notu için değer girin
        fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.print(" Kimya Notunuzu Girin : ");
        kimya = inp.nextInt();
        System.out.println(kimya);

        System.out.print(" Turkce Notunuzu Girin : ");
        turkce = inp.nextInt();
        System.out.println(turkce);

        System.out.print(" Muzik Notunuzu Girin : ");
        muzik = inp.nextInt();
        System.out.println(muzik);

        int toplam = (mat + fizik + kimya + turkce + muzik);  // tüm ders notlarını topla
        double sonuc =(toplam / 5.0);                                  // Toplanan dersleri ders sayısına böl
        System.out.println("Dersleriniz Ortalaması :" + sonuc);          // çıkan sonucu yazdır
        String ortalama = sonuc >= 55 ? "Sinifi Gectiniz :Basarılı " : "Sinif Tekrari :Basarisiz ";
        // sonuc 55 dan büyük veya küçükse duruma göre geçti kaldıyı yazdır
        System.out.println(ortalama);
    }
}    // Ali Eren KÖSE 22/02/2024    04:36