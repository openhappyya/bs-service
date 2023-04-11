package com.zl.bs.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-03
 */
@TableName("scrapy_job")
public class Job implements Serializable {

    private static final long serialVersionUID = 1L;
    private String jobName;
    private String jobUrl;
    private String jobArea;
    private String firmName;
    private String education;
    private String companyTag;
    private String companyType;
    private String salaryMin;
    private String expMin;
    private String postTime;
    private String language;
    private String jobWelfare;
    private String address;
    private String jobDescription;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobUrl() {
        return jobUrl;
    }

    public void setJobUrl(String jobUrl) {
        this.jobUrl = jobUrl;
    }

    public String getJobArea() {
        return jobArea;
    }

    public void setJobArea(String jobArea) {
        this.jobArea = jobArea;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCompanyTag() {
        return companyTag;
    }

    public void setCompanyTag(String companyTag) {
        this.companyTag = companyTag;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(String salaryMin) {
        this.salaryMin = salaryMin;
    }

    public String getExpMin() {
        return expMin;
    }

    public void setExpMin(String expMin) {
        this.expMin = expMin;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getJobWelfare() {
        return jobWelfare;
    }

    public void setJobWelfare(String jobWelfare) {
        this.jobWelfare = jobWelfare;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Job{" +
        ", jobName = " + jobName +
        ", jobUrl = " + jobUrl +
        ", jobArea = " + jobArea +
        ", firmName = " + firmName +
        ", education = " + education +
        ", companyTag = " + companyTag +
        ", companyType = " + companyType +
        ", salaryMin = " + salaryMin +
        ", expMin = " + expMin +
        ", postTime = " + postTime +
        ", language = " + language +
        ", jobWelfare = " + jobWelfare +
        ", address = " + address +
        ", jobDescription = " + jobDescription +
        "}";
    }
}
