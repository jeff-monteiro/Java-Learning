package src.start.labs.devsuperior.entities;

public class Employee {

    private Integer idNumber;
    private String name;
    private Double salary;

    public Employee(){
    }

    public Employee(Integer idNumber, String name, Double salary){
        this.idNumber = idNumber;
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getSalary(){
        return salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public Integer getIdNumber(){
        return idNumber;
    }

    public void setIdNumber(Integer idNumber){
        this.idNumber = idNumber;
    }

    public void increaseSalary(double percentage){
        salary = salary + (salary * 0.1);
    }
}
