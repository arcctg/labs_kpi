### Functional Requirements

| ID    | Requirement                                |
| :---- |:-------------------------------------------|
| FR1 | Appointment Schedule Management            |
| FR2 | Electronic Medical Record (EMR) Management |
| FR3 | Treatment Process Support                  |
| FR4 | User Identification and Access Control     |


### Use Cases

| ID | Use Case                                 |
| :--- |:-----------------------------------------|
| UC1 | Cancel Appointment via Patient UI        |
| UC2 | Cancel Appointment via Doctor UI         |
| UC3 | Schedule Appointment via Patient UI      |
| UC4 | Schedule Appointment via Doctor UI       |
| UC5 | View Medical Record via Patient UI       |
| UC6 | View Medical Record via Doctor UI        |
| UC7 | Update Medical Record                    |
| UC8 | Receive Treatment Plan                   |
| UC9 | Create Treatment Plan                    |
| UC10 | Receive Prescription                     |
| UC11 | Diagnose Patient                         |
| UC12 | Prescribe Medication                     |
| UC13 | Provide Working Hours                    |
| UC14 | Authentication via Patient UI            |
| UC15 | Authentication via Doctor UI             |
| UC16 | View Appointment Schedule via Patient UI |
| UC17 | View Appointment Schedule via Doctor UI  |


### Traceability Matrix

| **FR/UC** | UC1 | UC2 | UC3 | UC4 | UC5 | UC6 | UC7 | UC8 | UC9 | UC10 | UC11 | UC12 | UC13 | UC14 | UC15 | UC16 | UC17 |
|:----------|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|
| **FR1**   |  x  |  x  |  x  |  x  |     |     |     |     |     |      |      |      |  x   |      |      |  x   |  x   |
| **FR2**   |     |     |     |     |  x  |  x  |  x  |     |     |      |      |      |      |      |      |      |      |
| **FR3**   |  x  |  x  |  x  |  x  |  x  |  x  |  x  |  x  |  x  |  x   |  x   |  x   |      |      |      |  x   |  x   |
| **FR4**   |     |     |     |     |     |     |     |     |     |      |      |      |      |  x   |  x   |      |      |


### Non-Functional Requirements

| ID | Requirement                                                                                                                                                                                                                                                            |
| :--- |:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| NFR1 | **Performance (Latency & Load):** System response time for all primary user operations (e.g., loading schedule, opening a record) must be under 2 seconds, while under a peak load of 1,000 concurrent users.                                                          |
| NFR2 | **Availability:** The system must guarantee 99.9% ("three nines") availability. A scheduled maintenance window is permitted weekly between Sunday 2:00 AM and 5:00 AM.                                                                                                 |
| NFR3 | **Reliability (Disaster Recovery):** The system must have an RTO (Recovery Time Objective) of 4 hours and an RPO (Recovery Point Objective) of 15 minutes.                                                                                                             |
| NFR4 | **Auditing (Logging):** All critical user and administrator actions must be logged. Logs must be stored in a searchable "hot" storage solution (e.g., Loki or Elasticsearch) for 3 months and archived in immutable "cold" storage (e.g., AWS S3 Glacier) for 2 years. |
| NFR5 | **Accessibility:** The web interface must comply with WCAG 2.1 Level AA standards, ensuring all functionality is operable via keyboard navigation and that color is not the only means of conveying information (to support users with color blindness).               |
| NFR6 | **Compatibility (Browsers):** The system must be fully functional on the latest two major versions of Google Chrome, Mozilla Firefox, and Safari.                                                                                                                      |
| NFR7 | **Compatibility (Operating Systems):** The application must be fully supported on Windows 10/11, macOS (latest two major versions), Android 12+, and iOS 15+.                                                                                                          |
| NFR8 | **Compatibility (Client Hardware):** The web application must run smoothly (less than 100ms UI lag for simple interactions) on devices with a minimum of a 2-core CPU @ 1.5 GHz, 4 GB RAM, and a screen resolution of 1024x768.                                        |
| NFR9 | **Integration (API):** The system must provide a secure REST API (using OAuth 2.0) for integration with third-party systems (e.g., pharmacy databases, insurance providers). The API must respond to 99% of requests in < 500ms.                                       |
| NFR10 | **Scalability:** The system architecture must support horizontal scaling to handle a 3x increase in user load over one year without requiring a full redesign.                                                                                                         |
| NFR11 | **Security (Data):** All Patient Health Information (PHI) must be encrypted at rest (AES-256) and in transit (TLS 1.3+). The system must pass an annual external penetration test.                                                                                     |
| NFR12 | **Localization:** The system must support at least two languages (e.g., Ukrainian, English), with the ability to add new languages without code changes (via resource files).                                                                                          |