<div align="center">

<img src="LanGo web/assets/logo.png" width="80" alt="LanGo Logo" />

# LanGo

### Next-Generation AI Language Learning

*Bridging the gap between static curricula and real-world fluency*

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Platform](https://img.shields.io/badge/Platform-Web%20%7C%20Android-green.svg)]()
[![Status](https://img.shields.io/badge/Status-Active-brightgreen.svg)]()
[![Open Source](https://img.shields.io/badge/Open%20Source-%E2%9D%A4-red.svg)]()

<a href="https://play.google.com/store/apps/details?id=com.app.lango">
  <img src="https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png" width="200" alt="Get it on Google Play" />
</a>

</div>

---

## What is LanGo?

LanGo is a **free, open-source** cross-platform language learning ecosystem powered by Generative AI. It was built out of a simple frustration: most language apps are rigid, repetitive, and disconnected from how people actually learn to speak.

LanGo takes a different approach. Instead of locking learners into pre-defined lesson tracks, it uses Large Language Models (LLMs) to generate content that genuinely adapts — in vocabulary, syntax, and cultural context — to each learner's proficiency level, from absolute beginner **(A1)** to near-native speaker **(C2)**.

Available as a **native Android app** and a **web application**, LanGo is designed to be accessible to anyone, anywhere, on any device.

---

## Open Source Philosophy

> *"Good tools should be free — not just in price, but in freedom."*

LanGo is released under the **GNU General Public License v3.0** and that is not an accident. It reflects a core belief: language learning should not be locked behind paywalls, proprietary algorithms, or closed ecosystems.

By open-sourcing LanGo, the goal is to:

- **Empower learners** — give anyone full access to a powerful learning tool, regardless of their financial situation.
- **Empower developers** — let anyone study, fork, improve, and build upon the codebase freely.
- **Build in public** — be transparent about how the AI is prompted, how data is handled client-side, and how decisions are made.
- **Foster a community** — because the best version of this tool will be shaped by the people who actually use it.

If you believe that education technology should serve users rather than extract value from them, this project is for you.

---

## Table of Contents

- [Key Features](#-key-features)
- [Architecture & Tech Stack](#%EF%B8%8F-architecture--tech-stack)
- [Project Structure](#-project-structure)
- [Installation & Deployment](#-installation--deployment)
- [UI/UX Philosophy](#-uiux-philosophy)
- [Contributing](#-contributing)
- [Roadmap](#-roadmap)
- [License](#-license)

---

## ✨ Key Features

### 🧠 Generative Learning Engines

| Feature | Description |
|---|---|
| **AI Story Mode** | Dynamic narratives generated on the fly across genres — Mystery, Fantasy, History, Sci-Fi, and more. Every story is unique, calibrated to your level, and designed to teach naturally through context. |
| **Live Discussion AI** | A pressure-free conversational sandbox. Practice real dialogue, make mistakes, and improve — without the social anxiety of speaking with strangers. |

### 📖 Smart Interactive Reader

- **Tokenized Interaction** — Every word and sentence is tappable. Get instant translations, phonetic readings, or deep-dive dictionary definitions without leaving the page.
- **Multi-Script Rendering** — Custom rendering pipelines support complex writing systems including Japanese (Kanji / Hiragana / Katakana) and Arabic (full RTL layout support).
- **Context-Aware Definitions** — Definitions and translations are generated in context, not pulled from a static dictionary, so the meaning always fits the sentence.

### ⚙️ Personalized Onboarding

A comprehensive **User Journey** setup that maps your current proficiency, native language, target language, and personal interests from the very first launch. The AI uses this profile continuously to keep content relevant and appropriately challenging.

### 📊 Progress Tracking *(coming soon)*

Vocabulary retention curves, session streaks, and skill-breakdown charts to give learners a clear picture of where they are and where they are going.

---

## 🛠️ Architecture & Tech Stack

### 🌐 Web (SPA)

| Layer | Technology |
|---|---|
| Core | HTML5, JavaScript (ES6+) |
| Styling | Tailwind CSS — Glassmorphic design system |
| Persistence | IndexedDB (client-side, no server required) |
| Communications | EmailJS (feedback & cloud integration) |

### 🤖 Android (Native)

| Layer | Technology |
|---|---|
| Language | Kotlin (100%) |
| UI Framework | Material Design 3 (Material You) |
| Build System | Gradle with Kotlin DSL + ProGuard optimization |
| Assets | Shared pipeline with the Web module |

> **Note on privacy:** All user data is stored locally on the device (IndexedDB / Android local storage). LanGo does not run its own backend or collect personal data.

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

### Android — Google Play

The easiest way to get started. Tap the badge below or search **"LanGo"** on the Play Store:

<a href="https://play.google.com/store/apps/details?id=com.app.lango">
  <img src="https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png" width="180" alt="Get it on Google Play" />
</a>

### Android — Build from Source

```bash
# 1. Clone the repository
git clone https://github.com/your-username/lango.git

# 2. Open the LanGo android/ directory in Android Studio

# 3. Run Gradle Sync to resolve all dependencies

# 4. Deploy to a device or emulator running API 26+
```

### Web

```bash
# 1. Clone the repository
git clone https://github.com/your-username/lango.git

# 2. Navigate to the web directory
cd "LanGo web"

# 3. Insert your API key in index.html (around line 992, apiKey constant)

# 4. Open index.html in any modern browser — no build step required
```

> The web app is a pure client-side SPA. There is no server to configure or deploy.

---

## 🎨 UI/UX Philosophy

LanGo's interface is built around three core design principles:

- **Visual Comfort** — A "Deep Space" dark theme (Slate 900 base) reduces eye strain during extended study sessions. Learning is already hard enough — the UI should never be the obstacle.
- **Responsiveness** — Fully fluid layouts that adapt from a 6.7" mobile screen to a 32" desktop monitor with no degradation in experience.
- **Micro-interactions** — Subtle CSS and Kotlin animations provide tactile, satisfying feedback at every interaction point, making the learning loop feel rewarding rather than mechanical.

The Glassmorphic visual system on web was chosen intentionally: it creates a sense of depth and immersion that keeps the learner's focus on the content, not the chrome.

---

## 🤝 Contributing

Contributions of any kind are genuinely welcome — bug reports, feature suggestions, design feedback, translations, or code.

```bash
# 1. Fork the repository on GitHub

# 2. Create a feature branch
git checkout -b feature/your-feature-name

# 3. Commit your changes using Conventional Commits
git commit -m "feat: describe what you added"

# 4. Push to your fork
git push origin feature/your-feature-name

# 5. Open a Pull Request with a clear description of the change
```

Not a developer? You can still contribute by:
- Reporting bugs or UX issues via the **Issues** tab
- Suggesting new language pairs or genres
- Sharing the project with someone who would benefit from it

---

## 🗺️ Roadmap

| Status | Feature |
|---|---|
| ✅ Done | AI Story Mode |
| ✅ Done | Live Discussion AI |
| ✅ Done | Tokenized Interactive Reader |
| ✅ Done | Multi-Script Support (Japanese, Arabic) |
| 🔄 In Progress | Progress tracking & vocabulary retention stats |
| 🔄 In Progress | Offline mode for Android |
| 🗓️ Planned | Spaced Repetition System (SRS) integration |
| 🗓️ Planned | Community-shared story packs |
| 🗓️ Planned | iOS release |

---

## 📬 Support

| Channel | Details |
|---|---|
| 📧 Email | fauxtigergames@gmail.com |
| 🛒 Google Play | [com.app.lango](https://play.google.com/store/apps/details?id=com.app.lango) |
| ☕ Donate | PayPal portal available directly inside the app |

If LanGo has been useful to you and you want to support continued development, even a small contribution goes a long way toward keeping the project alive and free.

---

## 📜 License

Distributed under the **GNU General Public License v3.0**.

This means you are free to use, study, modify, and redistribute this software — as long as any derivative work is released under the same license. LanGo will always be free and open.

→ [Read the full license text](https://www.gnu.org/licenses/gpl-3.0.html)

---

<div align="center">

Made with care by **FauxTiger** · Copyright © 2026

*Free software. Free learning.*

</div>
