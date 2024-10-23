package com.cibertec.dswii_ef_soap_sebastian_rivera.exception;


@SoapFault(faultCode = FaultCode.CUSTOM,
customFaultCode = "{http://www.cibertec.edu.pe/ws}001")
public class NotFoundException {

    public NotFoundException(String message){
        super(message);
    }
}
