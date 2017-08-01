/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mike.yutub.messenger.model;

import java.io.Serializable;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GERALVARADO
 */
@Entity
@Table(name = "TABLA_BORRAME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TablaBorrame.findAll", query = "SELECT t FROM TablaBorrame t")
    , @NamedQuery(name = "TablaBorrame.findByIdBorrame", query = "SELECT t FROM TablaBorrame t WHERE t.idBorrame = :idBorrame")
    //  , @NamedQuery(name = "TablaBorrame.findByIdEmpleado", query = "SELECT t FROM TablaBorrame t WHERE t.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "TablaBorrame.findByDato1", query = "SELECT t FROM TablaBorrame t WHERE t.dato1 = :dato1")
    , @NamedQuery(name = "TablaBorrame.findByDato2", query = "SELECT t FROM TablaBorrame t WHERE t.dato2 = :dato2")
    , @NamedQuery(name = "TablaBorrame.findByDato3", query = "SELECT t FROM TablaBorrame t WHERE t.dato3 = :dato3")})
public class TablaBorrame implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_BORRAME")
    private String idBorrame;
    /*
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ID_EMPLEADO")
    private String idEmpleado;
     */
    @Size(max = 20)
    @Column(name = "DATO_1")
    private String dato1;
    @Size(max = 20)
    @Column(name = "DATO_2")
    private String dato2;
    @Size(max = 20)
    @Column(name = "DATO_3")
    private String dato3;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EMPLEADO")
    @JsonbTransient
    private Empleado owner;

    public TablaBorrame() {
    }

    public TablaBorrame(String idBorrame) {
        this.idBorrame = idBorrame;
    }

    public String getIdBorrame() {
        return idBorrame;
    }

    public void setIdBorrame(String idBorrame) {
        this.idBorrame = idBorrame;
    }

    public Empleado getOwner() {
        return owner;
    }

    public void setOwner(Empleado owner) {
        this.owner = owner;
        if (!owner.getPhones().contains(this)) { // warning this may cause performance issues if you have a large data set since this operation is O(n)
            owner.getPhones().add(this);
        }
    }

    public String getDato1() {
        return dato1;
    }

    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    public String getDato3() {
        return dato3;
    }

    public void setDato3(String dato3) {
        this.dato3 = dato3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBorrame != null ? idBorrame.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablaBorrame)) {
            return false;
        }
        TablaBorrame other = (TablaBorrame) object;
        if ((this.idBorrame == null && other.idBorrame != null) || (this.idBorrame != null && !this.idBorrame.equals(other.idBorrame))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mike.yutub.messenger.model.TablaBorrame[ idBorrame=" + idBorrame + " ]";
    }

}
