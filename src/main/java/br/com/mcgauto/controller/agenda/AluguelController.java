package br.com.mcgauto.controller.agenda;

import br.com.mcgauto.dto.agenda.AluguelCreateRequestDTO;
import br.com.mcgauto.dto.agenda.AluguelResponseDTO;
import br.com.mcgauto.dto.agenda.AluguelUpdateRequestDTO;
// import br.com.mcgauto.service.agenda.AluguelService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alugueis")
public class AluguelController {

    private final AluguelService service;

    public AluguelController(AluguelService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AluguelResponseDTO> criar(@RequestBody @Valid AluguelCreateRequestDTO request) {
        AluguelResponseDTO response = service.criar(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
        return null;
    }

    @GetMapping
    public ResponseEntity<List<AluguelResponseDTO>> listarTodos() {
        List<AluguelResponseDTO> responses = service.listarTodos();
        return ResponseEntity.ok(responses);
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AluguelResponseDTO> buscarPorId(@PathVariable Long id) {
        AluguelResponseDTO response = service.buscarPorId(id);
        return ResponseEntity.ok(response);
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<AluguelResponseDTO> atualizar(@PathVariable Long id, @RequestBody @Valid AluguelUpdateRequestDTO request) {
        AluguelResponseDTO response = service.atualizar(id, request);
        return ResponseEntity.ok(response);
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
        return null;
    }
}