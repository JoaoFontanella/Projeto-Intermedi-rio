package com.fontanella.Projeto_Intermediario.Service;

import com.fontanella.Projeto_Intermediario.Dto.EnderecoDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class APIService {
    private final RestTemplate restTemplate;

    @Autowired
    public APIService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public EnderecoDto buscarCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        try {
        EnderecoDto response = restTemplate.getForObject(url, EnderecoDto.class);
        if (response != null && response.getCep() != null) {
            return response;
        }
    } catch (HttpClientErrorException e) {
        return null;
    }
        return null;
}

}

