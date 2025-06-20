# 💰 Expense Tracker App

An Android application to track daily income and expenses with a real-time dashboard, ₹ currency support, and a simple offline setup using Kotlin and Material Design.

---

## ✅ Core Features

### 📋 Budget Management
- **Add Transactions**: Income or expense with amount and description
- **Transaction Type**: Choose between "Income" and "Expense"
- **Dashboard**: View total balance, income, and expense summary
- **₹ Currency Format**: All values use INR symbol for easy understanding

### 📅 Daily Transaction List
- Real-time list view with updated balance
- RecyclerView to show all records clearly
- Clean color-coded entries (green for income, red for expenses)

---

## 📄 Demo Presentation  
👉 [Download PDF](demo/ExpenseTracker-Presentation.pdf)

## 📹 Demo Video  
👉 [Download MP4](demo/ExpenseTracker-Demo.mp4)  

---

## ✅ User Interface
- **Modern Material Design**: Flat UI with smooth colors and spacing
- **Floating Action Button**: Tap to add new transactions
- **White Background with Black Text**: Easy to read
- **Responsive Layout**: Works on all screen sizes

---

## App Flow

- **Splash Screen** → (Optional in future)
- **MainActivity** → Dashboard showing summary and transaction list
- **AddTransactionActivity** → Add income/expense
- **Realtime Update** → Amount reflects instantly in total balance

---

## Technical Details

### Architecture
- **MVVM Pattern**: Clean separation of UI & logic
- **ViewBinding**: Safe and efficient view access

### Components
- Kotlin
- RecyclerView
- Material Design UI
- Manual in-memory data (Room DB for future version)

---

## Demo Mode (Current)
✅ Works Offline  
✅ All data managed locally  
✅ No Firebase required  
✅ Smooth performance on low-end devices  

---

## How to Run

1. Clone the repository  
   `git clone https://github.com/KarakambadiDurgaSai/Expense-Tracker.git`

2. Open in **Android Studio**

3. Sync Gradle files and click **Run**

✅ No extra setup needed — works immediately offline

---

## Testing Checklist

- ✅ Add valid transaction with ₹ symbol
- ✅ Dashboard updates instantly
- ✅ Input validation checks empty fields
- ✅ All transactions appear correctly
- ✅ Layout scales on different screens

---

## 🔮 Future Enhancements

- 📦 Room Database for permanent storage  
- ☁️ Firebase for backup & sync  
- 📊 Charts and Graphs for reports  
- 🌑 Dark Mode  
- 📅 Monthly filters  
- 📤 Export to PDF or Excel  
- 🔒 User login & authentication  

---

## 👨‍💻 Developed by

**K. Durga Sai**  
📧 Email: karakambadidurgasai123@gmail.com  
🔗 GitHub: [KarakambadiDurgaSai](https://github.com/KarakambadiDurgaSai)

---

⭐ *If you found this helpful, please star the repo!*
