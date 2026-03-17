# Roshni Hospital Management System


## Project Description
This is a simple Hospital Management System in Java. It uses:

- Abstract classes: `Person`, `Staff`
- Interfaces: `Billable`, `Schedulable`
- Concrete classes: `Patient`, `Doctor`, `Billing`

**Features:**
- Schedule appointments for patients
- Track doctor work
- Generate bills
- Take dynamic input from the user
- Handle input errors safely

## Exceptions Implemented
The program uses **try-catch-finally** to handle errors:

- **Try**: Takes patient and doctor names using `Scanner`
- **Catch**: Prints `Error: Invalid input!` if something goes wrong
- **Finally**: Closes the `Scanner` and prints `Program ended safely`

## How to Run
1. Compile:

2. Run:
3. Enter patient and doctor names when prompted. The program will schedule appointments, show doctor work, generate the bill, and end safely.