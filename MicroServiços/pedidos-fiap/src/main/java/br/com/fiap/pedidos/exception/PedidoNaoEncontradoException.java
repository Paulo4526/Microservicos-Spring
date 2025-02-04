package br.com.fiap.pedidos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PedidoNaoEncontradoException extends RuntimeException {

    public PedidoNaoEncontradoException(String mensagem){
        super(mensagem);
    }

}
