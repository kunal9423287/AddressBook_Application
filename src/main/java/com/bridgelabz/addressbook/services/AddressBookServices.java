package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServices implements  IAddressBookServices{

    @Override
    public AddressBookModel seeAddressBook() {
        AddressBookDTO addressBookDTO=new AddressBookDTO();
        addressBookDTO.setFullName("kunal sonawane");
        addressBookDTO.setAddress("police colony");
        addressBookDTO.setCity("dhule");
        addressBookDTO.setZipcode(465447);
        addressBookDTO.setState("MH");
        AddressBookModel addressBookModel=new AddressBookModel(78751651389, addressBookDTO);

        return addressBookModel;
    }

    @Override
    public AddressBookModel addingAddress(AddressBookDTO addressBookDTO) {
        AddressBookModel addressBookModel=new AddressBookModel(78751651389, addressBookDTO);

        return addressBookModel;
    }

    @Override
    public AddressBookModel updateAddress(long phoneNumber, AddressBookDTO addressBookDTO) {
        AddressBookModel addressBookModel=new AddressBookModel(phoneNumber, addressBookDTO);

        return addressBookModel;
    }

    @Override
    public AddressBookModel deleteAddress(long phoneNumber) {
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