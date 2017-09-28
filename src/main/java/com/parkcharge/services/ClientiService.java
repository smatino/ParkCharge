package com.parkcharge.services;

import com.parkcharge.dto.ClienteDTO;
import com.parkcharge.dto.FeedbackDTO;
import com.parkcharge.dto.LoginDTO;
import com.parkcharge.dto.SearchDTO;
import com.parkcharge.model.ClienteEntity;
import com.parkcharge.model.FeedbackEntity;
import com.parkcharge.model.ServizioEntity;

import java.util.List;

/**
 * Created by smatino on 24/08/2017.
 */
public interface ClientiService {

    List<ServizioEntity> getCliente(String idCliente);

    List<FeedbackEntity> getFeedback(String idCliente);

    FeedbackEntity saveFeedback(FeedbackDTO idCliente);

    void createNewClient(ClienteDTO clienteDTO);

    ClienteEntity login(LoginDTO loginDTO);

    List<ServizioEntity> getClientiServiceByPosition(SearchDTO searchDTO);
}
