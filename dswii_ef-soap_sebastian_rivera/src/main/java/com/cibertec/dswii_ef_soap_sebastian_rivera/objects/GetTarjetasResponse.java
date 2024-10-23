package com.cibertec.dswii_ef_soap_sebastian_rivera.objects;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getTarjetasResponse")
public class GetTarjetasResponse {

    @XmlElement(name = "tarjeta")
    protected List<TarjetaCreditoType> tarjetas;

    public List<TarjetaCreditoType> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<TarjetaCreditoType> tarjetas) {
        this.tarjetas = tarjetas;
    }
}
