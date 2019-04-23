package com.wipro.wiproregistrationapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidationUtilityTest {
    // ******************************** EMAIL VALIDATION *******************************************
    @Test
    public void emailValidationCorrectEmailReturnTrue() {
        assertTrue(ValidationUtility.isEmailValidFormat("torres@gmail.com"));
    }

    @Test
    public void emailValidationIncorrectDomainNameReturnFalse() {
        assertFalse(ValidationUtility.isEmailValidFormat("torres@gmail."));
    }

    @Test
    public void emailValidationIncorrectEmailUsernameReturnFalse() {
        assertFalse(ValidationUtility.isEmailValidFormat("@hotmail.com"));
    }

    @Test
    public void emailValidationIncorrectEmailEmptyStringReturnFalse() {
        assertFalse(ValidationUtility.isEmailValidFormat(""));
    }

    @Test
    public void emailValidationIncorrectEmailNoAddressSignReturnFalse() {
        assertFalse(ValidationUtility.isEmailValidFormat("torres.gmail.com"));
    }

    @Test
    public void emailValidationIncorrectEmailMultipleAddressSignsReturnFalse() {
        assertFalse(ValidationUtility.isEmailValidFormat("torres@fernando@gmail.com"));
    }

    @Test
    public void emailValidationIncorrectEmailMultipleDotCharactersReturnFalse() {
        assertFalse(ValidationUtility.isEmailValidFormat("torres@gmail...com"));
    }

    @Test(expected = NullPointerException.class)
    public void emailValidationIncorrectEmailNullValueReturnFalse() {
        assertFalse(ValidationUtility.isEmailValidFormat(null));
    }

    // ******************************** STRING VALIDATION ******************************************
    @Test
    public void stringValidationCorrectStringLowerCapitalLettersReturnTrue() {
        assertTrue(ValidationUtility.isString("Kildare"));
    }

    @Test
    public void stringValidationIncorrectStringBlankSpaceReturnFalse() {
        assertFalse(ValidationUtility.isString("Dublin North"));
    }

    @Test
    public void stringValidationIncorrectStringNumbersProvidedReturnFalse() {
        assertFalse(ValidationUtility.isString("Dublin12"));
    }

    @Test
    public void stringValidationIncorrectStringEmptyValueReturnFalse() {
        assertFalse(ValidationUtility.isString(""));
    }

    @Test
    public void stringValidationIncorrectStringNonLetterCharactersReturnFalse() {
        assertFalse(ValidationUtility.isString("_*/=+()'>"));
    }

    // ******************************** EIRCODE VALIDATION *****************************************
    @Test
    public void eircodeValidationCorrectEircodeReturnTrue() {
        assertTrue(ValidationUtility.isEircodeValidFormat("D08X2A5"));
    }

    @Test
    public void eircodeValidationIncorrectEircodeNonLetterOrNonDigitCharactersReturnFalse() {
        assertFalse(ValidationUtility.isEircodeValidFormat("_RE45+-/>"));
    }

    @Test
    public void eircodeValidatorIncorrectEircodeEmptyValueReturnFalse() {
        assertFalse(ValidationUtility.isEircodeValidFormat(""));
    }
}