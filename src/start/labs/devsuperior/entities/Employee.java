package src.start.labs.devsuperior.entities;

public class Employee {

    private String name;
    private Double salary;
    private Integer idNumber;

    public Employee(){
    }

    public Employee(String name, Double salary, Integer idNumber){
        this.name = name;
        this.salary = salary;
        this.idNumber = idNumber;
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

    public double increaseSalary(double percentage){
        salary = salary + (salary * 0.1);
        return salary;
    }
}
