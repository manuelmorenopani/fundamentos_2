package com.softtek.web.Controlador;

import com.softtek.web.Servicio.IPacienteServicio;
import com.softtek.web.modelo.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/pacientes")
//debajo de los metodos
//@GetMapping
@AllArgsConstructor
@Data
@NoArgsConstructor
@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {
    @Autowired

    private IPacienteServicio p;
    @GetMapping
    public String obtener(Paciente paciente) {
        return p.obtener(paciente);
    }

}
