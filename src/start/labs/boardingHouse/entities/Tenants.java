package src.start.labs.boardingHouse.entities;

public class Tenants {

    private String name, email;

    public Tenants(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return name
                + ", "
                + email;

    }


}
