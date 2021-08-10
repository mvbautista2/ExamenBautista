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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import lombok.Data;

/**
 *
 * @author valen
 */
@Data
@Entity
@Table(name = "seg_pregunta_autogestion")


public class SegPreguntaAutogestion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    
    @Column(name = "cod_pregunta",  nullable = false, length = 8)
    private Integer codigo;
    @Column(name = "enunciado")
    private String enunciado;
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segPreguntaAutogestion")
    private List<SegRespuestaAutogestion> segRespuestaAutogestionList;

    @XmlTransient
    public List<SegRespuestaAutogestion> getSegRespuestaAutogestionList() {
        return segRespuestaAutogestionList;
    }

    public void setSegRespuestaAutogestionList(List<SegRespuestaAutogestion> segRespuestaAutogestionList) {
        this.segRespuestaAutogestionList = segRespuestaAutogestionList;
    }


    
}
