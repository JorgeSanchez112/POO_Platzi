public class Patient {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient (String name, String email){
        this.name = name;
        this.email = email;
        this.weight = 54.5;
        System.out.println("Peso: " + weight + " Kg.");
    }
}