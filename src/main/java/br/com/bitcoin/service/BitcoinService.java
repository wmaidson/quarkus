package br.com.bitcoin.service;

import br.com.bitcoin.model.Bitcoin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/bitcoins")
@RegisterRestClient
public interface BitcoinService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
     List<Bitcoin> listar();
}
