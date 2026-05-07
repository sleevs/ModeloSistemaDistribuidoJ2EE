# ModeloSistemaDistribuidoJ2EE

This project started as a traditional J2EE/JMS distributed system and evolved into a cloud-native quorum-based distributed storage simulator inspired by MIT 6.824 Distributed Systems Course – Lecture 10: Cloud Replicated DBs and Aurora. The project was developed as part of my independent study and research based on the course content available on YouTube.

---

## Problema

Traditional enterprise distributed systems are often tightly coupled, difficult to scale, and heavily dependent on synchronous communication models.

Modern distributed databases must handle:
- replica failures
- network latency
- partial outages
- distributed coordination
- consistency trade-offs

while still maintaining high availability and reliable reads/writes.

---

## Solução

This project explores how a traditional J2EE distributed architecture can evolve into a cloud-native quorum-based storage system.

The system simulates:
- quorum reads/writes
- replica coordination
- asynchronous replication
- fault tolerance
- distributed storage behavior

inspired by concepts studied in MIT Distributed Systems lectures, especially:
- Cloud Replicated Databases
- Aurora architecture
- quorum replication models

---

## Funcionalidades

- Quorum-based read/write coordination
- Distributed replica nodes
- Coordinator-based request orchestration
- Replica failure simulation
- Asynchronous replication experiments
- Kubernetes deployment support
- Cloud-native architecture evolution
- Distributed systems experimentation environment

---

## Stack

### Legacy Foundation
- J2EE
- JMS

### Modern Architecture
- Java
- Spring Boot
- Docker
- Kubernetes
- REST/gRPC (planned)
- Kafka (planned)

---

## Arquitetura

```text
                Client
                   |
         J2EE Coordinator
            (Control Plane)
                   |
      --------------------------------
      |              |              |
 Spring Replica  Spring Replica  Spring Replica
    (Data Plane)   (Data Plane)   (Data Plane)

