
package com.co.modelo.entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nombres;
    private String apellidos;
    private String numeroIdentificacion;
    private String direccion;
    private String telefono;
    private String correo;
    private byte estado;

    public Usuario() {
    }
    
//    public Usuario(Integer idUsuario) {
//        this.idUsuario = idUsuario;
//    }
//    
//    public Usuario(Integer idUsuario, String nombres, String apellidos, String numeroIdentificacion, String direccion, String telefono, String correo, byte estado) {
//        this.idUsuario = idUsuario;
//        this.nombres = nombres;
//        this.apellidos = apellidos;
//        this.numeroIdentificacion = numeroIdentificacion;
//        this.direccion = direccion;
//        this.telefono = telefono;
//        this.correo = correo;
//        this.estado = estado;
//    }
//
//    public Usuario(String nombres, String apellidos, String numeroIdentificacion, String direccion, String telefono, String correo, byte estado) {
//        this.nombres = nombres;
//        this.apellidos = apellidos;
//        this.numeroIdentificacion = numeroIdentificacion;
//        this.direccion = direccion;
//        this.telefono = telefono;
//        this.correo = correo;
//        this.estado = estado;
//    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombres=" + nombres + ", apellidos=" + apellidos + ", numeroIdentificacion=" + numeroIdentificacion + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", estado=" + estado + '}';
    }

}
