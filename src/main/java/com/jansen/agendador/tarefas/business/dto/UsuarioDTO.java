package com.jansen.agendador.tarefas.business.dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDTO {

    private String email;
    private String senha;

}
