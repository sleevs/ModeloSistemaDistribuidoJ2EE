# ModeloSistemaDistribuidoJ2EE

This project started as a traditional J2EE/JMS distributed system and evolved into a cloud-native quorum-based distributed storage simulator inspired by MIT 6.824 Distributed Systems Course – Lecture 10: Cloud Replicated DBs and Aurora. The project was developed as part of my independent study and research based on the course content available on YouTube.

---

## Problem

Traditional enterprise distributed systems are often tightly coupled, difficult to scale, and heavily dependent on synchronous communication models.

Modern distributed databases must handle:
- replica failures
- network latency
- partial outages
- distributed coordination
- consistency trade-offs

while still maintaining high availability and reliable reads/writes.

---

## Solution

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

## Functionalities

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

## Architecture

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


```

## Simplified flow

Write request:
Client → Coordinator → Replicas → Quorum (W) → ACK → Response

Read request:
Client → Coordinator → Replicas → Quorum (R) → Latest version returned




## Design Trade-offs

This system prioritizes learning and control over distributed system internals rather than relying on managed services like AWS Aurora or DynamoDB.

It intentionally increases implementation complexity to allow experimentation with:
- quorum-based consistency
- replication strategies
- failure scenarios



## How to Run

This project is currently in early development.

mvn clean install
mvn spring-boot:run



## Current Status

This project is currently in development:
- [x] Architecture design
- [x] Coordinator logic (initial version)
- [ ] Replica implementation
- [ ] Quorum read/write fully functional
- [ ] Failure simulation
- [ ] Kubernetes deployment




## Inspiration / References

This project is inspired by distributed systems concepts studied in MIT 6.824 Distributed Systems courses, with a focus on replication, consistency models, and fault tolerance.

It is also influenced by real-world cloud database architectures, including:

- Amazon RDS, which provides managed relational databases with high availability across Availability Zones (AZs). While reliable and widely used, this approach can introduce higher latency and cost due to synchronous cross-AZ replication.

- Amazon Aurora architecture, which improves upon traditional RDS models by using a distributed storage layer and quorum-based replication. This design reduces replication overhead and improves performance while maintaining strong durability guarantees.

- Dynamo-style systems, which introduce quorum-based replication models (R, W, N) and eventual consistency trade-offs widely used in distributed NoSQL databases.

These systems provide the conceptual foundation for exploring quorum-based replication and distributed coordination in this project.


## Future Improvements

### Phase 2 — Resilience & Testing
- Kubernetes deployment
- Chaos testing
- Network latency injection
- Replica failure simulation

---

### Phase 3 — Storage & Consistency
- Quorum read/write consistency improvements
- Write-Ahead Logging (WAL)
- Persistent storage layer
- Anti-entropy replication

---

### Research Extensions
- Observability (metrics, tracing, logs)
- Raft-based leader election (optional)

