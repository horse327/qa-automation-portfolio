# QA Automation Portfolio

## Target Role

Junior QA Engineer / QA Engineer

## What This Project Demonstrates

* Strong understanding of QA fundamentals and SDLC
* Ability to design and execute manual testing artifacts
* Real-world exploratory testing and defect reporting
* Clean and maintainable UI automation using Page Object Model (POM)
* API testing and automation using Rest Assured
* Professional project structure and version control practices

## Overview

This repository showcases my hands-on experience in Quality Assurance, covering:
* Manual testing (test scenarios, test cases, real bug reports)
* UI automation testing
* API testing and automation

The project is structured to reflect real QA workflows, emphasizing test logic, defect investigation, and maintainability rather than tool complexity.

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

As part of this portfolio, I performed **exploratory and functional testing** on the **OrangeHRM Open Source Demo** application to simulate real-world QA responsibilities.

**Testing Scope:**
* Recruitment module (candidate shortlisting workflow)
* Vacancy-based and role-based behavior validation
* End-to-end flow from UI interaction to backend API response

**Key Defect Identified:**
* Identified a high-impact defect where candidates assigned to **specific vacancies (e.g., Senior QA Lead)** cannot be shortlisted due to a backend **HTTP 500 Internal Server Error**, while the same action succeeds for other vacancies.
* Verified the issue at both **UI and API levels** using browser DevTools (Network and Console).
* Documented clear reproduction steps, business impact, technical evidence, and a **temporary testing workaround**.

**Reference:**  
A detailed bug report with supporting screenshots and technical evidence is available at:  
`manual-testing/bug-report/orangehrm-shortlist-500.md`

**Skills Demonstrated:**
* Exploratory testing on a production-like system
* Professional bug reporting suitable for open-source collaboration
* Backend validation using HTTP status codes and API inspection
* Risk-based and business-impact analysis


---

## Manual Testing

Artifacts included:

* Test scenarios (`manual-testing/test-scenarios.md`)
* Detailed test cases (`manual-testing/test-cases.md`)
* Bug report template demonstrating standard QA documentation
* Real-world bug reports documented from exploratory testing activities

Real defect examples (with evidence and analysis) are available under:

`manual-testing/bug-report/`

Testing techniques covered:

* Positive and negative testing
* Boundary Value Analysis (BVA)
* Exploratory testing
* Clear bug reporting with reproduction steps, impact analysis, and supporting evidence


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
* Automated API tests using Rest Assured
* Validation of HTTP status codes and response bodies
* Positive, negative, and edge-case scenarios

### API Automation Framework Design

* Centralized configuration via base classes
* Clear separation between smoke and regression tests
* Suite execution using TestNG XML

Public API used for testing: [https://reqres.in](https://reqres.in)


### Smoke vs Regression Test Strategy

**Smoke Tests**

* Purpose: Quickly verify core API functionality
* Run frequency: On every build or deployment
* Scope: Stable endpoints and happy paths

**Regression Tests**

* Purpose: Ensure existing functionality remains stable
* Run frequency: Before release or scheduled runs
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
│   ├── bug-reports-template.md
│   └── bug-report/
│       ├── README.md
│       ├── orangehrm-shortlist-500.md
│       └── evidence/
│           └── orangehrm/
│               ├── 01_shortlist_ui_error_toast.png
│               ├── 02_shortlist_ui_success_other_vacancy.png
│               ├── 03_network_500_error_shortlist_request.png
│               ├── 04_network_500_response_headers.png
│               └── 05_console_axios_500_error.png
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
* Professional bug reporting
* UI automation using Selenium and POM
* API automation using Rest Assured
* TestNG framework usage
* Maven project structure
* Git and GitHub workflow

---

## Notes

This repository emphasizes QA thinking, clarity, and maintainability rather than complex frameworks.

The project is intended to demonstrate readiness for a Junior QA Engineer / QA Engineer role with exposure to both manual and automated testing.
