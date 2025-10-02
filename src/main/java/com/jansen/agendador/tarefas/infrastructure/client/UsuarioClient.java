package com.jansen.agendador.tarefas.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "usuario", url = "${usuario.url}")
public interface UsuarioClient {
}
