# DSA — Algorithms & Data Structures Examples

[![Build](https://github.com/your-org/your-repo/actions/workflows/maven.yml/badge.svg)](https://github.com/your-org/your-repo/actions/workflows/maven.yml)
[![Spotless Check](https://github.com/your-org/your-repo/actions/workflows/code-format.yml/badge.svg)](https://github.com/your-org/your-repo/actions/workflows/code-format.yml)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](LICENSE)

Summary
-------
DSA is a curated collection of algorithm and data-structure examples implemented in Java. It's intended as a personal reference, interview prep repository, and teaching aid.

Highlights
- Many classic algorithm implementations (arrays, trees, graphs, dynamic programming, greedy, etc.)
- Small runnable examples under `src/main/java`
- Maven-based build and test setup

Project structure
-----------------
- `pom.xml` — Maven build configuration
- `src/main/java` — source code (organized by topic/package)
- `src/test/java` — unit tests (if present)
- `.github/workflows` — CI workflows (build, format, dependency checks)

Requirements
------------
- Java 26 (recommended). If you cannot run Java 26 yet, update the `pom.xml` `java.version` property to match your installed JDK.
- Maven 3.6+
- (Optional) GitHub Actions enabled for CI

Quickstart
----------
1. Clone the repository:
```bash
git clone https://github.com/your-org/your-repo.git
cd your-repo