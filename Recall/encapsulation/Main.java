public class Main {
    public static void main(String[] args) {
        
        //constructor
        Encapsulation e = new Encapsulation(2022100165, 2023100266, "Raul");
        //setter setting value
        e.setStudentID(2022100165);
        
        //getter getting value
        int ID = e.getStudentID();
        System.out.println(ID);
        
        int Bank = e.getStudentBankDetails();
        System.out.println(Bank);

        String Name = e.getStudentCrush();
        System.out.println(Name);
        //mas secured kasi hindi natin naa-access directly ang encapsulation class naten. Ang gumagawa ng pag-get at pag-set ay sarili nyang class at hindi sa main.


    }
    
}
