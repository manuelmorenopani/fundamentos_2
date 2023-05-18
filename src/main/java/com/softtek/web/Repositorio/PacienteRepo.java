package com.softtek.web.Repositorio;

import com.softtek.web.modelo.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PacienteRepo implements IPacienteRepo{
    @Override
    public String obtener(Paciente paciente){
        return paciente.toString();
    }
}
