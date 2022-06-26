package com.c1221g1.pharmacy.entity.medicine;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class MedicineType {
    @Id
    private String medicineTypeId;
    private String medicineTypeName;

    @OneToMany(mappedBy = "medicineType")
    private List<Medicine> medicineList;

    public MedicineType() {
    }

    public String getMedicineTypeId() {
        return medicineTypeId;
    }

    public void setMedicineTypeId(String medicineTypeId) {
        this.medicineTypeId = medicineTypeId;
    }

    public String getMedicineTypeName() {
        return medicineTypeName;
    }

    public void setMedicineTypeName(String medicineTypeName) {
        this.medicineTypeName = medicineTypeName;
    }
}
