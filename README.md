# MCG Auto - Sistema de Gestao de Concessionaria

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-24.0-2496ED?style=for-the-badge&logo=docker&logoColor=white)

O MCG Auto e uma solucao corporativa desenvolvida para atender a complexidade do mercado automotivo moderno, unificando as 
operacoes de Concessionaria de Veiculos e Oficina Mecanica em uma plataforma centralizada. Diferente de sistemas genericos,
o projeto foi arquitetado com foco absoluto na integridade de dados e seguranca transacional, garantindo o controle rigoroso
de ativos de alto valor e a rastreabilidade completa das operacoes. O sistema gerencia desde o fluxo complexo de venda de
veiculos, que envolve aprovacoes gerenciais e documentacao, ate a dinamica agil do varejo de pecas e agendamento de servicos, 
assegurando consistencia contabil e operacional em todas as etapas.

---
## Stack Tecnológica

### `Back-end (Core)`
* **Java 21** (Versão LTS mais recente)
* **Spring Boot 3.x**
* **Spring Data JPA** (Persistência de Dados)
* **Hibernate** (ORM - Object Relational Mapping)
* **PostgreSQL 16** (Banco de Dados Relacional)
* **Flyway** (Versionamento e Migração de Banco de Dados)
* **Spring Security + JWT** (Autenticação e Autorização via Token)
* **MapStruct** (Mapeamento de Objetos de alta performance)
* **Bean Validation** (Validação de Regras de Entrada)
* **Java Records** (Imutabilidade para DTOs)

### `Qualidade e Testes`
* **JUnit 5** (Framework de Testes Unitários)
* **Mockito** (Criação de Mocks para isolamento de testes)
* **Jacoco** (Análise de Cobertura de Código/Code Coverage)

### `DevOps e Infraestrutura`
* **Docker** (Containerização da Aplicação)
* **Docker Compose** (Orquestração de ambiente de desenvolvimento)
* **Git** (Versionamento de Código)
* **Maven** (Gerenciamento de Dependências e Build)

### `Documentação`
* **Swagger / OpenAPI** (Documentação Interativa da API)
* **Javadoc** (Documentação técnica de código)

### `Front-end`
* **Angular** (Framework SPA)
* **TypeScript** (Superset JavaScript tipado)
---

## Engenharia e Documentacao

Este projeto nao é apenas uma codificacao tecnica, mas o resultado de uma engenharia de requisitos detalhada. Todo o desenvolvimento foi guiado por uma documentacao formal de Requisitos Funcionais, Nao Funcionais e Regras de Negocio (Baseada em IEEE 830).

Voce pode consultar os artefatos completos de engenharia, incluindo:
* 📜 **Lista de Requisitos (RF e RNF):** Escopo funcional detalhado.
* 📐 **Regras de Negocio (RN):** Restricoes e logicas de validacao.
* 🧩 **Modelagem UML:** Diagramas de Classe, Casos de Uso e Fluxos.

👉 [Clique aqui para acessar a Documentacao Tecnica Completa](docs/DOCUMENTACAO_TECNICA.md)

## Funcionalidades Principais

O sistema gerencia o ciclo de vida completo de uma concessionaria, integrando departamentos que geralmente operam isolados:

* **Gestao de Acesso e Perfis:**
    * Controle rigoroso de usuarios com hierarquia de permissoes (Clientes, Vendedores e Gestores).
    * Seguranca na atribuicao de responsabilidades para aprovacoes criticas.

* **Gestao de Estoque de Veiculos (Ativos):**
    * Controle de frota com validacao de unicidade para Placa e Chassi, evitando duplicidade legal.
    * Rastreamento do ciclo de vida do veiculo (Disponivel, Reservado, Vendido, Em Manutencao).
    * Auditoria automatica de entrada e saida de estoque.

* **Oficina e Pos-Venda:**
    * **Ordem de Servico (OS):** Geracao de ordens complexas que unificam servicos (mao de obra) e produtos (pecas) em um unico documento fiscal/operacional.
    * **Veiculo do Cliente:** Cadastro dissociado do estoque da loja, mantendo historico de manutencoes de veiculos de terceiros.
    * **Agendamento Inteligente:** Gestao de agenda de servicos para otimizacao do tempo dos mecanicos.

* **Modulo Comercial Hibrido (Vendas):**
    * **Venda de Veiculos:** Workflow complexo que exige associacao de um veiculo unico e aprovacao de gestor para fechamento.
    * **Venda de Balcao/Pecas:** Processo agil para venda de acessorios e pecas, sem burocracia excessiva.
    * **Multicanalidade:** Suporte nativo para vendas originadas em Loja Fisica ou Canais Digitais (Website/Parceiros), com indicadores de origem.

* **Financeiro e Fiscal (Core):**
    * Centralizacao das operacoes financeiras geradas tanto pela venda de veiculos quanto pelos servicos prestados na oficina.

---

## Arquitetura e Estrutura

O projeto segue uma estrutura baseada em Dominio, separando responsabilidades de forma clara dentro de `br.com.mcgauto`:

