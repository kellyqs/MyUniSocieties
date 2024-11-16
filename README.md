MyUniSocieties App 

Welcome to MyUniSocieties
This app is all about helping students find fun and interesting clubs and societies at college. 
Whether you're into movies, engineering, anime, or meeting friends from around the world and sharing your culture with them, this app is here to make it easy for you to discover and join societies!

Contents:
Explore Societies: See a list of societies and find the one that matches your interests.
Society Details: Get info on each society, like what they do and who to contact.
Join/ Sign-up: Join any society right from the app with a quick and easy form!
Log In and Sign-Up for app: Use your account to sign up and keep track of the societies you join.

Technology Used To Make This Application:
Android Studio: To build and run the app on Android devices.
Firebase: For logging in and saving info about societies and events.
Room Database: So you can still see your societies even if you’re offline!

What You Need:
1.Android Studio (our main tool)
2.A Firebase account to connect to the app
3.Github (for saving versions of the app)

Setting Up Firebase:
Go to Firebase and make a new project.
Add an Android app and put in your app’s package name (like com.example.myunisocieties).
In Firebase, turn on Authentication (Email and Password).
Download the google-services.json file from Firebase and add it to the app folder in this project.

Running the App
First, clone this project:
bash
Copy code
git clone https://github.com/yourusername/MyUniSocieties.git
Open the project in Android Studio.

Click on Sync Now to link everything up with Gradle.
Run the app on a phone or emulator by clicking Run > Run 'app'.

How I Made The Application
I used a folder/package structure to keep things simple and organized. Here’s a breakdown:
Data Folder:
The data folder is responsible for handling everything related to data in the app, like databases and models.
  1.dao: Contains methods for accessing and managing data in the Room database.
  2.database: Contains the setup for the Room database, including the main class to manage it.
  3.entity: Holds data classes that represent the tables in the Room database.
  4.model: Contains classes that represent the app's data, like Society, User, and Event.
  5.repository: Acts as a central place to manage data from different sources and provides easy access to the app.

UI Folder:
The ui folder contains everything related to the app's user interface, organized by sections.
  1.drawer: Contains components for the navigation drawer, which lets users switch between sections.
  2.Navigation: Contains files that manage how users move between different screens in the app.
  3.screens: Contains the different screens or pages of the app, like the home screen or login screen.
  4.theme: Holds settings for the app’s visual style, including colors and fonts.

MainActivity.kt:
MainActivity.kt is the starting point of the app. It sets up the app’s main layout, navigation, and any global settings.
