<div align="center">

<img src="LanGo web/assets/logo.png" width="72" alt="LanGo Logo" />

# LanGo

### Next-Generation AI Language Learning

*Bridging the gap between static curricula and real-world fluency*

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Platform](https://img.shields.io/badge/Platform-Web%20%7C%20Android-green.svg)]()
[![Status](https://img.shields.io/badge/Status-Active-brightgreen.svg)]()
[![Android](https://img.shields.io/badge/Google%20Play-Available-orange.svg)]()

</div>

---

## Overview

LanGo is a cross-platform intelligent learning ecosystem powered by cutting-edge Generative AI. Unlike traditional language apps built on repetitive, pre-defined curricula, LanGo generates content that evolves dynamically with the learner's proficiency — from complete beginner **(A1)** to near-native speaker **(C2)**.

By leveraging Large Language Models (LLMs), LanGo delivers context-aware storytelling, real-time conversational practice, and personalized vocabulary calibration — all within a single cohesive experience.

---

## Table of Contents

- [Key Features](#-key-features)
- [Architecture & Tech Stack](#%EF%B8%8F-architecture--tech-stack)
- [Project Structure](#-project-structure)
- [Installation & Deployment](#-installation--deployment)
- [UI/UX Philosophy](#-uiux-philosophy)
- [Contributing](#-contributing)
- [License](#-license)

---

## ✨ Key Features

### 🧠 Generative Learning Engines

| Feature | Description |
|---|---|
| **AI Story Mode** | Dynamic narrative generation across user-selected genres — Mystery, Fantasy, History, and more. Stories adapt to vocabulary level and learning goals. |
| **Live Discussion AI** | A pressure-free conversational sandbox powered by NLP, enabling authentic dialogue practice without social anxiety. |

### 📖 Smart Interactive Reader

- **Tokenized Interaction** — Every word and sentence is tappable. Instant translations and full dictionary definitions are a single tap away.
- **Multi-Script Rendering** — Custom rendering engines support complex writing systems including Japanese (Kanji / Kana) and Arabic (RTL layout).

### ⚙️ Personalized Onboarding

A comprehensive **User Journey** setup that calibrates AI difficulty and interest mapping from the very first launch, ensuring relevant content from day one.

---

## 🛠️ Architecture & Tech Stack

### 🌐 Web (SPA)

| Layer | Technology |
|---|---|
| Core | HTML5, JavaScript (ES6+) |
| Styling | Tailwind CSS — Glassmorphic design system |
| Persistence | IndexedDB (client-side data management) |
| Communications | EmailJS (feedback & cloud integration) |

### 🤖 Android (Native)

| Layer | Technology |
|---|---|
| Language | Kotlin (100%) |
| UI Framework | Material Design 3 (Material You) |
| Build System | Gradle with Kotlin DSL + ProGuard optimization |
| Assets | Shared pipeline with the Web module |

---

## 📂 Project Structure

The repository is organized as a **monorepo** for seamless cross-platform synchronization:

```
.
├── LanGo android/              # Native Android Project
│   ├── app/
│   │   ├── src/main/           # Kotlin source files & AndroidManifest
│   │   └── assets/assets/      # Shared visual assets (logo, states, etc.)
│   └── build.gradle.kts        # Build configuration
│
├── LanGo web/                  # Web Application (SPA)
│   ├── assets/                 # Web-optimized static assets
│   └── index.html              # Main application entry point
│
└── README.md
```

---

## 🚀 Installation & Deployment

### Web

```bash
# 1. Clone the repository
git clone https://github.com/your-username/lango.git

# 2. Navigate to the web directory
cd "LanGo web"

# 3. Open index.html in any modern browser
```

> **API Key:** Open `index.html` and locate the `apiKey` constant (around line 992) to insert your credentials before running.

### Android

1. Open the `LanGo android/` directory in **Android Studio**.
2. Run **Gradle Sync** to resolve dependencies.
3. Deploy to a physical device or emulator running **API 26+**.

---

## 🎨 UI/UX Philosophy

LanGo's interface is built around three core principles:

- **Visual Comfort** — A deep "Deep Space" theme (Slate 900) minimizes eye strain during extended study sessions.
- **Responsiveness** — Fluid, adaptive layouts spanning from 6.7" mobile screens to 32" desktop monitors.
- **Micro-interactions** — Subtle CSS and Kotlin animations provide tactile, satisfying feedback throughout the experience.

---

## 🤝 Contributing

Contributions are welcome and appreciated. To get started:

```bash
# 1. Fork the repository

# 2. Create a feature branch
git checkout -b feature/your-feature-name

# 3. Commit your changes
git commit -m "feat: add your feature description"

# 4. Push to your fork
git push origin feature/your-feature-name

# 5. Open a Pull Request
```

Please follow [Conventional Commits](https://www.conventionalcommits.org/) for commit messages where possible.

---

## 📬 Support

| Channel | Link |
|---|---|
| Email | fauxtigergames@gmail.com |
| Google Play | Available on the Play Store |
| Donate | PayPal portal integrated directly in the app |

---

## 📜 License

Distributed under the **GNU General Public License v3.0**.

This license guarantees your freedom to use, share, and modify this software — ensuring it remains free for all users.

→ [Read the full license text](https://www.gnu.org/licenses/gpl-3.0.html)

---

<div align="center">

Copyright © 2026 **FauxTiger**. All rights reserved.

</div>
