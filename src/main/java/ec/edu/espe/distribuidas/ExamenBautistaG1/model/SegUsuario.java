/*
 * Copyright (c) 2021 valen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    valen - initial API and implementation and/or initial documentation
 */
package ec.edu.espe.distribuidas.ExamenBautistaG1.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import lombok.Data;

/**
 *
 * @author valen
 */

@Data
@Entity
@Table(name = "seg_usuario")
public class SegUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cod_usuario", nullable=false)
    private String codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "identificacion")
    private String identificacion;
    @Column(name = "email")
    private String email;
    @Column(name = "estado")
    private String estado;
    @Column(name = "nro_intentos_fallidos")
    private Integer nroIntentosFallidos;
    @Column(name = "fecha_ultima_sesion")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaSesion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segUsuario")
    private List<SegRespuestaAutogestion> segRespuestaAutogestionList;

   
    @XmlTransient
    public List<SegRespuestaAutogestion> getSegRespuestaAutogestionList() {
        return segRespuestaAutogestionList;
    }

    
}