```text
src/main/java/br/com/mcgauto
├── config/              # Configurações globais (Swagger, Beans, Security)
├── controller/          # Camada REST (Entrada de dados)
│   ├── usuario/         # Ex: UsuarioController, AuthController
│   ├── veiculo/         # Ex: VeiculoController
│   ├── venda/           # Ex: VendaController
│   └── ...
├── domain/              # Entidades JPA (Regras de Negócio e Relacionamentos)
│   ├── agenda/          # Ex: Agendamento, Aluguel
│   ├── estoque/         # Ex: MovimentacaoEstoque
│   ├── financeiro/      # Ex: Pagamento
│   ├── fiscal/          # Ex: NotaFiscal
│   ├── produto/         # Ex: Produto, Categoria
│   ├── servico/         # Ex: Servico, OrdemServico
│   ├── usuario/         # Ex: Usuario (Aggregate Root), Endereco, Cnh
│   ├── veiculo/         # Ex: Veiculo, Marca, Modelo
│   └── venda/           # Ex: Venda, ItemVenda
├── dto/                 # Transferência de Dados (Records Imutáveis)
│   ├── usuario/         # Ex: UsuarioCreateRequestDTO, EnderecoDTO
│   ├── veiculo/         # Ex: VeiculoResponseDTO
│   └── ...              
├── mapper/              # Interfaces MapStruct (Conversão DTO <-> Entity)
│   ├── usuario/         # Ex: UsuarioMapper, EnderecoMapper
│   └── ...
├── repository/          # Interfaces Spring Data JPA (Acesso a Dados)
│   ├── usuario/         # Ex: UsuarioRepository
│   ├── veiculo/         # Ex: VeiculoRepository
│   └── ...              
├── service/             # Regras de Negócio e Transações (@Service)
│   ├── usuario/         # Ex: UsuarioService
│   └── ...
├── global/              # Recursos Compartilhados
│   ├── enums/           # Enums globais
│   └── exception/       # Handlers de Erro e Exceções Personalizadas
└── starter/             # Classe Main (McgautoApplication)
```

### Destaques Tecnicos
* **Java 21 LTS:** Uso de recursos modernos da linguagem.
* **JPA Puro (Entidades):** Entidades limpas, sem Lombok, com validacoes de banco (nullable, unique) e auditoria automatica.
* **Flyway:** Versionamento e migracao automatizada do banco de dados.
* **Docker:** Ambiente de desenvolvimento containerizado.

---

## Como Rodar o Projeto

### Pre-requisitos
* Java 21 JDK instalado.
* Maven 3.8+ instalado.
* Docker e Docker Compose instalados.

### 1. Subir o Banco de Dados
Utilize o Docker Compose para iniciar o PostgreSQL na porta **5433** (para evitar conflito com instalacoes locais).

Crie um arquivo `docker-compose.yml` na raiz do projeto com o seguinte conteudo:

```yaml
services:
  postgres:
    image: postgres:16-alpine
    container_name: mcgauto-db
    ports:
      - "5433:5432"
    environment:
      - POSTGRES_DB=mcgauto_db
      - POSTGRES_USER=mcgauto_user
      - POSTGRES_PASSWORD=mcgauto_password
    volumes:
      - postgres-data:/var/lib/postgresql/data

volumes:
  postgres-data:
```

Execute o comando no terminal:
```bash
docker-compose up -d
```

### 2. Rodar a Aplicacao
Com o banco rodando, inicie a aplicacao Spring Boot:

```bash
mvn spring-boot:run
```

A aplicacao estara disponivel em: `http://localhost:8080`

---

## Testes e Documentacao

* **API Docs:** A documentacao da API sera gerada via **Spring REST Docs** (ou Swagger UI).
* **Rodar Testes:**
    ```bash
    mvn test
    ```

## Proximos Passos (Roadmap)

- [x] **Arquitetura Base:** Estrutura de pacotes e Docker Compose configurado.
- [x] **Domínio (Entities):** Modelagem das entidades, Enums e Relacionamentos (JPA).
- [x] **Persistência:** Criação das interfaces Repository.
- [x] **Tratamento de Erros:** Implementação do `GlobalExceptionHandler` e Classes de Erro personalizadas (`BusinessException`, `ResourceNotFoundException`).
- [ ] **DTOs (Data Transfer Objects):** Criação dos Records de Request/Response.
- [ ] **Mappers:** Configuração do MapStruct para conversão Entity <-> DTO.
- [ ] **Configurações:** Beans de configuração (Cors, ModelMapper/MapStruct, etc).
- [ ] **Database Migrations:** Configuração do Flyway para versionamento de banco.
- [ ] **Regras de Negócio (Services):** Implementação da lógica core do sistema.
- [ ] **API REST (Controllers):** Exposição dos endpoints.
- [ ] **Documentação:** Configuração do Swagger/OpenAPI.
- [ ] **Segurança:** Implementação de JWT e Filtros de Segurança.
- [ ] **Testes:** Testes Unitários e de Integração.
- [ ] Front-end Angular 

---

Desenvolvido por **Guilherme** | MCG Auto 2026
