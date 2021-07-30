package Random;
public class Tugas3 {

public static void main(String[] main) {
        int sukuPertama = 10;
        int selisih = 5;
        int nilaiTerakhir = 80;
        int updateNilai;
        int total = 0;
        
        System.out.println("Deret Aritmatika");
        for(int i = 1; i <= 3; i++){
            for(int a = 1; a <= 5; a++){
                updateNilai = sukuPertama;
                sukuPertama += selisih;
                System.out.print(" "+updateNilai);
                total += updateNilai;
            }
            System.out.println(" ");
        }
        System.out.println("Total dari keseluruhan nilai : "+total);
    }
}
    

