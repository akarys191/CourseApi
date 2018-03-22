package org.javabrains.springquickstart.pharm;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MedicineService {

    private List<Medicine> medicines =  Arrays.asList(
            new Medicine("medicine1","Pharmacy","For stomach"),
            new Medicine("medicine1","Pharmacy2","For hand"),
            new Medicine("medicine3","Pharmacy3","For legs"));
    public List<Medicine> getAllMedicines() {
        return medicines;
    }

    public Medicine getMedicine(String id){
        return medicines.stream().filter()
    }
}
