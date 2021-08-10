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

import ec.edu.espe.distribuidas.ExamenBautistaG1.model.SegRespuestaAutogestion;
import ec.edu.espe.distribuidas.ExamenBautistaG1.service.SegRespuestaAutogestionService;
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
@RequestMapping("/api/segRespuestaAutogestion")
public class SegRespuestaAutogestionController {
    private final SegRespuestaAutogestionService service;
    public SegRespuestaAutogestionController(SegRespuestaAutogestionService  service) {
        this.service = service;
    }
    @GetMapping(value = "{codigo}")
    public ResponseEntity obtenerSegRespuestaAutogestion(@PathVariable("codigo") Integer codigo) {
        try {
            SegRespuestaAutogestion segRespuestaAutogestion = this.service.obtainByCodigo(codigo);
            return ResponseEntity.ok(segRespuestaAutogestion);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
