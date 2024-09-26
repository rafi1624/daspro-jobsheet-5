import java.util.Scanner;

public class pemilihanHariDenganIf24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka ");
        int hari = sc.nextInt();
        if (hari >= 1 && hari <= 5 ) 
        {
            System.out.println("Weekday bang ");    
        }
        else if (hari == 6 || hari == 7) 
        {
            System.out.println(" Weekend bro ");    
        }
        else {
            System.out.println("Kiamat ");
        }
    }
}