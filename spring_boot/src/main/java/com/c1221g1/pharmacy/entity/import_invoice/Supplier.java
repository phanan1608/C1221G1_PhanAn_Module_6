package com.c1221g1.pharmacy.entity.import_invoice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Supplier {
    @Id
    private String supplierId;
    private String supplierName;
    private String supplierAddress;
    private String supplierPhone;
    private String supplierEmail;
    @Column(columnDefinition = "TEXT")
    private String note;
    @Column(columnDefinition = "BIT")
    private boolean flag;
    @OneToMany(mappedBy = "supplier")
    private List<ImportInvoice> importInvoiceList;

    public Supplier() {
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public boolean isFlag() {
        return flag;
    }

    public List<ImportInvoice> getImportInvoiceList() {
        return importInvoiceList;
    }

    public void setImportInvoiceList(List<ImportInvoice> importInvoiceList) {
        this.importInvoiceList = importInvoiceList;
    }
}

