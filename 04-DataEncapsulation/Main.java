
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        driving_license dl = new driving_license();
        dl.setfirstName("Jan");
        dl.setlastName("Dąbrowski");
        dl.setage(20);
        dl.setcity("Kraków");
        dl.setpesel("123456789");
        dl.setpostalCode("30-074");
        dl.setdrCategory("car");


        System.out.println(dl);
    
    }
    

}
