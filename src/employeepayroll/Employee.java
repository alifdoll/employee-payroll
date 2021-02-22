/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeepayroll;

/**
 *
 * @author alif
 */
public abstract class Employee {
    
    private String id;
    private String name;
    private double mainSalary;
    
    public Employee(String id, String name, double salary){
        this.id = id;
        this.name = name;
        this.mainSalary = salary;
    }
    protected abstract double getTotalSalary();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMainSalary() {
        return mainSalary;
    }
}
