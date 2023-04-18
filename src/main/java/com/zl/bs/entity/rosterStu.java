package com.zl.bs.entity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class rosterStu implements Comparable<rosterStu>{
    private String id;
    private Double maxWorkHours;
    private List<dut> duties;
    private Double workHours;

    public rosterStu(String id, Double maxWorkHours) {
        this.id = id;
        this.maxWorkHours = maxWorkHours;
        this.duties = new ArrayList<>();
        this.workHours = (Double) 0.0;
    }

    public String getId() {
        return id;
    }

    public boolean canWork(Double hours) {
        return workHours + hours <= maxWorkHours;
    }

    public void addWork(Double hours) {
        workHours += hours;
    }

    public void addDuty(dut duty) {
        duties.add(duty);
    }

    public List<dut> getDuties() {
        return duties;
    }

    @Override
    public int compareTo(rosterStu o) {
        return Double.compare(maxWorkHours - workHours, o.maxWorkHours - o.workHours);
    }

}
