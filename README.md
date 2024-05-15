# Tip Calculator

## Overview

The Tip Calculator is an Android application built with Kotlin. It helps users calculate the tip amount for a restaurant waiter based on the total bill amount. Users can input a desired tip percentage, and the application will calculate the corresponding tip amount.

## Features

- Calculate tip based on the total bill amount.
- Input custom tip percentage.
- Instant calculation and display of the tip amount.

## Project Objective

The primary objective of this project is to implement Continuous Integration and Continuous Deployment (CI/CD) for the Tip Calculator application. This ensures that the application is continuously tested, built, and deployed, providing a reliable and efficient development workflow.

## CI/CD Pipeline

The CI/CD pipeline for the Tip Calculator project includes six stages, ensuring code quality, reliability, and seamless deployment:

1. **Lint**
  <br>Analyzes the code for potential errors and enforces coding standards to maintain code quality.
  
2. **Unit Test**
  <br>Runs unit tests to verify the functionality of individual components within the application.

3. **Instrumentation Test**
  <br>Executes instrumentation tests to ensure that the app functions correctly in an Android environment.

4. **Static Code Analysis**
  <br>Uses tools to perform static analysis on the codebase, identifying potential issues and ensuring compliance with coding standards.

5. **Package**
  <br>Compiles the application and prepares it for deployment by generating the APK or AAB file.

6. **Release**
  <br>Deploys the packaged application to the designated environment (e.g., Google Play Store, internal testing).

## Getting Started

### Prerequisites

- Android Studio
- Kotlin
- A GitHub account

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/tip-calculator.git
   
3. Open the project in Android Studio.
4. Build the project:
   ```bash
   ./gradlew build

## CI/CD Implementation
The CI/CD process is automated using GitHub Actions. The configuration file, located in `.github/workflows`, defines the steps required to execute each stage of the pipeline.
- **Lint**
<br>Linting is performed using the `ktlint` tool, which checks the Kotlin code for style violations and potential errors.
- **Unit Test**
<br>Unit tests are executed using the `junit` framework, ensuring that each function works as expected.
- **Instrumentation Test**
<br>Instrumentation tests are run on an Android emulator using `AndroidJUnitRunner`, verifying the app's behavior in a real environment.
- **Static Code Analysis**
<br>Static code analysis is conducted using tools like `detekt` and `sonarqube`, which provide detailed reports on code quality and potential issues.
- **Package**
    <br>The application is packaged using Gradle, generating an APK or AAB file ready for deployment.
- **Release**
    <br>The final stage deploys the packaged application to the specified environment. This can be configured to upload the app to the Google Play Store or another distribution platform.
### Contributing
  Contributions are welcome! Please fork this repository and submit a pull request for any improvements or bug fixes.
### License
  This project is licensed under the MIT License - see the [LICENSE](https://github.com/rakibhasan1030/TipCalculator/blob/04d300de0c1e5afba057ed5126f89f5ff1478ecf/LICENSE) file for details.
### Contact
  <br>For any questions or support, please contact rakibhasan1030@gmail.com.










   
