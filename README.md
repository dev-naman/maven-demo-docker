# 🚀 Maven Demo Docker CI/CD Project

## 📌 Overview

This project demonstrates a simple CI/CD workflow for a Java Maven application using GitHub Actions and Jenkins. The application is containerized using Docker, showcasing modern DevOps practices including automated builds, testing, and containerization.

The goal of this project is to provide a lightweight example of Continuous Integration and Continuous Delivery workflows commonly used in software development environments.

---

## 🛠 Tech Stack

### Application

* Java
* Maven

### CI/CD

* GitHub Actions
* Jenkins

### Containerization

* Docker

---

## 📂 Project Structure

```text
maven-demo-docker/
│
├── src/
│   ├── main/
│   └── test/
│
├── .github/
│   └── workflows/
│       └── ci.yml
│
├── Dockerfile
├── Jenkinsfile
├── pom.xml
└── README.md
```

---

## ⚙ CI/CD Workflow

The project demonstrates automated software delivery using GitHub Actions and Jenkins.

### GitHub Actions Pipeline

Pipeline stages:

1. Checkout Source Code
2. Setup Java Environment
3. Maven Build
4. Unit Testing
5. Docker Image Build

Workflow:

```text
Git Push
    │
    ▼
GitHub Actions
    │
    ▼
Maven Build
    │
    ▼
Unit Tests
    │
    ▼
Docker Build
```

---

## 🔧 Jenkins Pipeline

The included Jenkinsfile demonstrates a basic Jenkins pipeline that performs:

* Source Code Checkout
* Maven Build
* Unit Testing
* Docker Image Build

This showcases how Jenkins can be integrated into a CI/CD workflow for Java applications.

---

## 🔨 Build Locally

### Clone Repository

```bash
git clone https://github.com/dev-naman/maven-demo-docker.git
cd maven-demo-docker
```

### Build Application

```bash
mvn clean package
```

### Run Tests

```bash
mvn test
```

---

## 🐳 Docker Usage

### Build Docker Image

```bash
docker build -t maven-demo-app .
```

### Run Docker Container

```bash
docker run -p 8080:8080 maven-demo-app
```

---

## 🎯 Features

* Maven-based Java Application
* Automated Build Process
* Automated Unit Testing
* Docker Containerization
* GitHub Actions Integration
* Jenkins Pipeline Integration
* CI/CD Workflow Demonstration

---

## 📚 Learning Outcomes

This project helped demonstrate:

* Maven build lifecycle
* Java project structure
* GitHub Actions workflow creation
* Jenkins pipeline implementation
* Docker image creation
* Continuous Integration fundamentals
* CI/CD best practices

---

## 🚀 Future Enhancements

* Docker Image Security Scanning using Trivy
* Dependency Vulnerability Scanning
* SonarQube Code Quality Analysis
* Docker Registry Integration
* Kubernetes Deployment
* AWS ECS Deployment

---

## 👨‍💻 Author

**Naman Jain**

DevOps & Cloud Engineer

### Skills

* AWS
* Terraform
* Docker
* Kubernetes
* Jenkins
* GitHub Actions
* CI/CD
* DevSecOps

GitHub: https://github.com/dev-naman

---

⭐ If you found this project useful, consider giving it a star.
