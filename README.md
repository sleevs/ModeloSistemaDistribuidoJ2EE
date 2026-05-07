# ModeloSistemaDistribuidoJ2EE

Este projeto demonstra a evolução de um sistema distribuído tradicional baseado em J2EE/JMS para uma arquitetura moderna orientada a eventos utilizando Spring Boot e Apache Kafka.

Ele explora como sistemas legados corporativos podem ser integrados em uma arquitetura desacoplada, assíncrona e com estilo cloud-native.

---

## Problema

Sistemas corporativos tradicionais baseados em J2EE e JMS geralmente são:

- Fortemente acoplados  
- Síncronos ou bloqueantes  
- Difíceis de escalar de forma independente  
- Difíceis de integrar com sistemas legados heterogêneos  

Isso cria desafios ao modernizar sistemas ou integrar diferentes domínios de negócio, como faturamento, gestão de clientes e detecção de fraude.

---

## Solução

Este projeto propõe uma arquitetura orientada a eventos que desacopla os componentes do sistema utilizando o Apache Kafka como barramento de eventos.

Um orquestrador em Spring Boot publica eventos que são consumidos de forma assíncrona por serviços independentes, incluindo sistemas legados.

Isso permite:

- Comunicação desacoplada entre serviços  
- Integração de tecnologias heterogêneas (J2EE + sistemas modernos)  
- Maior escalabilidade e resiliência  
- Processamento assíncrono de eventos de negócio  

---

## Funcionalidades

- Orquestração orientada a eventos com Apache Kafka  
- Integração com sistema legado de faturamento em J2EE  
- Sistema de dados de clientes (banco legado)  
- Simulação de sistema de detecção de fraude  
- Processamento assíncrono entre serviços  
- Arquitetura desacoplada entre diferentes tecnologias  

---

## Stack

- Java  
- Spring Boot  
- Apache Kafka  
- J2EE (integração com legado)  
- Docker  

---

## Arquitetura

```text
              Cliente
                 ↓
     API / Orquestrador (Spring Boot)
                 ↓
            Barramento de Eventos (Kafka)
     ↓              ↓              ↓
Faturamento     Cliente        Fraude
   (J2EE)     (DB legado)   (sistema legado)


```


## Fluxo Simplificado

- Cliente envia requisição ao orquestrador  
- Orquestrador publica evento no Kafka  
- Serviços consomem eventos de forma independente  
- Cada sistema processa sua lógica de domínio de forma assíncrona  
- Sistema alcança integração desacoplada entre serviços heterogêneos  

---

## Trade-offs de Design

Esta arquitetura prioriza:

- Escalabilidade em vez de consistência síncrona  
- Desacoplamento em vez de integração rígida  
- Flexibilidade em vez de simplicidade  

Trade-offs incluem:

- Consistência eventual em vez de imediata  
- Maior complexidade devido ao fluxo distribuído de eventos  
- Necessidade de observabilidade entre serviços assíncronos  

---

## Pré-requisitos

### Ambiente legado (módulos J2EE)

- Java 7  
- Servidor de aplicação compatível com J2EE (WildFly, JBoss, Tomcat, WebSphere, etc.)  

### Ambiente moderno (serviços Spring Boot)

- Java 17+  
- Maven  
- Docker  

---

## Como executar J2EE (módulos legados)

### Opção A: Deploy manual

Gerar arquivo WAR:

```bash
mvn package
```

Fazer deploy do `.war` no servidor de aplicação:

- WildFly  
- JBoss  
- Tomcat  
- WebSphere  

---

### Opção B: Usando Docker

```bash
docker-compose up -d
```

---

## Como executar Spring Boot

```bash
mvn clean install
cd spring-services
mvn spring-boot:run
```

---

## Infraestrutura (Bancos de dados + Mensageria)

Este projeto simula ambientes corporativos heterogêneos com:

### Mensageria

- Apache Kafka (comunicação orientada a eventos)

### Bancos de dados

- MySQL  
- IBM DB2 (simulado / opcional)  
- Oracle Database (simulado / opcional)  

---

## Inicializar infraestrutura

```bash
docker-compose up -d
```

---

## Status Atual

- Arquitetura definida  
- Fluxo orientado a eventos (Kafka) implementado  
- Integração com sistemas legados  
- Retry / tratamento de erros implementado  
- Observabilidade (logs, métricas, tracing)  
- Preparação para deploy em produção  

---

## Inspiração / Referências

Este projeto é inspirado em desafios reais de modernização de sistemas corporativos e padrões de design de sistemas distribuídos.

Principais influências:

- Arquiteturas J2EE distribuídas legadas  
- Microsserviços orientados a eventos com Apache Kafka  
- Estratégias de modernização de sistemas corporativos  
- Princípios de arquitetura cloud-native  

