package org.javabrains.springquickstart.pharm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/medicines/{id}")
    public Medicine getMedicine(@PathVariable String id){
        return medicineService.getMedicine(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/medicines")
    public  void addMedicine(@RequestBody Medicine medicine){
        medicineService.addMedicine(medicine);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/medicines/{id}")
    public  void updateMedicine(@RequestBody Medicine medicine,@PathVariable String id){
        medicineService.updateMedicine(medicine,id);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/medicines/{id}")
    public  void deleteMedicine(@PathVariable String id){
        medicineService.deleteMedicine(id);
    }



}
