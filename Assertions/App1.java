public class App1 {
    
    static boolean iWillNotSmoke = true;
    static boolean iWillNotDrink = true;

    public static void main(String[] args) {
        
    //Agreement 
        //Precondition
        assert iWillNotSmoke == true: "Lagot ka sa tatay nya!";
        
        napasamaBarkada();

        //postCondition
        assert iWillNotDrink == true: "Lagot ka sa tatay ni Arjay!";

    System.out.println(iWillNotSmoke);
    System.out.println(iWillNotDrink);
        
    }

    static void napasamaBarkada(){
        iWillNotDrink = false;
        iWillNotSmoke = false;
    }
}
