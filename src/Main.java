// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Boger b1=new Boger(1,"Eragon","Paolini");

Boger b2=new Boger(2,"The Eldest", "Paolini");

Boger b3=new Boger(3,"Brisingr","Paolini");


       /* b1.udlaanBog(true,"Rasmus","09.Juli. 2000");
        System.out.println(b1);
        b2.udlaanBog(true,"Torben","25. dec. 2022");
        System.out.println(b2);
        b3.udlaanBog(true,"Jakob","19. juni. 2012");
        System.out.println(b3);
        b1.afleverBog();
        System.out.println(b1);*/
Laaner l1=new Laaner(1,"Rasmus","Islandsgade 23","12345678");
        b1.udlaanBog(l1,"25");
        System.out.println(b1);






    }
}