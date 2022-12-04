import java.util.Scanner;

public class etkinlikOnerme {
    public static void main(String[] args) {
        int heat ;



        Scanner in = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz :");
        heat = in.nextInt();

        if ( heat <5 ){
            System.out.println("Kayağa gidebilirsiniz");
        }else if (heat<= 25 ) {
            if (heat<=15){
            System.out.println("Sinemaya gidebilirsiniz ");
          }if (heat>=10){
            System.out.println("Pikniğe gidebilirsiniz");
          }

        }else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }


    }
}
