//oop technique used to hide data from direct access.
public class Encapsulation {
    
    private int StudentID, StudentBankDetails;
    private String StudentCrush;

//constructor
    Encapsulation(int StudentID, int StudentBankDetails, String StudentCrush){
        this.StudentID = StudentID;
        this.StudentBankDetails = StudentBankDetails;
        this.StudentCrush = StudentCrush;
    }
//setter
    void setStudentID(int StudentID){
        this.StudentID = StudentID;
    }
//getter
    int getStudentID(){
        return StudentID;
    }        
    int getStudentBankDetails(){
        return StudentBankDetails;
    }
    String getStudentCrush(){
        return StudentCrush;

    }
}
