package com.fontanella.Projeto_Intermediario.Controller;

import com.fontanella.Projeto_Intermediario.Dto.EnderecoDto;
import com.fontanella.Projeto_Intermediario.Service.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping()
public class APIController {

    @Autowired
    private APIService apiService;

    @GetMapping("/{cep}")
    public ResponseEntity<?> FindCep(@PathVariable String cep) {
        EnderecoDto response = apiService.buscarCep(cep);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("Status", "Error");
            errorResponse.put("Mensagem", "CEP não encontrado");
            return ResponseEntity.status(404).body(errorResponse);
        }
    }

    @GetMapping("/sobre")
    public ResponseEntity<Map<String, String>> sobre() {
        Map<String, String> info = new HashMap<>();
        info.put("estudante", "João Victor Macam Fontanella");
        info.put("projeto", "Consulta de CEP usando a API ViaCEP");
        return ResponseEntity.ok(info);
    }
}

//http://localhost:8080/88803150
//http://localhost:8080/sobre