# User Manual

## I. Introduction

This is the user manual of the smart flight check-in kiosk. You can log in as a passenger or an airline staff to operate the system. As a passenger, you have three ways to check in to retrieve your flight booking information, and you can also choose special seating or meal and have an additional payment. As a staff, after logging in the system, you can check the passengers list.

## II. Start

To open the system, find the java file 'src/main/java/group16/smartflightcheckinkiosk/APP.java' and run it.

![APPshoot](User Manual.assets/APPshoot.png)

The output is the login GUI.

<img src="User Manual.assets/Login.png" alt="Login" style="zoom:50%;" />

Press the Passenger button you will enter the passenger login GUI; press the Staff button you will enter the staff login GUI.

## III. Passenger Uer Manual

### 1. Login in

After pressing the Passenger button, here is the passenger login GUI. The first three buttons are for the passenger to login, and if you want to quit this window, just press the 'back' button to go back to the first Login GUI.

We have store the information of passenger in the data.csv 'src/main/resources/group16/smartflightcheckinkiosk/data.csv'

![passenger_login](User Manual.assets/passenger_login.png)

For these three login ways, any invalid input including blank spaces, wrong numbers and characters will cause a warning and you have to reinput until you type in the right number.

<img src="User Manual.assets/warning.png" alt="warning" style="zoom:50%;" />

This is the GUI of the first login way after pressing the "Booking Number" button. The available input are 123456, 123457, 123458, 123459 which you can check in the data.csv. 

<img src="User Manual.assets/booknum_login.png" alt="booknum_login" style="zoom:50%;" />

This is the GUI of the second login way after pressing the "Surname & ID Number" button. The available surname are JACK, ROSE, TOM, MIKE, and the corresponding ID number are 01, 02, 03, 04 which you can check in the data.csv. 

<img src="User Manual.assets/surname_login.png" alt="surname_login" style="zoom:50%;" />

This is the GUI of the third login way after pressing the "ID Document" button. You just press the "OK" button to jump to teh next GUI since the system has already read the "data.csv" automatically.

<img src="User Manual.assets/iddoc_login.png" alt="iddoc_login" style="zoom:50%;" />

### 2. Main manu

After logging in the system successfully, the main menu of the system will be shown and you can see the information of your booked flight. The system also print a sentence in the terminal if you login successfully.

![MainMenu](User Manual.assets/MainMenu.png)

<img src="User Manual.assets/login_message.png" alt="login_message" style="zoom: 67%;" />

Here are four buttons on the top-left corner of the panel. Ats for he first "Login" button, you can use it to go back to the very first login GUI.

<img src="User Manual.assets/quit.png" alt="quit" style="zoom:50%;" />

### 3. Order

In the second block, there are two operations for you to choose special seat or meal.

<img src="User Manual.assets/meal&meal.png" alt="meal&meal" style="zoom:50%;" />

Press the "Meal" button, and you can order food and close the window if you finish. The system will send you a message in the terminal if you order the food successfully.

<img src="User Manual.assets/meal.png" alt="meal" style="zoom:50%;" />

Press the "Seat" button, and you can order seat and close the window if you finish. The system will send you a message in the terminal if you order the seat successfully.

<img src="User Manual.assets/seat.png" alt="seat" style="zoom:50%;" />

### 4. Budget

Press the "Budget" button and check your payment. The available credit card numbers are 666 for JACK, 777 for ROSE, 888 for TOM, 999 for MIKE which you can check in the data.csv. 

<img src="User Manual.assets/budget.png" alt="budget" style="zoom:50%;" />

If your balance is not enough to pay, the system will warn you.

<img src="User Manual.assets/budget_warn.png" alt="budget_warn" style="zoom:50%;" />

If your budget is enough and pay the money successfully, the system will send you a success message and you can just press the "BACK" button to quit.

<img src="User Manual.assets/budget_success.png" alt="budget_success" style="zoom:50%;" />

### 5. Boarding

Press the "Boarding" button to check your boarding information.

This is the boarding-check panel.

<img src="User Manual.assets/Boarding_check.png" alt="Boarding_check" style="zoom:50%;" />

Press the "OK" button in the boarding check panel to the boardingpass loading panel. Here you can print your boarding pass, ticket and luggage tag. 

<img src="User Manual.assets/BoardingpassPrint.png" alt="BoardingpassPrint" style="zoom:50%;" />

Press the "OK" button to print. Here is the boardingpass, ticket and tag.

<img src="User Manual.assets/ticket.png" alt="ticket" style="zoom:50%;" />

<img src="User Manual.assets/boardingpass_ticket.png" alt="boardingpass_ticket" style="zoom:50%;" />

<img src="User Manual.assets/tag.png" alt="tag" style="zoom:50%;" />

### 6. End

Above is all the operations you can do in the passenger part of our flight system.





