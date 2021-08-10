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
package ec.edu.espe.distribuidas.ExamenBautistaG1.controller;

import ec.edu.espe.distribuidas.ExamenBautistaG1.model.SegPreguntaAutogestion;
import ec.edu.espe.distribuidas.ExamenBautistaG1.service.SegPreguntaAutogestionService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author valen
 */
@RestController
@RequestMapping("/api/SegPreguntaAutogestion")
@Slf4j
public class SegPreguntaAutogestionController {
    private final SegPreguntaAutogestionService service;
    
    public SegPreguntaAutogestionController(SegPreguntaAutogestionService segPreguntaAutogestionService){
        this.service = segPreguntaAutogestionService;
    }
      
 
    @GetMapping
    public ResponseEntity obtenerActivos() {
        List<SegPreguntaAutogestion> segPreguntaAutogestion = this.service.listarPorEstado("ACT");
        return ResponseEntity.ok(segPreguntaAutogestion);
    }
    
}
