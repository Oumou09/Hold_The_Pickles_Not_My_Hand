Hold The Pickles, Not My Hands

#Description of the Project
This Java console application is a Point-of-Sale (POS) system for a sandwich shop. 
It allows customers (and staff) to build customized sandwich orders, choose drinks and chips, and receive an itemized receipt saved to a file. 
The application aims to streamline the order process, reduce errors in pricing, and simulate a real-world ordering system, making it easy for staff to manage orders and customers to place them.

Intended Users:
Customers placing orders at the shop counter.
Shop staff managing orders, checking receipts, and updating the menu.

Main Functionality:
Build and customize sandwiches (choose bread, size, toppings, extra cheese/meat).
Add drinks and chips to the order.
Calculate itemized prices, including extras, for each order.
Save a receipt with a timestamped filename for record-keeping.
Provide a simple, menu-driven console interface for order management.
Problems Solved:
Reduces manual paperwork and pricing errors.
Improves order accuracy and efficiency.
Provides electronic record-keeping for audit and sales tracking.

## User Stories

- As a customer, I want to choose a sandwich size (4", 8", or 12") so that my sandwich fits my appetite.
- As a customer, I want to choose a bread type so that I get the texture I like (white, wheat, rye, wrap).
- As a customer, I want to add regular and premium toppings so I can customize my sandwich.
- As a customer, I want to select “extra” for any topping so that I can double up on flavor.
- As a customer, I want to place an order with multiple sandwiches so I can feed myself (or others).
- As a customer, I want a receipt showing what I ordered and how much I paid so that I can review my purchase.
- As a customer, I want to request that my sandwich be toasted so I can get it warm and crispy.

Prerequisites
IntelliJ IDEA: Download and install from here.
Java SDK: Make sure Java SDK 11 or higher is installed and configured in IntelliJ.

Running the Application in IntelliJ
Open IntelliJ IDEA.

Click Open and navigate to the directory where you cloned or downloaded the project.
Wait for IntelliJ to index the files and set up the project.
Locate the Main class (it contains the public static void main(String[] args) method).
Right-click the file and select Run 'Main.main()' to start the application.


Technologies Used:
Java 11+: Core application language.
Java Streams API: For processing lists (e.g., calculating totals).
File I/O: For saving receipts and orders.
Scanner: For reading user input.

Most Difficult Piece of Code
Writing the Order Receipt to a New File Each Time

One of the trickiest parts of this project was implementing the logic that writes the receipt for each order into a uniquely named file every time the customer completes their order.
Why It Was Difficult:
The receipt file needed a unique name to prevent overwriting previous receipts.
This required generating a timestamp at the exact moment the receipt is saved.
Managing file creation and handling potential I/O errors gracefully was a challenge.
Ensuring that the file closes properly even if an exception occurs (to avoid file corruption) added complexity.
Initially, mixing file naming logic with order data caused confusion—eventually, it was separated for better maintainability.

Future Work
Additional Features:
Implement user login and roles (customer vs. staff).
Add a loyalty program for returning customers.
Enable order history and repeat orders.
Integrate a simulated payment processing step.
Improvements to Current Functionalities:
Refactor getPrice() methods to remove user input handling and move it to the UI layer.
Add better input validation to prevent invalid selections.
Improve receipt formatting and export options.
Add unit testing to validate core functionality.

Resources:
Potato Sensei: https://chatgpt.com/g/g-681d378b0c90819197b16e49abe384ec-potato-sensei/c/68397e26-7830-8012-a29c-80dad23353b0
Raymond's Github: https://github.com/RayMaroun/yearup-spring-section-10-2025/tree/master
BrightSpace : https://yearup.brightspace.com/d2l/home/9444

## Team Members

-Oumou Diallo -Developer

## 

- A special thanks to Raymon and potato sensei for their continuous support and guidance.
- Another special thanks to all my peer for their dedication and guidance.
 