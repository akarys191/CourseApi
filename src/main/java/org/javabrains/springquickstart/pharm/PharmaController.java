package org.javabrains.springquickstart.pharm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PharmaController {

    @Autowired
    private MedicineService medicineService;

    @RequestMapping("/medicines")
    public List<Medicine> getAllMedicines(){
        return medicineService.getAllMedicines();
    }

    public Medicine getMedicine(String id){
        return
    }



}
