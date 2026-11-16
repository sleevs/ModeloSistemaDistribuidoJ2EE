# ModeloSistemaDistribuidoJ2EE


Aqui está o conteúdo completo do `README.md`, pronto para copiar e utilizar no GitHub:


# Laboratório de Modernização de Sistemas Legados J2EE

Este projeto demonstra uma jornada de modernização incremental de uma aplicação J2EE tradicional para uma arquitetura híbrida e cloud-native, utilizando Spring Boot, API Gateway, Docker e Kubernetes.

O projeto mantém intencionalmente o sistema legado em funcionamento enquanto novos serviços são extraídos progressivamente da aplicação existente.

O objetivo é demonstrar como aplicações corporativas legadas podem coexistir com serviços modernos baseados em arquitetura cloud-native durante um processo gradual de migração.

---

## Evolução da Arquitetura

### Release 1 — Arquitetura Legada J2EE

Nesta primeira etapa, a aplicação utiliza uma arquitetura tradicional baseada em J2EE, executada em um servidor de aplicações.

A comunicação é realizada por meio de serviços REST utilizando JAX-RS, com a lógica de negócio implementada em EJBs e acesso a dados por meio de um Repository.

```text
            Application Server
                    |
              JAX-RS / REST
                    |
              +-----+-----+
              |           |
          EJB Service  Repository
              |           |
              +-----+-----+
                    |
                   DB2
```

### Release 2 — Arquitetura Híbrida

Nesta etapa, inicia-se a modernização incremental da aplicação.

Um API Gateway passa a centralizar o acesso às funcionalidades do sistema, direcionando as requisições tanto para a aplicação legada, executada no servidor de aplicações, quanto para os novos serviços desenvolvidos com Spring Boot.

As funcionalidades existentes continuam operando no ambiente legado, enquanto novas capacidades de negócio são extraídas e implementadas como serviços independentes.

```text
                 API Gateway
                      |
              +-------+-------+
              |               |
              v               v
  Application Server       Spring Boot
          Legacy EJB      Customer Service
              |               |
             DB              DB
```

### Release 3 — Arquitetura Cloud-Native

Na terceira etapa, a arquitetura evolui para um modelo baseado em serviços independentes, executados e gerenciados em um cluster Kubernetes.

O API Gateway continua sendo o ponto central de entrada das requisições, direcionando o tráfego para os diferentes microsserviços.

Cada serviço possui maior independência de implantação, escalabilidade e evolução, permitindo uma arquitetura distribuída e preparada para ambientes cloud-native.

```text
                  Kubernetes
                      |
                 API Gateway
                      |
              +-------+-------+
              |       |       |
              v       v       v
           Service  Service  Service
              |       |       |
              v       v       v
             DB      DB      DB
```

---

## Estratégia de Modernização

A migração segue uma abordagem incremental, evitando a substituição completa da plataforma legada de uma única vez.

Em vez disso, as funcionalidades de negócio são progressivamente extraídas da aplicação J2EE existente e transformadas em serviços independentes, desenvolvidos com Spring Boot.

Essa estratégia permite:

- Manter o sistema legado em funcionamento durante a modernização.
- Reduzir os riscos associados a uma migração completa.
- Extrair funcionalidades de negócio de forma gradual.
- Permitir a coexistência entre tecnologias legadas e modernas.
- Evoluir progressivamente para uma arquitetura baseada em microsserviços.
- Preparar a aplicação para implantação e escalabilidade em ambientes cloud-native utilizando Docker e Kubernetes.

O resultado esperado é uma arquitetura moderna, distribuída e escalável, construída a partir de uma evolução controlada do sistema legado.
````


