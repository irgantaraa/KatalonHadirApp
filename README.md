
# KatalonHadirApp

Automated testing project using Katalon Studio to ensure the functionality and reliability of the Hadir App, an online attendance system. This project includes comprehensive test scripts for various features, such as login, attendance, and leave requests.

## Features Tested
- **Login Functionality**: Validate user authentication.
- **Early Leave Requests (Izin Pulang Cepat)**: Verify request creation, filtering, and report generation.
- **Sick Leave Management**: Ensure correct handling of sick leave submissions and validations.
- **Reports**: Test functionalities for generating and filtering different attendance reports.

## Technologies Used
- **Katalon Studio**: For creating and managing automated test scripts.
- **Selenium**: Integrated with Katalon for web-based testing.
- **Groovy**: Scripting language for test scripts.
- **JUnit/TestNG**: For structured test execution and reporting.

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/irgantaraa/KatalonHadirApp.git
   ```
2. Open the project in Katalon Studio.
3. Configure the test environment:
   - Set up the necessary Test Objects and Variables.
   - Update any login credentials or environment-specific URLs in `GlobalVariable`.

## Execution
1. Open Katalon Studio.
2. Select the test case or test suite to run.
3. Click **Run** to execute the selected test.
4. Review the test report generated under the **Reports** folder.

## Important Test Cases
- **Login Test**: Verifies correct login with valid and invalid credentials.
- **Izin Pulang Cepat**: Testing page functionality.
- **Cuti**: Testing page functionality.
- **Jabatan**: Testing page functionality.

Happy testing! 🚀
