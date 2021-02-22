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
public class PartTimeEmployee extends Employee{
    
    private double transportCost;
    private int workDays;
    
    public PartTimeEmployee(String id, String name, double salary, double transportCost, int workDays){
        super(id, name, salary);
        this.transportCost = transportCost;
        this.workDays = workDays;
    }
    
    

    public double getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(double transportCost) {
        this.transportCost = transportCost;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    @Override
    protected double getTotalSalary() {
        double days = (0.01 * getMainSalary()) * workDays;
        double total = getMainSalary() + transportCost + days;
        return total;
    }
    
    
    
}
