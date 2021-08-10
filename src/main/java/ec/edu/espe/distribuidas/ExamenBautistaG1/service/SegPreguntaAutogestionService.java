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

import ec.edu.espe.distribuidas.ExamenBautistaG1.dao.SegPreguntaAutogestionRepository;
import ec.edu.espe.distribuidas.ExamenBautistaG1.dao.SegRespuestaAutogestionRepository;
import ec.edu.espe.distribuidas.ExamenBautistaG1.model.SegPreguntaAutogestion;
import ec.edu.espe.distribuidas.ExamenBautistaG1.model.SegRespuestaAutogestion;
import java.util.List;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author valen
 */
@Slf4j
@Service
public class SegPreguntaAutogestionService {
    private final SegPreguntaAutogestionRepository segPreguntaAutogestionRepo;
    private final SegRespuestaAutogestionRepository segRespuestaAutogestionRepo;
    
    public SegPreguntaAutogestionService (SegPreguntaAutogestionRepository segPreguntaAutogestionRepo, SegRespuestaAutogestionRepository segRespuestaAutogestionRepo){
        this.segPreguntaAutogestionRepo= segPreguntaAutogestionRepo;
        this.segRespuestaAutogestionRepo = segRespuestaAutogestionRepo;
    }
    public List<SegPreguntaAutogestion> listarPorEstado(String estado) {
        return this.segPreguntaAutogestionRepo.findByEstado(estado);
    }
}
    
//    @Transactional
//    public SegPreguntaAutogestion crearSegPreguntaAutogestion(SegPreguntaAutogestion segPreguntaAutogestion){
////        for (SegRespuestaAutogestion segRespuestaAutogestion : segPreguntaAutogestion.getEnunciado()){
////            SegRespuestaAutogestion segRespuestaAutogestion = this.segRespuestaAutogestionRepo.findById(segRespuestaAutogestion.getSegRespuestaAutogestionPK().getCodPregunta());
////            segPreguntaAutogestion.setEnunciado(enunciado);
////            segPreguntaAutogestion.setEstado(estado);
//            
//            
////        }
//        
////    } 
//    
////}

