/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mike.yutub.messenger.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GERALVARADO
 */
@Entity
@Table(name = "XXADCJ_BIO_EXCEPCIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BioExcepcion.findAll", query = "SELECT b FROM BioExcepcion b")
    , @NamedQuery(name = "BioExcepcion.findByCrPlaza", query = "SELECT b FROM BioExcepcion b WHERE b.crPlaza = :crPlaza")
    , @NamedQuery(name = "BioExcepcion.findByCrTienda", query = "SELECT b FROM BioExcepcion b WHERE b.crTienda = :crTienda")
    , @NamedQuery(name = "BioExcepcion.findByIdEmpleado", query = "SELECT b FROM BioExcepcion b WHERE b.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "BioExcepcion.findByFechaInicio", query = "SELECT b FROM BioExcepcion b WHERE b.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "BioExcepcion.findByFechaFinal", query = "SELECT b FROM BioExcepcion b WHERE b.fechaFinal = :fechaFinal")
    , @NamedQuery(name = "BioExcepcion.findByComentarios", query = "SELECT b FROM BioExcepcion b WHERE b.comentarios = :comentarios")
    , @NamedQuery(name = "BioExcepcion.findByTipoExcepcion", query = "SELECT b FROM BioExcepcion b WHERE b.tipoExcepcion = :tipoExcepcion")
    , @NamedQuery(name = "BioExcepcion.findByIdExcepcion", query = "SELECT b FROM BioExcepcion b WHERE b.idExcepcion = :idExcepcion")
    , @NamedQuery(name = "BioExcepcion.findByCreationDate", query = "SELECT b FROM BioExcepcion b WHERE b.creationDate = :creationDate")
    , @NamedQuery(name = "BioExcepcion.findByUpdateDate", query = "SELECT b FROM BioExcepcion b WHERE b.updateDate = :updateDate")
    , @NamedQuery(name = "BioExcepcion.findByFolio", query = "SELECT b FROM BioExcepcion b WHERE b.folio = :folio")
    , @NamedQuery(name = "BioExcepcion.findByCreatedBy", query = "SELECT b FROM BioExcepcion b WHERE b.createdBy = :createdBy")
    , @NamedQuery(name = "BioExcepcion.findByLastUpdatedBy", query = "SELECT b FROM BioExcepcion b WHERE b.lastUpdatedBy = :lastUpdatedBy")
    , @NamedQuery(name = "BioExcepcion.findByEstatus", query = "SELECT b FROM BioExcepcion b WHERE b.estatus = :estatus")})
public class BioExcepcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 5)
    @Column(name = "CR_PLAZA")
    private String crPlaza;
    @Size(max = 5)
    @Column(name = "CR_TIENDA")
    private String crTienda;
    @Size(max = 15)
    @Column(name = "ID_EMPLEADO")
    private String idEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Size(max = 150)
    @Column(name = "COMENTARIOS")
    private String comentarios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TIPO_EXCEPCION")
    private String tipoExcepcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EXCEPCION")
    private BigDecimal idExcepcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Column(name = "FOLIO")
    private BigInteger folio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "ESTATUS")
    private Character estatus;

    public BioExcepcion() {
    }

    public BioExcepcion(BigDecimal idExcepcion) {
        this.idExcepcion = idExcepcion;
    }

    public BioExcepcion(BigDecimal idExcepcion, Date fechaInicio, Date fechaFinal, String tipoExcepcion, Date creationDate, Date updateDate, String createdBy, String lastUpdatedBy) {
        this.idExcepcion = idExcepcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.tipoExcepcion = tipoExcepcion;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getCrPlaza() {
        return crPlaza;
    }

    public void setCrPlaza(String crPlaza) {
        this.crPlaza = crPlaza;
    }

    public String getCrTienda() {
        return crTienda;
    }

    public void setCrTienda(String crTienda) {
        this.crTienda = crTienda;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getTipoExcepcion() {
        return tipoExcepcion;
    }

    public void setTipoExcepcion(String tipoExcepcion) {
        this.tipoExcepcion = tipoExcepcion;
    }

    public BigDecimal getIdExcepcion() {
        return idExcepcion;
    }

    public void setIdExcepcion(BigDecimal idExcepcion) {
        this.idExcepcion = idExcepcion;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public BigInteger getFolio() {
        return folio;
    }

    public void setFolio(BigInteger folio) {
        this.folio = folio;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExcepcion != null ? idExcepcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BioExcepcion)) {
            return false;
        }
        BioExcepcion other = (BioExcepcion) object;
        if ((this.idExcepcion == null && other.idExcepcion != null) || (this.idExcepcion != null && !this.idExcepcion.equals(other.idExcepcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mike.yutub.messenger.resources.BioExcepcion[ idExcepcion=" + idExcepcion + " ]";
    }
    
}
