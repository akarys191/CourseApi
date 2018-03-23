package org.javabrains.springquickstart.pharm;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MedicineService {

    private List<Medicine> medicines =  new ArrayList<>(Arrays.asList(
            new Medicine("medicine1","Pharmacy","For stomach"),
            new Medicine("medicine1","Pharmacy2","For hand"),
            new Medicine("medicine3","Pharmacy3","For legs")));
    public List<Medicine> getAllMedicines() {
        return medicines;
    }

    public Medicine getMedicine(String id){
        return medicines.stream().filter(m ->m.getId().equals(id)).findFirst().get();
    }

    public void  addMedicine(Medicine medicine){
        medicines.add(medicine);
    }

    public void  updateMedicine(Medicine medicine, String id){
        for(int i=0;i<medicines.size();i++){
            Medicine medicine1 = medicines.get(i);
            if(medicine1.getId().equals(id)){
                medicines.set(i,medicine);
                return;
            }

        }
    }

    public void  deleteMedicine( String id){
        medicines.removeIf(m->m.getId().equals(id));
    }
}
