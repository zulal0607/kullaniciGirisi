import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);
        System.out.print("enter username : ");
        userName = inp.nextLine();

        System.out.print("enter password : ");
        password = inp.nextLine();

        if (userName.equals("patika") && (password.equals("java"))) {
            System.out.println("giriş başarılı ");
        } else {
            System.out.println("giriş başşarısız ");
            System.out.println("1-şifre değiştiricem\n2-istemiyorum ");
            int select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("yeni şifre : " + inp.nextLine());
                    String yeniSifre = inp.nextLine();

                    if (yeniSifre.equals("java")) {
                        System.out.println("şifre eskisiyle aynı olamaz :");
                    } else {
                        System.out.println("yeni şifre oluşturuldu . ");
                    }
                    break;

                case 2:
                    System.out.println("sistemden çıkış yapılıyor . ");
            }
        }
    }
}
