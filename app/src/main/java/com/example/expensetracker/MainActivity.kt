package com.alterpat.budgettracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.
class MainActivity: AppCompatActivity() {
    private lateinit var transactions: ArrayList<Transaction>
    private lateinit var transactionAdapter: TransactionAdapter
    private lateinit var layoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        transactions = arrayListOf(
            Transaction( label: "Weekend budget", amount: 400.00),
            Transaction( label: "Bananas", amount: -4.00),
            Transaction( label: "Gasoline" amount: -40.90),
            Transaction( label: "Breakfast", amount: -9.99),
            Transaction( label: "Water bottles", amount: -4.00),
            Transaction( label: "Suncream", amount: -8.00),
            Transaction( label: "Car Park", amount: -15.00)
        )

        transactionAdapter TransactionAdapter(transactions)
        linearLayoutManager = LinearLayoutManager(context, this) I
                recyclerview.apply { this: RecyclerView!
                    adopter = transactionAdapter
                    RecyclerView.LayoutManager - linearLayoutManager

                }
        updateDashboard()
    }

    private fun updateDashboard

    val totalAmount: Double = transactions.map { it.amount}.sum()
    val budgetAmount: Double = transactions.filter { it.amount>0}.map{it.amount}.sum()
    val expenseAmount: Double = totalAmount - budgetAmount

    balance.text = "$ %.2f".format(totalAmount)
    budget.text = "$ %.2f".format(budgetAmount)
    expense.text = "$ %.2f".format(expenseAmount)

}
}
