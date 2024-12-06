# Backend Repository for 514 Project 5

This repository contains the backend code for **514 Project 5**.

## Related Repositories
- The repository for the frontend is located [here](https://github.com/rothmana123/EnglishTeacher3000).

## Deployed Application
- Test the deployed app at: [tinyurl.com/EnglishTeacher3000](https://tinyurl.com/EnglishTeacher3000)

## Technology Used
- **Java Spring Library**: Backend framework
- **Google Cloud Datastore**: Database for storing data

## Project Structure
The main project files are located in:
Project5Backend/src/main/java/com/example/demo/

javascript
Always show details

Copy code

### Key Classes
- **`Essay.java`**: Represents the data entity class.
- **`DemoApplication.java`**: A testing class for use with Maven Shell.

## How to Run/Deploy

### Prerequisites:
- **Java Development Kit (JDK)** installed (version 11 or higher).
- **Maven** installed and configured.
- Access to a **Google Cloud Datastore** instance with the correct credentials.

### Steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/rothmana123/EnglishTeacher3000Backend.git
   cd EnglishTeacher3000Backend
   
2. **Set Up Environment Variables**:
   - Create an `application.properties` file in the `src/main/resources` directory.
   - Add the following properties:
     ```properties
     spring.datasource.url=your_database_url
     spring.datasource.username=your_database_username
     spring.datasource.password=your_database_password
     spring.cloud.gcp.datastore.project-id=your_google_cloud_project_id
     ```

3. **Build the Application**:
   ```bash
   mvn clean install

4. **Run the Application**:
   ```bash
   mvn spring-boot:run

5. **Access the Backend**:
   - The backend will be available at `http://localhost:8080` (default port). Adjust the port if you've customized it in the `application.properties` file.

6. **Deploy to Google Cloud**:
   - Use a Google Cloud-compatible deployment process (e.g., App Engine or Compute Engine) to host the backend.
   - Ensure that your Google Cloud credentials are correctly set up for deployment.

