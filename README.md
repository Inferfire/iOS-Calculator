## iOS-Calculator
#### _An advanced version of a four-function calculator with aesthetic design inspiration from the iOS Calculator created by Apple Inc._

### Purpose
- The calculator can handle typical arithmetic operations such as addition, subtraction, multiplication, and division.
- It can also perform some advanced operations like exponentiation, logarithms, trigonometric functions, factorials, and some constants like π and e.
- Functionality to copy the current value on the display to the clipboard has also been included.
- It can also handle repeated evaluations. For example, if you do 3 + 2 = and then press equals again, it will add 2 to the result again, making it 7.

_Note: "=" button should be used in between operations. This was an intentional design choice._
_Note: Round Buttons are attributed to my work in github.com/CSC207-2023Y-UofT/course-project-sweatsquad-sync/_
_Note: This was a chatGPT-assisted project, using GPT 3.5 for structuring, and help with test suite generation alike./_


### General Specifications:
The calculator displays on a frame labeled "Calculator".
The main display of the calculator is at the top, where results and inputs are shown.
Below the main display are various buttons. Each button represents a number, an operation, or another function like clearing the input.
The buttons have different colors, indicating their functionality groups. For instance, number buttons have a different shade compared to operation buttons.
Some buttons have rounded shapes, especially the four primary arithmetic operations and the equals sign.
Buttons change their appearance when hovered over to provide a more interactive user experience.

### Version of Java and Testing Framework:
- JDK 16, Maven build tool, used JUnit

### Code Smells and Violations of SOLID or CA principles

- Single Responsibility Principle (SRP) Violation: The Calculator class handles GUI creation, business logic, and event handling. These responsibilities should be split among multiple classes.

- Open/Closed Principle Violation: For adding new features (like additional mathematical operations), slight modifications to existing code (e.g., the switch-case statements in doMathN4()) would be needed.

- Liskov Substitution Principle (LSP): No clear violations, as the code doesn't really make use of inheritance where this could be a concern.

- Interface Segregation Principle (ISP): The principle isn't really applicable here because the code doesn't have interfaces forcing any unnecessary implementations.

- Tight Coupling: The GUI and the calculator logic are tightly coupled. Ideally, the calculator logic would be in its own class, and the GUI would simply call methods on that class.
