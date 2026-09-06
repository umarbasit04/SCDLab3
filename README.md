# Lab Task 03 – JUnit Unit Testing

## Description
This repository contains the solution for **Lab Task 03: JUnit Unit Testing** from the
**Software Construction** course (5th Semester, Software Engineering, UET Abbottabad).
The lab introduces unit testing in Java using the JUnit framework, built as a **Maven**
project in NetBeans IDE.

## Objective
To create Java classes, write JUnit unit tests for their methods, and interpret the
results of automated test executions — covering normal cases, boundary cases, and
exceptional/error cases.

## Technologies Used
- Java 17 (or the JDK configured in your `pom.xml` / NetBeans)
- Apache Maven
- NetBeans IDE (Maven project)
- JUnit 5 (Jupiter)
- JaCoCo (code coverage)

## Project Structure
```
LabTask03-JUnitTesting/
├── pom.xml
├── src/
│   ├── main/java/
│   │   ├── labtasks/            # In-lab exercises
│   │   │   ├── TemperatureConverter.java
│   │   │   ├── BankAccount.java
│   │   │   ├── StringUtil.java
│   │   │   ├── TimerUtil.java
│   │   │   └── ShoppingCart.java
│   │   └── homework/            # Homework exercises
│   │       ├── Calculator1.java
│   │       ├── BankAccount.java
│   │       └── StringAnalyzer.java
│   └── test/java/
│       ├── labtasks/
│       │   ├── TemperatureConverterTest.java
│       │   ├── BankAccountTest.java
│       │   ├── StringUtilTest.java
│       │   ├── TimerUtilTest.java
│       │   └── ShoppingCartTest.java
│       └── homework/
│           ├── Calculator1Test.java
│           ├── BankAccountTest.java
│           └── StringAnalyzerTest.java
└── README.md
```

## What Was Implemented
**In-lab tasks (5):**
1. `TemperatureConverter` – Celsius/Fahrenheit/Kelvin conversions, tested for known
   value pairs, boundary values, and a round-trip conversion check.
2. `BankAccount` – deposit/withdraw with balance tracking, tested for valid operations
   and exceptional conditions (overdraft, negative deposit).
3. `StringUtil` – palindrome checker, tested for normal, case-insensitive, negative,
   null, and empty-string inputs.
4. `TimerUtil` – elapsed-seconds calculation, tested for normal case, zero boundary,
   and invalid (end < start) input.
5. `ShoppingCart` – add/remove/clear items, tested with multiple assertions per
   scenario, including removing a non-existent item.

**Homework tasks (3):**
1. **Enhanced Calculator1** – added `power()` and `modulus()` to a basic calculator,
   with JUnit 5 tests using `@BeforeEach`/`@AfterEach` and a JaCoCo code-coverage report.
2. **Account Validation** – a `BankAccount` variant that becomes inactive
   (`isActive() == false`) once its balance drops below 100 after a withdrawal.
3. **String Utility Testing** – `StringAnalyzer` with palindrome, vowel-count, and
   anagram checks, tested with `@DisplayName`-annotated test cases including
   null/empty inputs.

## How to Run the Code
- **In NetBeans:** open the project (File > Open Project, select the folder containing
  `pom.xml`), then right-click the project → **Run**.
- **From the command line:** `mvn compile` (requires Maven installed and on PATH).

## How to Run the Tests
- **In NetBeans:** right-click the project → **Test**, or right-click an individual
  test class → **Test File**.
- **From the command line:** `mvn test`

## How to Generate the Code Coverage Report (Homework 1)
- **From the command line:** `mvn test` (JaCoCo is bound to the `test` phase in
  `pom.xml`) then open `target/site/jacoco/index.html` in a browser.
- **In NetBeans:** right-click the project → **Coverage** → **Collect Coverage**, then
  run the tests again; NetBeans highlights covered/uncovered lines directly in the editor
  and shows a summary in the Coverage panel.

## Testing
JUnit 5 (Jupiter) was used for all test classes. Tests cover:
- Normal/expected-value cases
- Boundary cases (e.g., zero values, empty strings)
- Exceptional/error cases (`assertThrows` for invalid input)

Actual pass/fail results depend on running the tests locally in NetBeans — see the
accompanying PDF report for screenshots of the executed test runs.

## Author
[Muhammad Umar Basit] – [24ABSWE0003]

## Course
Software Construction and Development, 5th Semester Software Engineering,
UET Abbottabad Campus. Instructor: Engr. Rizwan Shah.
