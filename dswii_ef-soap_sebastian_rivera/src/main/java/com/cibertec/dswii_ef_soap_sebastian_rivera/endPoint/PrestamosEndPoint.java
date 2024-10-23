package com.cibertec.dswii_ef_soap_sebastian_rivera.endPoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cibertec.dswii_ef_soap_sebastian_rivera.objects.GetPrestamosRequest;
import com.cibertec.dswii_ef_soap_sebastian_rivera.objects.GetPrestamosResponse;
import com.cibertec.dswii_ef_soap_sebastian_rivera.service.PrestamoService;

@Endpoint
public class PrestamosEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private PrestamoService prestamoService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPrestamosRequest")
    @ResponsePayload
    public GetPrestamosResponse getPrestamos(@RequestPayload GetPrestamosRequest request) {
        return prestamoService.findByIdCliente(request);
    }
}
