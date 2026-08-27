# ModeloSistemaDistribuidoJ2EE

# J2EE Legacy Modernization Lab

This project demonstrates an incremental modernization journey
from a traditional J2EE application 
to a hybrid and cloud-native architecture using Spring Boot,
API Gateway, Docker and Kubernetes.

The project intentionally keeps the legacy system running while
new services are progressively extracted from the existing
application.

The goal is to demonstrate how legacy enterprise applications
can coexist with modern cloud-native services during a gradual
migration.

---
## Architecture Evolution

### Release 1 — Legacy J2EE

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



### Release 2 — Hybrid Architecture

                 API Gateway
                      |
              +-------+-------+
              |               |
              v               v
  Application Server       Spring Boot
          Legacy EJB      Customer Service
              |               |
             DB              DB





### Release 3 — Cloud Native

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



The migration follows an incremental approach: instead of replacing the legacy platform at once, business capabilities are progressively extracted into independently deployable Spring Boot services.


