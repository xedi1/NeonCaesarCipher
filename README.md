<h1 align="center">💡 NeonCaesarCipher 🔐</h1>

<p align="center">
  A minimal Java CLI app that encrypts & decrypts text using the classic <b>Caesar cipher</b> with a custom shift.<br/>
  <sub>Simple · Educational · Neon-Styled 🔮</sub>
</p>

---

## 🎯 Overview

**NeonCaesarCipher** is a tiny Java console program that:

- 🔁 Takes a text input from the user  
- 🎚 Applies a Caesar cipher with a custom shift `k`  
- 🧩 Shows both the encrypted and decrypted message  

It supports:

- ✅ Uppercase letters: `A–Z`  
- ✅ Lowercase letters: `a–z`  
- ✅ Keeps non‑letter characters unchanged (spaces, punctuation, digits, etc.)

---

## 📦 Features

| Feature                                      | Description                                                                 |
|---------------------------------------------|-----------------------------------------------------------------------------|
| 🔤 Case-sensitive cipher                    | Uppercase and lowercase handled separately                                 |
| 🎚 Custom shift (`k`)                       | You choose how many positions to rotate letters                             |
| 🔁 Bidirectional                            | `encrypt()` and `decrypt()` implemented                                     |
| 🧮 Wrap-around logic                        | Shifts correctly wrap inside A–Z / a–z                                     |
| 💻 CLI-based                                | Runs directly in your terminal / command prompt                             |
| 📚 Simple, educational example              | Great for learning about Caesar ciphers & basic Java input/output          |

---

## 🧠 How It Works (Caesar Cipher)

The Caesar cipher shifts each letter by `k` positions in the alphabet.

For encryption:

- For uppercase letters:

  ```java
  char encryptedCh = (char) (((int) ch - 'A' + Shift) % 26 + 'A');
  ```

- For lowercase letters:

  ```java
  char encryptedCh = (char) (((int) ch - 'a' + Shift) % 26 + 'a');
  ```

For decryption, instead of writing new logic, the code reuses `encrypt()` with a reverse shift:

```java
public String decrypt(String S, int Shift) {
    return encrypt(S, 26 - (Shift % 26));
}
```

So, **decrypt** is just:

\[
\text{decrypt}(S, k) = \text{encrypt}(S, 26 - (k \bmod 26))
\]

---

## 🗂 Project Structure

```text
NeonCaesarCipher/
├─ src/
│  └─ main/
│     └─ main.java    # Main class with encrypt/decrypt logic and CLI
└─ README.md
```

---

## ⚙️ Requirements

- ☕ **Java JDK 8+** (11, 17, etc. also fine)
- 🖥 Any OS that can run Java:
  - Windows
  - macOS
  - Linux

---

## 🚀 Getting Started

### 1️⃣ Clone or Download

```bash
git clone https://github.com/xedi1/NeonCaesarCipher.git
cd NeonCaesarCipher
```

---

### 2️⃣ Source Code (main.java)

Make sure your file path is:

```text
src/main/main.java
```

### 3️⃣ Compile

From the project root:

```bash
cd src
javac main/main.java
```

This will create `main.class` inside `src/main/`.

---

### 4️⃣ Run

From inside `src`:

```bash
java main.main
```

---

## 🧪 Example Usage

### ▶ Sample Run #1

**Input:**

```text
======= Encypt Decode System (Edi)========
Enter String:
HelloWorld
Enter K(Count Movement)
3
```

**Output:**

```text
Encrypt Message:KhoorZruog
Decrypt Message:HelloWorld
```

Explanation:

- `H -> K`, `e -> h`, `l -> o`, etc. shifted by `3` positions.
- Decrypting with the same `k = 3` returns the original text.

---

### ▶ Sample Run #2 (with non-letters)

If you modify input handling to support spaces and run:

**Input:**  
`S = "Hello, World!"`, `k = 5`

**Encrypted:**  
`Mjqqt, Btwqi!`

- Letters are shifted.
- Punctuation and spaces stay the same.

---

## 📚 API / Methods

| Method Signature                      | Description                                         |
|--------------------------------------|-----------------------------------------------------|
| `String encrypt(String S, int Shift)`| Encrypts string `S` by shifting letters by `Shift` |
| `String decrypt(String S, int Shift)`| Decrypts string `S` using inverse shift            |

### 🔐 `encrypt(...)`

- Loops over each character
- Checks:
  - `Character.isUpperCase(ch)` → applies uppercase formula
  - `Character.isLowerCase(ch)` → applies lowercase formula
  - Else → appends character as-is

### 🔓 `decrypt(...)`

- Computes the reverse shift:

  ```java
  26 - (Shift % 26)
  ```

- Calls `encrypt()` with that reverse shift.

---

## ✨ Possible Improvements (Ideas)

You can keep the code as-is, or upgrade it into a more “neon” project:

- 🧵 Support full-line input using `nextLine()` instead of `next()`
- 🎚 Allow negative shifts
- 📁 Read/write from files
- 🌈 Add colored output using ANSI escape codes
- 🔒 Add option to brute-force all 26 shifts (for cracking Caesar cipher)
- 🧪 Add unit tests (e.g., with JUnit)

---

## 🧱 Building a Jar (Optional)

From `src`:

```bash
javac main/main.java
jar cfe NeonCaesarCipher.jar main.main main/*.class
```

Then run:

```bash
java -jar NeonCaesarCipher.jar
```

---

## 🤝 Contributing

Contributions are welcome!

1. 🍴 Fork the repo  
2. 🌿 Create a feature branch  
   ```bash
   git checkout -b feature/my-cool-feature
   ```
3. ✍️ Commit your changes  
   ```bash
   git commit -m "Add awesome feature"
   ```
4. 📤 Push the branch  
   ```bash
   git push origin feature/my-cool-feature
   ```
5. 🔁 Open a Pull Request

---

## 🧾 License

This project is free to use for learning & experimentation.  
license (Apache 2.0) by creating a `Edi`.

---

## 📣 Author

- 💻 Original code by **Edi**  
- 🌐 GitHub: `https://github.com/xedi1`
---

## 💬 Final Notes

NeonCaesarCipher is a neat example of:

- String manipulation in Java  
- Using `Scanner` for console input  
- Implementing a classic cryptographic algorithm  

Perfect for beginners who want a small but complete Java project in their GitHub.
