# Java Reboot for Engineers 🚀

> A practical, hands-on project to refresh core Java concepts, explore modern syntax, and implement real-world use cases and design patterns—tailored for experienced software engineers.

---

## 🎯 Purpose

This repository is designed for experienced software engineers who want to:

- Refresh foundational and modern Java knowledge
- Reinforce object-oriented programming and clean code practices
- Implement commonly used **design patterns** in realistic scenarios
- Explore concurrency, collections, and test-driven development (TDD)
- Learn through clear, practical examples under version control

---

## 🧱 Project Structure

```folder
java-reboot-for-engineers/
├── src/
│ ├── fundamentals/ # Java basics: types, OOP, exceptions
│ ├── collections/ # Lists, Maps, Sets, Streams
│ ├── concurrency/ # Threads, Executors, Futures
│ ├── patterns/ # Design patterns in context
│ └── refactoring/ # SOLID, clean code, code smells
├── tests/ # JUnit and Mockito-based tests
├── docs/
│ └── LEARNING.md # Notes, reflections, insights
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🔍 Topics Covered

| Module           | Topics                                                                 |
|------------------|------------------------------------------------------------------------|
| Fundamentals     | Java 17+ syntax, classes, interfaces, exception handling               |
| Collections      | List, Set, Map, Stream API, lambda expressions                         |
| Concurrency      | Threads, ExecutorService, CompletableFuture, synchronization           |
| Design Patterns  | Factory, Strategy, Singleton, Builder, Observer, Adapter, Command      |
| Refactoring      | Clean code, TDD, SOLID principles, modular design                      |

---

## 🧪 Design Patterns Implemented

| Pattern          | Use Case Example                                   |
|------------------|----------------------------------------------------|
| Factory          | Creating objects without exposing instantiation    |
| Strategy         | Swappable behavior logic (e.g., tax rules)         |
| Builder          | Building complex objects with chained config       |
| Singleton        | Single instance for config/services                |
| Observer         | Event-driven updates (e.g., notification system)   |
| Adapter          | Wrapping legacy interfaces                         |
| Command          | Encapsulating actions as objects                   |

---

## 🛠️ Tech Stack

- Java 17+
- Maven or Gradle
- JUnit 5
- Mockito
- Git & GitHub
- IDE: IntelliJ IDEA or VS Code

---

## 📖 How to Run

```bash
# Clone the repo
git clone https://github.com/raulrotundo/java-reboot-for-engineers.git
cd java-reboot-for-engineers

# Build and run tests
./mvnw clean test
```

## 📚 Learning Journal
All learning notes, design considerations, and observations are captured in docs/LEARNING.md. This includes:

- Key takeaways per module
- Code decisions and rationale
- Notes on Java syntax, behavior, and best practices
- Future ideas for extending the project

## 👥 Who This Is For

- Experienced developers revisiting Java
- Engineers transitioning back into backend roles
- Backend developers seeking deeper Java fluency
- Teams onboarding developers into Java-based systems

## 🧠 Guiding Principles
“Write code for humans first, machines second.”
This project focuses on clarity, maintainability, and relevance over clever hacks or algorithmic tricks.

