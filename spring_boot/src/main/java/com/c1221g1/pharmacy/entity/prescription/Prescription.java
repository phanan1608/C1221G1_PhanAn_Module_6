package com.c1221g1.pharmacy.entity.prescription;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Prescription {
    @Id
    private String prescriptionId;
    private String prescriptionName;
    private String prescriptionSymptom;
    private String prescriptionObject;
    private Integer prescriptionNumberOfDays;
    private Boolean flag;
    @OneToMany(mappedBy = "prescription")
    private List<MedicinePrescription> medicinePrescriptionList;

    public Prescription() {
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    public String getPrescriptionSymptom() {
        return prescriptionSymptom;
    }

    public void setPrescriptionSymptom(String prescriptionSymptom) {
        this.prescriptionSymptom = prescriptionSymptom;
    }

    public String getPrescriptionObject() {
        return prescriptionObject;
    }

    public void setPrescriptionObject(String prescriptionObject) {
        this.prescriptionObject = prescriptionObject;
    }

    public Integer getPrescriptionNumberOfDays() {
        return prescriptionNumberOfDays;
    }

    public void setPrescriptionNumberOfDays(Integer prescriptionNumberOfDays) {
        this.prescriptionNumberOfDays = prescriptionNumberOfDays;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public List<MedicinePrescription> getMedicinePrescriptionList() {
        return medicinePrescriptionList;
    }

    public void setMedicinePrescriptionList(List<MedicinePrescription> medicinePrescriptionList) {
        this.medicinePrescriptionList = medicinePrescriptionList;
    }
}
