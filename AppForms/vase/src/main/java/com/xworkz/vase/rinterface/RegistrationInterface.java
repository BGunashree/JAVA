package com.xworkz.vase.rinterface;

import com.xworkz.vase.dto.RegistrationDTO;


public interface RegistrationInterface {

	boolean validateAndSave(RegistrationDTO dto);
}
