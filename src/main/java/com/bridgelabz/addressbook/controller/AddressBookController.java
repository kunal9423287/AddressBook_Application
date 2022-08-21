package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("addressbook")
public class AddressBookController {
    @GetMapping(value = { "","/","/home"})
    public AddressBookModel seeAddressBook(){
        AddressBookDTO addressBookDTO=new AddressBookDTO();
        addressBookDTO.setFullName("kunal sonawane");
        addressBookDTO.setAddress("police colony");
        addressBookDTO.setCity("dhule");
        addressBookDTO.setZipcode(465447);
        addressBookDTO.setState("MH");
        AddressBookModel addressBookModel=new AddressBookModel(7987359946l, addressBookDTO);

        return addressBookModel;
    }
    

    public AddressBookModel seeAddress(@RequestParam(value = "phoneNumber") long phoneNumber){

        AddressBookDTO addressBookDTO=new AddressBookDTO();
        addressBookDTO.setFullName("dhiraj sonawane");
        addressBookDTO.setAddress("kumar nagar");
        addressBookDTO.setCity("dhule");
        addressBookDTO.setZipcode(465447);
        addressBookDTO.setState("MH");
        AddressBookModel addressBookModel=new AddressBookModel(phoneNumber, addressBookDTO);

        return addressBookModel;    }
    
   @GetMapping("/addressOF/{name}")
   public AddressBookModel seeAddressOF(@PathVariable long phoneNumber){
       AddressBookDTO addressBookDTO=new AddressBookDTO();
       addressBookDTO.setFullName("kunal sonawane");
       addressBookDTO.setAddress("police colony");
       addressBookDTO.setCity("dhule");
       addressBookDTO.setZipcode(465447);
       addressBookDTO.setState("MH");
       AddressBookModel addressBookModel=new AddressBookModel(phoneNumber, addressBookDTO);

       return addressBookModel;         }
    
    @PostMapping("/creatingAddress")
    public AddressBookModel adddingAddress(@RequestBody AddressBookDTO addressBookDTO) {

        AddressBookModel addressBookModel=new AddressBookModel(78751651389, addressBookDTO);

        return addressBookModel;         }

    @PutMapping("/updateAdress")
    public AddressBookModel updateAddress(@RequestBody AddressBookDTO addressBookDTO , @RequestParam(value = "phoneNumber") long phoneNumber) {
        AddressBookModel addressBookModel=new AddressBookModel(78751651389, addressBookDTO);

        return addressBookModel;          }

    @DeleteMapping("/deleteAddress/{id}")
    public AddressBookModel deleteAddress(@PathVariable long phoneNumber) {
        AddressBookDTO addressBookDTO=new AddressBookDTO();
        addressBookDTO.setFullName("kunal sonawane");
        addressBookDTO.setAddress("police colony");
        addressBookDTO.setCity("dhule");
        addressBookDTO.setZipcode(465447);
        addressBookDTO.setState("MH");
        AddressBookModel addressBookModel=new AddressBookModel(phoneNumber, addressBookDTO);

        return addressBookModel;
}

}