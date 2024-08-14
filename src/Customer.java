import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private String name;
    private String cpf;
    private Date birthDate;
    private String email;
    private String phoneNumber;

    private Address address;

    public Customer(String name, String cpf, Date birthDate, String email, String phoneNumber, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static Date createBirthDate(String dateString){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try{
            date = sdf.parse(dateString);

        }catch (Exception e){
            System.out.println("não deu certo");
        }
        return date;
    }
}
