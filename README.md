# QA Automation Portfolio

## Target Role
Junior QA Engineer / QA Engineer
## What This Project Demonstrates
- Understanding of QA fundamentals and SDLC
- Ability to design and execute manual test cases
- Basic but clean UI automation using POM
- API validation using Rest Assured
- Proper project structure and version control


## Overview
This repository demonstrates my hands-on experience in Quality Assurance,
covering manual testing, UI automation, and API automation.

The goal of this project is to showcase QA fundamentals, test design thinking,
and basic automation skills using industry-standard tools.

## Tech Stack
- **Language:** Java
- **UI Automation:** Selenium WebDriver, TestNG
- **API Automation:** Rest Assured, Postman
- **Build Tool:** Maven
- **Design Pattern:** Page Object Model (POM)
- **Version Control:** Git, GitHub

---

## Manual Testing
Artifacts included:
- Test scenarios
- Detailed test cases
- Sample bug reports with severity and priority

Testing techniques covered:
- Positive and negative testing
- Boundary Value Analysis (BVA)
- Clear bug reporting with reproduction steps

---

## UI Automation
**Tools:** Selenium WebDriver, TestNG, Java  
**Design Pattern:** Page Object Model (POM)

Automated scenarios:
- Login with valid credentials
- Login with invalid credentials
- Validation of success and error messages

---

## API Testing & Automation
**Tools:** Postman, Rest Assured, Java

- Manual API testing using Postman
- Automated API assertions
- Positive and negative API test scenarios
- Status code and response body validation
## How to Run Tests
> Java 17 and Maven are required to run the automation tests

### API Automation
```bash```
cd api-automation
mvn clean test

### UI Automation
cd ui-automation
mvn clean test

## How to Run Tests

> Java 17 and Maven are required to run the automation tests.

### API Automation
```bash
cd api-automation
mvn clean test

### UI Automation
cd ui-automation
mvn clean test
```
---

## Project Structure

qa-automation-portfolio/
│
├── manual-testing/
│ ├── test-scenarios.md
│ ├── test-cases.md
│ └── bug-reports.md
│
├── ui-automation/
│ ├── pom.xml
│ └── src/test/java
│ ├── base
│ ├── pages
│ └── tests
│
├── api-automation/
│ ├── pom.xml
│ └── src/test/java
│ ├── base
│ └── api
│
└── README.md
---

## Notes
This project focuses on test logic, maintainability,
and QA best practices rather than complex frameworks.

---
This repository is intended to demonstrate practical QA skills and readiness
for a Junior QA / QA Engineer role.

