package src.start.labs.school.entities;

public class Student {

    public String name;
    public double nTrim1, nTrim2, nTrim3;

    public double anualPoints(){
        return nTrim1 + nTrim2 + nTrim3;
    }

    public double missingPoints(){
        if(anualPoints() < 60.0){
            return 60.0 - anualPoints();
        }else{
            return 0.0;
        }
    }
}
