package ProjectClass;

import java.util.Scanner;

public class PolindromChecker {
    public static void main(String[] args) {

        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuyoruz.
        Scanner input = new Scanner(System.in);

        // Kullanıcıya bir kelime girmesini söylüyoruz.
        System.out.println("Bir kelime girin: ");
        String kelime = input.nextLine();  // Kullanıcının girdiği kelimeyi alıyoruz.

        // Girilen kelimeyi tersine çeviriyoruz.
        // "StringBuilder" nesnesini kullanarak kelimeyi tersine çeviriyoruz.
        // "toString()" metodu ise "StringBuilder" nesnesini bir "String" nesnesine dönüştürür.
        String tersKelime = new StringBuilder(kelime).reverse().toString();

        // Girilen kelimenin ters haliyle aynı olup olmadığını kontrol ediyoruz.
        if(kelime.equals(tersKelime)) {
            System.out.println(kelime + " polindromik bir kelimedir."); // Eşitse, polindromik olduğunu belirtiyoruz.
        } else {
            System.out.println(kelime + " polindromik bir kelime değildir"); // Değilse, polindromik olmadığını belirtiyoruz.
        }

        // Kaynakları serbest bırakmak için Scanner'ı kapatıyoruz.
        input.close();
    }
}
