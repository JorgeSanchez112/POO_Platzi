import javax.print.Doc;

public class Doctor {
    static int id; //Autoincrement
    String name;
    String speciality;

    public Doctor(String name){
        this.name = name;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
}

