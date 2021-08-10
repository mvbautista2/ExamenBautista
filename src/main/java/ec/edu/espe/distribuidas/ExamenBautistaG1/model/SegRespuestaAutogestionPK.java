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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;

/**
 *
 * @author valen
 */
@Data
@Embeddable
public class SegRespuestaAutogestionPK implements Serializable {

    
    @Column(name = "cod_pregunta", nullable = false)
    private int codPregunta;
    @Column(name = "cod_usuario", nullable = false)
    private String codUsuario;

    
}
