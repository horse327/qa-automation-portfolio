# QA Automation Portfolio

## Target Role

Junior QA Engineer / QA Engineer

## What This Project Demonstrates

* Understanding of QA fundamentals and SDLC
* Ability to design and execute manual test cases
* Basic but clean UI automation using POM
* API validation using Rest Assured
* Proper project structure and version control

## Overview

This repository demonstrates my hands-on experience in Quality Assurance,
covering manual testing, UI automation, and API automation.

The goal of this project is to showcase QA fundamentals, test design thinking,
and practical testing experience aligned with real-world QA workflows.

## Tech Stack

* **Language:** Java
* **UI Automation:** Selenium WebDriver, TestNG
* **API Automation:** Rest Assured, Postman
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Version Control:** Git, GitHub

---

## Open-Source QA Contribution

### OrangeHRM (Open Source HR Management System)

As part of this portfolio, I performed exploratory and functional testing on the **OrangeHRM Open Source Demo** application to simulate real-world QA responsibilities.

**Scope of Testing:**

* Recruitment module (Candidate shortlisting workflow)
* Vacancy-based behavior validation
* End-to-end flow from UI interaction to backend API response

**Key Defect Reported:**

* Identified a high-impact defect where candidates assigned to specific vacancies (e.g. *Senior QA Lead*) cannot be shortlisted due to a backend **HTTP 500 Internal Server Error**, while the same action succeeds for other vacancies (e.g. *Payroll Administrator*).
* Verified the issue at both UI and API levels using browser DevTools (Network and Console).
* Documented clear reproduction steps, business impact, technical evidence, and a temporary testing workaround.

**Skills Demonstrated:**

* Exploratory testing on a production-like system
* Professional bug reporting suitable for open-source collaboration
* Backend validation using HTTP status codes and API inspection
* Risk-based and business-impact analysis

---

## Manual Testing

Artifacts included:

* Test scenarios
* Detailed test cases
* Sample bug reports with severity and priority

Testing techniques covered:

* Positive and negative testing
* Boundary Value Analysis (BVA)
* Clear bug reporting with reproduction steps

---

## UI Automation

**Tools:** Selenium WebDriver, TestNG, Java
**Design Pattern:** Page Object Model (POM)

Automated scenarios:

* Login with valid credentials
* Login with invalid credentials
* Validation of success and error messages

---

## API Testing & Automation

**Tools:** Postman, Rest Assured, Java

* Manual API testing using Postman
* Automated API assertions
* Positive and negative API test scenarios
* Status code and response body validation

### API Automation Framework Design

The API automation framework is designed using **Rest Assured + TestNG** and follows
real-world QA automation practices.

Key design decisions:

* Centralized configuration via `BaseTest`
* Clear separation between smoke and regression tests
* Support for both positive and negative test scenarios
* Suite-level execution using TestNG XML

Public API used for testing: [https://reqres.in](https://reqres.in)

### Smoke vs Regression Test Strategy

**Smoke Tests**

* Purpose: Quickly verify core API functionality
* Run frequency: On every build or deployment
* Stable endpoints and happy-path scenarios only

**Regression Tests**

* Purpose: Ensure existing functionality remains stable
* Run frequency: Scheduled or before release
* Includes negative scenarios and edge cases

---

## How to Run Tests

Java 17 (or later) and Maven are required.

### API Automation

```bash
cd api-automation
mvn clean test
```

### UI Automation

```bash
cd ui-automation
mvn clean test
```

---

## Project Structure

```text
qa-automation-portfolio/
│
├── manual-testing/
│   ├── test-scenarios.md
│   ├── test-cases.md
│   └── bug-reports.md
│
├── ui-automation/
│   ├── pom.xml
│   └── src/test/java
│       ├── base
│       ├── pages
│       └── tests
│
├── api-automation/
│   ├── pom.xml
│   └── src/test/java
│       ├── base
│       └── api
│
└── README.md
```

---

## Skills Demonstrated

* Test scenario and test case design
* Manual exploratory testing
* UI automation using Selenium and Page Object Model
* API automation using Rest Assured
* TestNG framework usage
* Maven project structure
* Git and GitHub workflow

---

## Notes

This project emphasizes test logic, maintainability, and QA best practices rather than complex frameworks.

The repository is intended to demonstrate practical QA skills and readiness for a Junior QA / QA Engineer role.
