package com.cibertec.dswii_ef_soap_sebastian_rivera.objects;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getPrestamosResponse")
public class GetPrestamosResponse {

    @XmlElement(name = "prestamos")
    protected List<PrestamoType> prestamos;

    public List<PrestamoType> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<PrestamoType> prestamos) {
        this.prestamos = prestamos;
    }
}
