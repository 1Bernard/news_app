# News Application

## Overview
This project is a news application developed using **Jetpack Compose** and follows the **MVVM architecture** to ensure clean code, maintainability, and scalability. It was inspired by a friendly challenge from a colleague, Yesuko, which encouraged a deeper dive into modern Android development practices.

The application offers features such as news search, bookmarking, article sharing, and direct routing to the original media outlets. The project is designed with a focus on providing a seamless and intuitive user experience.

---

## Features

### 1. Search Functionality
- Allows users to search for news articles on various topics.
- Utilizes efficient search algorithms to quickly fetch results.

### 2. Bookmarking
- Users can bookmark articles for later reading.
- Bookmarked articles are stored locally and persist between sessions.

### 3. Sharing
- Seamlessly share news articles via social media, email, or messaging apps.
- Integrated with Android's native sharing capabilities.

### 4. Web Routing
- Direct links to the main media outlet for each article are available.
- Provides a seamless transition from in-app reading to full article viewing.

---

## Technology Stack

- **Kotlin**: The main programming language used.
- **Jetpack Compose**: For building the UI in a modern, declarative style.
- **MVVM Architecture**: Ensures a separation of concerns and enhances code testability.
- **Kotlin Coroutines and Flow**: For managing asynchronous operations and reactive updates.
- **Navigation Component**: For easy routing and navigation between screens.
- **NewsAPI.org**: Used for fetching real-time news articles. See the [API Documentation](https://newsapi.org/docs/endpoints/everything) for details.

---

## Screenshots

<img src="https://github.com/user-attachments/assets/960d0867-3f72-4187-a5ac-1067af0f4d94" alt="Home Page" width="400px">
<img src="https://github.com/user-attachments/assets/cc9d4d17-06e0-4e46-aca4-2ee07b0bb2e9" alt="Settings Page" width="400px">
<img src="https://github.com/user-attachments/assets/9ac6623e-b4e5-4366-a78c-d2c3193d9054" alt="Navigation Drawer" width="400px">
<img src="https://github.com/user-attachments/assets/dfc46cce-fc66-42b5-ad16-875e95e94738" alt="Bookmark View" width="400px">
<img src="https://github.com/user-attachments/assets/94174782-133a-4ba3-a306-81d023044bfb" alt="Routing Page" width="400px">
<img src="https://github.com/user-attachments/assets/1af3411e-6f4c-43a4-9a1e-aa2ce402dcaa" alt="Share Page" width="400px">
<img src="https://github.com/user-attachments/assets/caa72d0d-57a4-41b5-a417-4515978068bc" alt="Search Page" width="400px">
<img src="https://github.com/user-attachments/assets/463d90f8-b7e0-42f9-89af-6182de60277a" alt="Bookmark Page" width="400px">




---

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/1Bernard/news_app.git
   ```
2. **Open the project** in Android Studio.
3. **Build and run** the application using an emulator or a physical device.

---

## Usage

- **Home Screen**: Displays the latest news articles.
- **Search Bar**: Located at the top, enter keywords to search articles.
- **Bookmark Icon**: Tap on an article to bookmark it.
- **Share Button**: Share articles using native Android share intent.
- **Read More**: Tap on a headline to route directly to the original article source.

---

## Code Structure

- **/app**: Contains the core application logic.
- **/ui**: Jetpack Compose UI components.
- **/viewmodel**: ViewModel classes for data handling.
- **/repository**: Data repository classes for API calls and local data.
- **/network**: Network service classes and API interfaces.

---

## Contribution

Feel free to fork this repository and submit pull requests. All contributions are welcome and appreciated. Please follow standard coding practices and document changes appropriately.

---

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for more details.

---

## Contact

If you have any questions or want to collaborate, feel free to reach out:
- **GitHub Repository**: [News App](https://github.com/1Bernard/news_app)
- **LinkedIn**: [Bernard Owusu Ansah](https://www.linkedin.com/in/bernard-owusu-ansah-22a411219/)
- **Email**: bernardansah5@gmail.com

