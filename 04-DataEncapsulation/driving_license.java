public class driving_license{

    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private String postalCode;
    private String pesel;
    private String drCategory;

    public String toString(){

        String details = " ";
        details += firstName + "," + lastName + "\n";
        details += age + "," + city + "," + postalCode + "\n";
        details += pesel + "," + drCategory + "\n";
        return details;
    }

    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(String firstName){
       this.firstName = firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public int getage(){
        return age;
    }

    public void setage(int age){
        if(age < 18 || age > 99){
            System.out.println("\nInapropriate age!\n");
            return;
        }
        
        this.age = age;
    }

    public String getcity(){
        return city;
    }

    public void setcity(String city){
        this.city = city;
    }

    public String postalCode(){
        return postalCode;
    }

    public void setpostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public String pesel(){
        return pesel;
    }

    public void setpesel(String pesel){
        this.pesel = pesel;
    }

    public String drCategory(){
        return drCategory;
    }

    public void setdrCategory(String drCategory){
        this.drCategory = drCategory;
    }



}



