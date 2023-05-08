import ui.UIMenu;

import java.security.spec.RSAOtherPrimeInfo;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahi Salgado", "pediatria");
        myDoctor.showDoctor();

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
    }
}