# Pizza Order System - JavaFX Project

## Author:
Austin Davis  
Project: `PizzaOrder_AustinDavis`

---

## 📌 Project Overview

This is a simple JavaFX GUI application that allows users to place a pizza order by selecting:
- Size (via ComboBox)
- Toppings (via CheckBoxes)
- A total is calculated based on selections.
- Data can optionally be persisted using a MySQL database (DAO pattern used).

---

## ✅ Technologies Used

- **JavaFX** for GUI (FXML-based layout)
- **MySQL** (via JDBC Connector) for database interactions
- **JUnit 5** for testing
- **IntelliJ IDEA** as IDE

---

## 📚 Learning Journey & Challenges

This project was a **huge learning experience**. I encountered multiple obstacles and tried to debug issues that set me back more than once. Here's an honest reflection:

### ❌ What Went Wrong / Challenges Faced:
- Constant `FXML` loader exceptions due to misconfigured event handlers.
- Confusing structure between resource files and Java packages.
- Issues with `ToggleGroup`, `fx:id`, and missing imports.
- Improper database connection strings and classpath errors.
- Failed attempts to launch the app due to missing module paths or JavaFX jars.
- Misuse of controller bindings and onAction syntax in the FXML file.
- Mismatch between FXML UI references and controller variables.

### 💡 What Helped:
- I used **ChatGPT** to:
  - Understand how `FXML` binding works.
  - Correctly implement the `PizzaOrderController.java`.
  - Write reusable logic in `PizzaOrderDAO.java` for database interaction.
  - Build `DBValidator.java` for handling DB-related issues safely.
  - Write unit tests like `BillCalculatorTest.java` using **JUnit 5**.
  - Understand how to structure resource folders and use JavaFX `SceneBuilder`.

---

## 😫 Struggles & Fixes

This project was a serious challenge, and I went through **multiple failed runs** before everything finally worked. Some major issues included:

- ❌ FXML event handlers not being recognized (`#placeOrder` errors)
- ❌ Folder pathing issues between `src` and `resources`
- ❌ StyleSheet and FXML file not applying correctly
- ❌ JavaFX `LoadException` errors due to missing `fx:id` or onAction handlers
- ❌ Problems with JDBC driver pathing and connection testing

---

## 💡 How I Solved It

To solve these, I used **ChatGPT** as my main assistant and tutor to:

- ✅ Understand how to build a clean `FXML` structure
- ✅ Write `PizzaOrderController.java` and link actions to UI
- ✅ Implement `PizzaOrderDAO` and `DBConnector` to allow for database interaction
- ✅ Validate safe connections through `DBValidator`
- ✅ Write `BillCalculatorTest.java` using **JUnit 5** to test the logic behind price calculations
- ✅ Fix module-path, FXML file references, and CSS integration issues

---

## 🚀 How to Run It

1. Clone or download this repository.
2. Install Java 17+ and JavaFX 20+.
3. Configure your IDE to point to your JavaFX `lib` folder.
4. Open the project in IntelliJ.
5. Run `Main.java` from:  
   `src/com/austin/pizzaorder/main/Main.java`

---

## ✅ Current Features

- JavaFX GUI with FXML layout
- Pizza size and topping selection
- Dynamic price update
- Styled with custom CSS
- Organized into proper MVC layers
- DAO and DB layer (ready for use)
- Unit tested business logic

---

## 💬 Final Thoughts

This project helped me grow as a programmer.  
I faced constant blockers, but pushing through with guidance from ChatGPT and debugging tools in IntelliJ helped me understand how real apps are structured and fixed.  
Proud to say: **It finally works.**

---
