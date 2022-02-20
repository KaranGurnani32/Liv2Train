package com.karan.Liv2Train.model;

import java.time.LocalDateTime;
import java.util.List;

public class TrainingCenter {
    private String centerName;
    private String centerCode;
    private Address address;
    private int studentCapacity;
    private List<String> courses;
    private LocalDateTime createdOn;
    private String contactEmail;
    private String contactPhone;

    public TrainingCenter(String centerName, String centerCode, Address address,
                          int studentCapacity, List<String> courses,
                          String createdOn, String contactEmail, String contactPhone) {
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.address = address;
        this.studentCapacity = studentCapacity;
        this.courses = courses;
        this.createdOn = LocalDateTime.now();
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
