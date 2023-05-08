import javax.print.Doc;
import java.sql.SQLOutput;

public class Doctor {
    static int id; //Autoincrement
    String name;
    String email;
    String speciality;

    public Doctor(String name, String speciality){
        System.out.println("El nombre del doctor es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showDoctor(){
        System.out.println("Nombre del doctor: " + name + ". Especialidad: " + speciality);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}

