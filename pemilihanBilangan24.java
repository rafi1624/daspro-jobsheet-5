import java.util.Scanner;

public class pemilihanBilangan24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka : ");
        int angka = sc.nextInt();

        //    if angka (angka % == 0) {
        //    System.out.println(" angka " + angka + " bilangan genap ");
        //}
        //else 
        //{
        //    System.out.println(" angka " + angka + " bilangan ganjil ");
        //}

       String hasil = angka % 2 == 0 ? "bilangan genap " : "bilangan ganjil ";  
       System.out.println(hasil);     

    }
}