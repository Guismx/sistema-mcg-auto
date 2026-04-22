package br.com.mcgauto.controller.agenda;

import br.com.mcgauto.dto.agenda.AgendamentoCreateRequestDTO;
import br.com.mcgauto.dto.agenda.AgendamentoResponseDTO;
import br.com.mcgauto.dto.agenda.AgendamentoUpdateRequestDTO;
import br.com.mcgauto.service.agenda.AgendamentoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/agendamentos")
public class AgendamentoController {

    private final AgendamentoService service;

    public AgendamentoController(AgendamentoService service) {
         this.service = service;
    }

    @PostMapping
    public ResponseEntity<AgendamentoResponseDTO> criar(@RequestBody @Valid AgendamentoCreateRequestDTO request) {
        AgendamentoResponseDTO response = service.criar(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
        return null;
    }

    @GetMapping
    public ResponseEntity<List<AgendamentoResponseDTO>> listarTodos() {
        List<AgendamentoResponseDTO> responses = service.listarTodos();
        return ResponseEntity.ok(responses);
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoResponseDTO> buscarPorId(@PathVariable Long id) {
        AgendamentoResponseDTO response = service.buscarPorId(id);
        return ResponseEntity.ok(response);
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<AgendamentoResponseDTO> atualizar(@PathVariable Long id, @RequestBody @Valid AgendamentoUpdateRequestDTO request) {
        AgendamentoResponseDTO response = service.atualizar(id, request);
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