package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {

    private String name;
    private int workingHours;
    private int pricePerHour;

    public double salaryCount() {
        return (this.workingHours * this.pricePerHour + 20000);
    }
}

