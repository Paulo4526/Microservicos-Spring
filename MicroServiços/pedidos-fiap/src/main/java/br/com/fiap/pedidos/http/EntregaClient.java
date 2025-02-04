package br.com.fiap.pedidos.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("entregas-ms")
public interface EntregaClient {

    @RequestMapping(method = RequestMethod.PUT, value = "/entregas/{id}/transporte")
    void atualizarEntrega(@PathVariable Long id);

}
