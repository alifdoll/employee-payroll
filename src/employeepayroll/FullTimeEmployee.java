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
public class FullTimeEmployee extends Employee{
    
    private int children;
    private int workYear;
    
    public FullTimeEmployee(String id, String name, double salary, int children, int workYear){
        super(id, name, salary);
        this.children = children;
        this.workYear = workYear;
    }
    
    
    

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getWorkYear() {
        return workYear;
    }

    public void setWorkYear(int workYear) {
        this.workYear = workYear;
    }

    @Override
    protected double getTotalSalary() {
        
        double child = (0.1 * getMainSalary()) * children;
        double year = (0.01 * getMainSalary()) * workYear;
        
        double totalSalary = getMainSalary() + child + year;
        return totalSalary;
    }
    
    
}
