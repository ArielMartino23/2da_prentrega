package controller;

import com.example.clientservice.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ClientserviceApplication;

@RequestMapping(path = "api/clients")
@RestController
public class ClientController {

    @Autowired
    private ClientserviceApplication clientService;

    public ClientController(ClientserviceApplication clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/")
    public ResponseEntity<Client> create(@RequestParam String name, @RequestParam String lastName, @RequestParam String fechaNacimiento){
        return new ResponseEntity<>( this.clientService.create(name,lastName,fechaNacimiento) , HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> findById(@PathVariable Long id){
        return new ResponseEntity<>(this.clientService.findById(id), HttpStatus.OK);
    }

}
