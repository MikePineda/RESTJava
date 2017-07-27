/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mike.yutub.messenger.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
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
@Table(name = "XXADCJ_EMPLEADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByIdEmpleado", query = "SELECT e FROM Empleado e WHERE e.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "Empleado.findByNombre", query = "SELECT e FROM Empleado e WHERE e.nombre = :nombre")
   // , @NamedQuery(name = "Empleado.findByApPaterno", query = "SELECT e FROM Empleado e WHERE e.apMaterno = :apPaterno")
   // , @NamedQuery(name = "Empleado.findByApMaterno", query = "SELECT e FROM Empleado e WHERE e.apMaterno = :apMaterno")
    , @NamedQuery(name = "Empleado.findByIdEstado", query = "SELECT e FROM Empleado e WHERE e.idEstado = :idEstado")
    , @NamedQuery(name = "Empleado.findByIdFuncion", query = "SELECT e FROM Empleado e WHERE e.idFuncion = :idFuncion")
    , @NamedQuery(name = "Empleado.findByFuncion", query = "SELECT e FROM Empleado e WHERE e.funcion = :funcion")
    , @NamedQuery(name = "Empleado.findByIdPosicion", query = "SELECT e FROM Empleado e WHERE e.idPosicion = :idPosicion")
    , @NamedQuery(name = "Empleado.findByPosicion", query = "SELECT e FROM Empleado e WHERE e.posicion = :posicion")
    , @NamedQuery(name = "Empleado.findByIdPuestoJefe", query = "SELECT e FROM Empleado e WHERE e.idPuestoJefe = :idPuestoJefe")
    , @NamedQuery(name = "Empleado.findByIdDivPer", query = "SELECT e FROM Empleado e WHERE e.idDivPer = :idDivPer")
    , @NamedQuery(name = "Empleado.findByRfc", query = "SELECT e FROM Empleado e WHERE e.rfc = :rfc")
    , @NamedQuery(name = "Empleado.findByEstado", query = "SELECT e FROM Empleado e WHERE e.estado = :estado")
    , @NamedQuery(name = "Empleado.findByFechaCreacionMdm", query = "SELECT e FROM Empleado e WHERE e.fechaCreacionMdm = :fechaCreacionMdm")
    , @NamedQuery(name = "Empleado.findByFechaIngPuesto", query = "SELECT e FROM Empleado e WHERE e.fechaIngPuesto = :fechaIngPuesto")
    , @NamedQuery(name = "Empleado.findByFechaNacimiento", query = "SELECT e FROM Empleado e WHERE e.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Empleado.findByFechaUltimaActualizacion", query = "SELECT e FROM Empleado e WHERE e.fechaUltimaActualizacion = :fechaUltimaActualizacion")
    , @NamedQuery(name = "Empleado.findByIdEmpleadoJefe", query = "SELECT e FROM Empleado e WHERE e.idEmpleadoJefe = :idEmpleadoJefe")
    , @NamedQuery(name = "Empleado.findByIdMdm", query = "SELECT e FROM Empleado e WHERE e.idMdm = :idMdm")
    , @NamedQuery(name = "Empleado.findByIdUnidOrg", query = "SELECT e FROM Empleado e WHERE e.idUnidOrg = :idUnidOrg")
    , @NamedQuery(name = "Empleado.findByUsuarioCreacion", query = "SELECT e FROM Empleado e WHERE e.usuarioCreacion = :usuarioCreacion")
    , @NamedQuery(name = "Empleado.findByUsuarioModificacion", query = "SELECT e FROM Empleado e WHERE e.usuarioModificacion = :usuarioModificacion")
    , @NamedQuery(name = "Empleado.findByCrPlaza", query = "SELECT e FROM Empleado e WHERE e.crPlaza = :crPlaza")
    , @NamedQuery(name = "Empleado.findByCrTienda", query = "SELECT e FROM Empleado e WHERE e.crTienda = :crTienda")
    , @NamedQuery(name = "Empleado.findByDescripcionPlaza", query = "SELECT e FROM Empleado e WHERE e.descripcionPlaza = :descripcionPlaza")
    , @NamedQuery(name = "Empleado.findByDescripcionTienda", query = "SELECT e FROM Empleado e WHERE e.descripcionTienda = :descripcionTienda")
    , @NamedQuery(name = "Empleado.findByFechaIngresoEmpresa", query = "SELECT e FROM Empleado e WHERE e.fechaIngresoEmpresa = :fechaIngresoEmpresa")
    , @NamedQuery(name = "Empleado.findByEstatusXxadcj", query = "SELECT e FROM Empleado e WHERE e.estatusXxadcj = :estatusXxadcj")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ID_EMPLEADO")
    private String idEmpleado;
    @Size(max = 40)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 40)
    @Column(name = "AP_PATERNO")
    private String apPaterno;
    @Size(max = 40)
    @Column(name = "AP_MATERNO")
    private String apMaterno;
    @Size(max = 2)
    @Column(name = "ID_ESTADO")
    private String idEstado;
    @Size(max = 8)
    @Column(name = "ID_FUNCION")
    private String idFuncion;
    @Size(max = 25)
    @Column(name = "FUNCION")
    private String funcion;
    @Size(max = 8)
    @Column(name = "ID_POSICION")
    private String idPosicion;
    @Size(max = 40)
    @Column(name = "POSICION")
    private String posicion;
    @Size(max = 8)
    @Column(name = "ID_PUESTO_JEFE")
    private String idPuestoJefe;
    @Size(max = 4)
    @Column(name = "ID_DIV_PER")
    private String idDivPer;
    @Size(max = 30)
    @Column(name = "RFC")
    private String rfc;
    @Size(max = 23)
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA_CREACION_MDM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacionMdm;
    @Column(name = "FECHA_ING_PUESTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngPuesto;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "FECHA_ULTIMA_ACTUALIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaActualizacion;
    @Size(max = 15)
    @Column(name = "ID_EMPLEADO_JEFE")
    private String idEmpleadoJefe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MDM")
    private BigInteger idMdm;
    @Size(max = 8)
    @Column(name = "ID_UNID_ORG")
    private String idUnidOrg;
    @Size(max = 50)
    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;
    @Size(max = 50)
    @Column(name = "USUARIO_MODIFICACION")
    private String usuarioModificacion;
    @Size(max = 5)
    @Column(name = "CR_PLAZA")
    private String crPlaza;
    @Size(max = 5)
    @Column(name = "CR_TIENDA")
    private String crTienda;
    @Size(max = 25)
    @Column(name = "DESCRIPCION_PLAZA")
    private String descripcionPlaza;
    @Size(max = 25)
    @Column(name = "DESCRIPCION_TIENDA")
    private String descripcionTienda;
    @Column(name = "FECHA_INGRESO_EMPRESA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngresoEmpresa;
    @Size(max = 2)
    @Column(name = "ESTATUS_XXADCJ")
    private String estatusXxadcj;

        @PrePersist
    public void prePersist() {
        this.setFechaUltimaActualizacion(new Date());
        this.setFechaCreacionMdm(new Date());
    }

    @PreUpdate
    public void preUpdate() {
        this.setFechaUltimaActualizacion(new Date());
    }
    
    
    
    public Empleado() {
    }

    public Empleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empleado(String idEmpleado, BigInteger idMdm) {
        this.idEmpleado = idEmpleado;
        this.idMdm = idMdm;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(String idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getIdPosicion() {
        return idPosicion;
    }

    public void setIdPosicion(String idPosicion) {
        this.idPosicion = idPosicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getIdPuestoJefe() {
        return idPuestoJefe;
    }

    public void setIdPuestoJefe(String idPuestoJefe) {
        this.idPuestoJefe = idPuestoJefe;
    }

    public String getIdDivPer() {
        return idDivPer;
    }

    public void setIdDivPer(String idDivPer) {
        this.idDivPer = idDivPer;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacionMdm() {
        return fechaCreacionMdm;
    }

    public void setFechaCreacionMdm(Date fechaCreacionMdm) {
        this.fechaCreacionMdm = fechaCreacionMdm;
    }

    public Date getFechaIngPuesto() {
        return fechaIngPuesto;
    }

    public void setFechaIngPuesto(Date fechaIngPuesto) {
        this.fechaIngPuesto = fechaIngPuesto;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public String getIdEmpleadoJefe() {
        return idEmpleadoJefe;
    }

    public void setIdEmpleadoJefe(String idEmpleadoJefe) {
        this.idEmpleadoJefe = idEmpleadoJefe;
    }

    public BigInteger getIdMdm() {
        return idMdm;
    }

    public void setIdMdm(BigInteger idMdm) {
        this.idMdm = idMdm;
    }

    public String getIdUnidOrg() {
        return idUnidOrg;
    }

    public void setIdUnidOrg(String idUnidOrg) {
        this.idUnidOrg = idUnidOrg;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
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

    public String getDescripcionPlaza() {
        return descripcionPlaza;
    }

    public void setDescripcionPlaza(String descripcionPlaza) {
        this.descripcionPlaza = descripcionPlaza;
    }

    public String getDescripcionTienda() {
        return descripcionTienda;
    }

    public void setDescripcionTienda(String descripcionTienda) {
        this.descripcionTienda = descripcionTienda;
    }

    public Date getFechaIngresoEmpresa() {
        return fechaIngresoEmpresa;
    }

    public void setFechaIngresoEmpresa(Date fechaIngresoEmpresa) {
        this.fechaIngresoEmpresa = fechaIngresoEmpresa;
    }

    public String getEstatusXxadcj() {
        return estatusXxadcj;
    }

    public void setEstatusXxadcj(String estatusXxadcj) {
        this.estatusXxadcj = estatusXxadcj;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mike.yutub.messenger.model.Empleado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
