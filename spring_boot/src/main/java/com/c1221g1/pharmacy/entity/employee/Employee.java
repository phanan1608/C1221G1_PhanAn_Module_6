package com.c1221g1.pharmacy.entity.employee;

import com.c1221g1.pharmacy.entity.import_invoice.ImportInvoice;
import com.c1221g1.pharmacy.entity.user.Users;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    private String employeeId;
    private String employeeName;
    @Column(columnDefinition = "LONGTEXT")
    private String employeeImage;
    private String employeeAddress;
    private String employeePhone;
    @Column(columnDefinition = "DATE")
    private String employeeDateStart;

    private String employeeNote;
    @Column(columnDefinition = "BIT")
    private boolean flag;
    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "positionId")
    private Position position;
    @OneToOne
    @JoinColumn(name = "employee_username", referencedColumnName = "username")
    private Users employeeUsername ;
    @OneToMany(mappedBy = "employee")
    private List<ImportInvoice> importInvoiceList;

    public Employee() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeImage() {
        return employeeImage;
    }

    public void setEmployeeImage(String employeeImage) {
        this.employeeImage = employeeImage;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeDateStart() {
        return employeeDateStart;
    }

    public void setEmployeeDateStart(String employeeDateStart) {
        this.employeeDateStart = employeeDateStart;
    }

    public Users getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(Users employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    public String getEmployeeNote() {
        return employeeNote;
    }

    public void setEmployeeNote(String employeeNote) {
        this.employeeNote = employeeNote;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<ImportInvoice> getImportInvoiceList() {
        return importInvoiceList;
    }

    public void setImportInvoiceList(List<ImportInvoice> importInvoiceList) {
        this.importInvoiceList = importInvoiceList;
    }
}
