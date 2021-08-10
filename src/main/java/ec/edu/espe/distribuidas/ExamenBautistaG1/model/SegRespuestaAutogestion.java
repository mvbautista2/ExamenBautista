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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 *
 * @author valen
 */
@Data
@Entity
@Table(name = "seg_respuesta_autogestion")

public class SegRespuestaAutogestion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SegRespuestaAutogestionPK segRespuestaAutogestionPK;
    @Column(name = "respuesta")
    private String respuesta;
    @JoinColumn(name = "cod_pregunta", referencedColumnName = "cod_pregunta", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SegPreguntaAutogestion segPreguntaAutogestion;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SegUsuario segUsuario;

   
    
}
