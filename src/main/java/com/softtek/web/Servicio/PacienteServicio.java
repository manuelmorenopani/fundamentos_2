package com.softtek.web.Servicio;

import com.softtek.web.Repositorio.IPacienteRepo;
import com.softtek.web.modelo.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PacienteServicio implements IPacienteServicio{
    @Autowired
    IPacienteRepo p;
    public String obtener(Paciente paciente){
        Paciente pacientes = new Paciente(1234123,"Manuel",123456789);
        return p.obtener(pacientes);
    }
}
