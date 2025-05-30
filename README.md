# Hold The Pickles Not My Hand

## Description of the Project

Brief Description:
This Java console application is a sandwich shop ordering system designed to help customers and shop employees place, manage, and save sandwich, drink, and chip orders. 
The application simulates a point-of-sale (POS) system that operates entirely through a text-based interface, where users can build customized sandwiches, select drinks and chips, and generate receipts.

Screenshot 2025-05-23 at 4.02.18 PM
![Screenshot 2025-05-23 at 4.02.18 PM.png](../../../../Downloads/Screenshot%202025-05-23%20at%204.02.18%E2%80%AFPM.png)
![Screenshot 2025-05-26 at 4.24.31 PM.png](../../../../Downloads/Screenshot%202025-05-26%20at%204.24.31%E2%80%AFPM.png)
## User Stories

- As a customer, I want to choose a sandwich size (4", 8", or 12") so that my sandwich fits my appetite.
- As a customer, I want to choose a bread type so that I get the texture I like (white, wheat, rye, wrap).
- As a customer, I want to add regular and premium toppings so I can customize my sandwich.
- As a customer, I want to select “extra” for any topping so that I can double up on flavor.
- As a customer, I want to place an order with multiple sandwiches so I can feed myself (or others).
- As a customer, I want a receipt showing what I ordered and how much I paid so that I can review my purchase.
- As a customer, I want to request that my sandwich be toasted so I can get it warm and crispy.

## Setup

## How to Set Up Your Java Console Application in IntelliJ

###  Install IntelliJ IDEA

* If you haven’t already, download and install **IntelliJ IDEA Community Edition** (free) from [JetBrains](https://www.jetbrains.com/idea/download/).

---

# Create a New Project

1. Open IntelliJ IDEA.
2. Click **New Project**.
3. Select **Java** (use the default SDK; if none is available, download one when prompted).
4. Click **Next**.
5. Choose **Create Project from Template** (optional; generally skip unless you want a Hello World example).
6. Name your project (e.g., `SandwichShopApp`) and set a location on your computer.
7. Click **Finish**.

---

# Set Up Your Source Folders

1. In the **Project** view (left sidebar), right-click the `src` folder and choose **New > Package**.
2. Name your package (e.g., `com.sandwichshop`).


 Add Your Classes

1. Right-click your package (e.g., `com.sandwichshop`) and choose **New > Java Class**.
2. Create your classes (e.g., `Main`, `Order`, `Sandwich`, `Drink`, `OrderFileManager`, etc.).
3. Paste your existing code into the appropriate classes.

---

### 5️⃣ Write Your Main Method

Make sure you have a class with a `main` method, like this:

```java

Build and Run the Application

1. Click the **Build Project** hammer icon (or press `Ctrl+F9`).
2. Click the **Run** button (green triangle) next to the `main()` method or use the top Run menu.
3. The console at the bottom will display your program output.

 Optional: Use Git (Version Control)

1. If you want to save your progress and collaborate:

    * Right-click your project root and select **Git > Enable Version Control Integration**.
    * Choose **Git** and click **OK**.
    * Use the **Commit** and **Push** buttons to manage your repository.
    * (Optional) Connect to GitHub via the **GitHub** integration in IntelliJ.


Tips & Troubleshooting

- Make sure your `JAVA_HOME` is set properly in your system. 
- Check that your project SDK matches the Java version you want to use. 
- If you get file errors (e.g., `FileNotFoundException`), check that you have write permissions in your project folder.


### Prerequisites

- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the `public static void main(String[] args)` method.
5. Right-click on the file and select 'Run 'YourMainClassName.main()'' to start the application.

## Technologies Used

- Java: Mention the version you are using.
- Any additional libraries or frameworks used in the project.

## Demo


## Future Work

1. User Authentication & Roles
Add simple login/logout functionality for customers and staff.

Implement role-based access control: staff can manage orders, customers can only place orders.

2. Order History & Tracking
- Store each customer's past orders
- Allow customers to view or reorder previous orders.
- Let staff review and manage all historical orders.
## Resources

## Team Members

-Oumou Diallo

## Thanks

Express gratitude towards those who provided help, guidance, or resources:

- Thank you to Raymon for continuous support and guidance.
- A special thanks to all teammates for their dedication and teamwork.
 