# ModeloSistemaDistribuidoJ2EE

This project demonstrates the evolution of a traditional J2EE/JMS-based distributed system into a modern event-driven architecture using Spring Boot and Apache Kafka.

It explores how legacy enterprise systems can be integrated into a decoupled, asynchronous, cloud-native style architecture.

---

## Problem

Traditional enterprise systems built on J2EE and JMS are often:
- Tightly coupled
- Synchronous or blocking in nature
- Difficult to scale independently
- Hard to integrate with heterogeneous legacy systems

This creates challenges when modernizing systems or integrating multiple business domains such as billing, customer management, and fraud detection.

---

## Solution

This project introduces an event-driven architecture that decouples system components using Apache Kafka as an event bus.

A Spring Boot orchestrator publishes events that are consumed asynchronously by independent services, including legacy systems.

This enables:
- Decoupled communication between services
- Integration of heterogeneous technologies (J2EE + modern systems)
- Improved scalability and resilience
- Asynchronous processing of business events

---

## Functionalities

- Event-driven orchestration using Apache Kafka
- Integration with legacy J2EE billing system
- Customer data system (legacy database)
- Fraud detection system simulation
- Asynchronous processing between services
- Decoupled architecture across different technology stacks

---

## Stack

- Java
- Spring Boot
- Apache Kafka
- J2EE (legacy integration)
- Docker

---

## Architecture

```text
              Client
                 ↓
     API / Orchestrator (Spring Boot)
                 ↓
            Event Bus (Kafka)
     ↓              ↓              ↓
Billing        Customer        Fraud
(J2EE)         (DB legacy)     (legacy system)


```

## Simplified Flow

- Client sends request to orchestrator  
- Orchestrator publishes event to Kafka  
- Services consume events independently  
- Each system processes its domain logic asynchronously  
- System achieves decoupled integration across heterogeneous services  

---

## Design Trade-offs

This architecture prioritizes:

- Scalability over synchronous consistency  
- Decoupling over tight integration  
- Flexibility over simplicity  

Trade-offs include:

- Eventual consistency instead of immediate consistency  
- Increased system complexity due to distributed event flow  
- Need for observability across asynchronous services  

---


### Prerequisites

#### Legacy environment (J2EE modules)
- Java 7
- Application server compatible with J2EE (if applicable)

## How to Run J2EE (legacy modules)

J2EE modules must be deployed in an application server.

#### Option A: Deploy manually
Build WAR file:
 - mvn package
 - Deploy the generated .war into:
 - WildFly / JBoss / Tomcat /IBM WebSphere (depending on your setup)

#### Option B: Using Docker (if available)
 - docker-compose up



#### Modern environment (Spring Boot services)
- Java 17+
- Maven
- Docker

## How to Run

- mvn clean install
- cd spring-services
- mvn spring-boot:run


---

### 4. Infrastructure (Databases + Messaging)

This project relies on a distributed infrastructure stack that simulates enterprise heterogeneous environments.

#### Messaging Layer
- Apache Kafka (event-driven communication)

#### Databases (legacy + enterprise systems)
- MySQL
- IBM DB2 (simulated / optional)
- Oracle Database (simulated / optional)

---

### Start infrastructure services

```bash id="infra_start"
docker-compose up -d


