package com.cibertec.dswii_ef_soap_sebastian_rivera.endPoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cibertec.dswii_ef_soap_sebastian_rivera.objects.GetTarjetasRequest;
import com.cibertec.dswii_ef_soap_sebastian_rivera.objects.GetTarjetasResponse;
import com.cibertec.dswii_ef_soap_sebastian_rivera.service.TarjetaCreditoService;

@Endpoint
public class TarjetasCreditoEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private TarjetaCreditoService tarjetaCreditoService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTarjetasRequest")
    @ResponsePayload
    public GetTarjetasResponse getTarjetas(@RequestPayload GetTarjetasRequest request) {
        return tarjetaCreditoService.getTarjetas();
    }
}
