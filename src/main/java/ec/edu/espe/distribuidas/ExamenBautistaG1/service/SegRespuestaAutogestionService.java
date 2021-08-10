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
package ec.edu.espe.distribuidas.ExamenBautistaG1.service;

import ec.edu.espe.distribuidas.ExamenBautistaG1.dao.SegRespuestaAutogestionRepository;
import ec.edu.espe.distribuidas.ExamenBautistaG1.model.SegRespuestaAutogestion;
import java.util.Optional;

/**
 *
 * @author valen
 */
public class SegRespuestaAutogestionService {

    private final SegRespuestaAutogestionRepository segRespuestaAutogestionRepo;
    
    public SegRespuestaAutogestionService(SegRespuestaAutogestionRepository segRespuestaAutogestionRepo) {
        this.segRespuestaAutogestionRepo = segRespuestaAutogestionRepo;
    }
    
    public SegRespuestaAutogestion obtainByCodigo(Integer codigo) {
        Optional<SegRespuestaAutogestion> segRespuestaAutogestionOpt = this.segRespuestaAutogestionRepo.findById(codigo);
        if (segRespuestaAutogestionOpt.isPresent()) {
            return segRespuestaAutogestionOpt.get();
        } else {
            throw new RuntimeException("Not found");
        }
    }
}
