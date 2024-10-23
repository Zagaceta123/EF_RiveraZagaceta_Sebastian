package com.cibertec.dswii_ef_soap_sebastian_rivera.endPoint;

import org.springframework.beans.factory.annotation.Autowired;

import com.cibertec.dswii_ef_soap_sebastian_rivera.objects.PostClienteRequest;
import com.cibertec.dswii_ef_soap_sebastian_rivera.objects.PostClienteResponse;
import com.cibertec.dswii_ef_soap_sebastian_rivera.service.ClienteService;

import jakarta.websocket.ClientEndpoint;

@Endpoint
public class ClientesEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private ClienteService clienteService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postClienteRequest")
    @ResponsePayload
    public PostClienteResponse saveCliente(@RequestPayload PostClienteRequest request) {
        return clienteService.save(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateClienteRequest")
    @ResponsePayload
    public PostClienteResponse updateCliente(@RequestPayload PostClienteRequest request) {
        return clienteService.update(request);
    }
}