package com.zl.bs.entity;
import java.util.ArrayList;
import java.util.List;

public class dut {
    private String id;
    private int maxWorkers;
    private Double workHours;
    private List<rosterStu> workers;

    public dut(String id, int maxWorkers, Double workHours) {
        this.id = id;
        this.maxWorkers = maxWorkers;
        this.workHours = workHours;
        this.workers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public int getMaxWorkers() {
        return maxWorkers;
    }

    public Double getWorkHours() {
        return workHours;
    }

    public List<rosterStu> getWorkers() {
        return workers;
    }

    public void addWorker(rosterStu worker) {
        workers.add(worker);
    }
}
