# Java Servlet Implementation and Deployment

## Project Overview
This project demonstrates the implementation and deployment of a simple Java Servlet using Apache Tomcat. It includes setting up an environment with IntelliJ IDEA Ultimate, configuring Tomcat, and deploying a basic servlet that responds with an HTML message.

## Technologies Used
- **Java** (Servlets API)
- **Apache Tomcat** (Application Server)
- **Maven** (Project Management & Build Tool)
- **IntelliJ IDEA Ultimate** (IDE for development)

## Setup Instructions

### 1. Install Apache Tomcat
Download and install [Apache Tomcat](https://tomcat.apache.org/download-90.cgi). Keep the default HTTP port **8080**.

### 2. Configure Tomcat in IntelliJ IDEA
1. Open IntelliJ IDEA Ultimate.
2. Go to **Run > Edit Configurations**.
3. Select **Tomcat Server** and set it up with the installed Tomcat version.

### 3. Create a Maven Project
1. Create a new **Maven Project**.
2. Set **Tomcat** as the application server.
3. Assign the default port **8080**.

### 4. Create and Deploy the Servlet
1. Inside `/src/main/`, create a `java` directory.
2. Create a package: `com.trying_servlets`.
3. Create a Java class: `HelloServlet.java`.
4. Implement the following servlet:

```java
package com.trying_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello") // The URL pattern to access the servlet
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Bonjour, <your> <name> </h1>");
        out.println("</body></html>");
    }
}
```

### 5. Run the Project
1. Restart the Tomcat server.
2. Access the servlet at:
   ```
   http://localhost:8080/servlet_jsp_war_exploded/hello
   ```
3. The browser should display: **Bonjour, KAZZI Marvin**.

## Notes
- Ensure your Maven dependencies include `jakarta.servlet-api`.
- Make sure your Tomcat server is properly configured and running.
- If using a different port, update the URL accordingly.

## Author
**Marvin Kazzi**

## License
This project is licensed under the MIT License.

