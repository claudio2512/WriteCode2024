package com.example.digitalmenu

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.example.digitalmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NoticeDialogFragment.NoticeDialogListener {

    private lateinit var binding: ActivityMainBinding

    private var totalOrder: Int = 0
    private var summaryOrder: String = "Confirma o Pedido abaixo?\n\n"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {
            calculate()
        }

        /////////////////////////
        //Started 1 - OnClick
        binding.chkStarter1.setOnClickListener() {
            if (binding.chkStarter1.isChecked) {
                updateTotal(
                    40,
                    true,
                    binding.chkStarter1.text.toString(),
                    binding.editStarted1.text.toString()
                )
            } else {
                updateTotal(
                    40,
                    false,
                    binding.chkStarter1.text.toString(),
                    binding.editStarted1.text.toString()
                )
            }
        }
        //Started 2 - OnClick
        binding.chkStarter2.setOnClickListener() {
            if (binding.chkStarter2.isChecked) {
                updateTotal(
                    50,
                    true,
                    binding.chkStarter2.text.toString(),
                    binding.editStarted2.text.toString()
                )
            } else {
                updateTotal(
                    50,
                    false,
                    binding.chkStarter2.text.toString(),
                    binding.editStarted2.text.toString()
                )
            }
        }
        //Started 3 - OnClick
        binding.chkStarter3.setOnClickListener() {
            if (binding.chkStarter3.isChecked) {
                updateTotal(
                    35,
                    true,
                    binding.chkStarter3.text.toString(),
                    binding.editStarted3.text.toString()
                )
            } else {
                updateTotal(
                    35,
                    false,
                    binding.chkStarter3.text.toString(),
                    binding.editStarted3.text.toString()
                )
            }
        }
        //Started 4 - OnClick
        binding.chkStarter4.setOnClickListener() {
            if (binding.chkStarter4.isChecked) {
                updateTotal(
                    45,
                    true,
                    binding.chkStarter4.text.toString(),
                    binding.editStarted4.text.toString()
                )
            } else {
                updateTotal(
                    45,
                    false,
                    binding.chkStarter4.text.toString(),
                    binding.editStarted4.text.toString()
                )
            }
        }
        /////////////////////////
        // MAIN 1 - OnClick
        binding.chkMain1.setOnClickListener() {
            if (binding.chkMain1.isChecked) {
                updateTotal(
                    145,
                    true,
                    binding.chkMain1.text.toString(),
                    binding.editMain1.text.toString()
                )
            } else {
                updateTotal(
                    145,
                    false,
                    binding.chkMain1.text.toString(),
                    binding.editMain1.text.toString()
                )
            }
        }
        // MAIN 2 - OnClick
        binding.chkMain2.setOnClickListener() {
            if (binding.chkMain2.isChecked) {
                updateTotal(
                    85,
                    true,
                    binding.chkMain2.text.toString(),
                    binding.editMain2.text.toString()
                )
            } else {
                updateTotal(
                    85,
                    false,
                    binding.chkMain2.text.toString(),
                    binding.editMain2.text.toString()
                )
            }
        }
        // MAIN 3 - OnClick
        binding.chkMain3.setOnClickListener() {
            if (binding.chkMain3.isChecked) {
                updateTotal(
                    125,
                    true,
                    binding.chkMain3.text.toString(),
                    binding.editMain3.text.toString()
                )
            } else {
                updateTotal(
                    125,
                    false,
                    binding.chkMain3.text.toString(),
                    binding.editMain3.text.toString()
                )
            }
        }
        // MAIN 4 - OnClick
        binding.chkMain4.setOnClickListener() {
            if (binding.chkMain4.isChecked) {
                updateTotal(
                    100,
                    true,
                    binding.chkMain4.text.toString(),
                    binding.editMain4.text.toString()
                )
            } else {
                updateTotal(
                    100,
                    false,
                    binding.chkMain4.text.toString(),
                    binding.editMain4.text.toString()
                )
            }
        }
        /////////////////////
        //BEVERAGE 1 - OnClick
        binding.chkBeverage1.setOnClickListener() {
            if (binding.chkBeverage1.isChecked) {
                updateTotal(
                    10,
                    true,
                    binding.chkBeverage1.text.toString(),
                    binding.editBeverage1.text.toString()
                )
            } else {
                updateTotal(
                    10,
                    false,
                    binding.chkBeverage1.text.toString(),
                    binding.editBeverage1.text.toString()
                )
            }
        }
        //BEVERAGE 2 - OnClick
        binding.chkBeverage2.setOnClickListener() {
            if (binding.chkBeverage2.isChecked) {
                updateTotal(
                    5,
                    true,
                    binding.chkBeverage2.text.toString(),
                    binding.editBeverage2.text.toString())
            } else {
                updateTotal(
                    5,
                    false,
                    binding.chkBeverage2.text.toString(),
                    binding.editBeverage2.text.toString())
            }
        }

        /////////////////////////
        // DESSERT 1 - OnClick
        binding.chkDessert1.setOnClickListener() {
            if (binding.chkDessert1.isChecked) {
                updateTotal(
                    15,
                    true,
                    binding.chkDessert1.text.toString(),
                    binding.editDessert1.text.toString())
            } else {
                updateTotal(
                    15,
                    false,
                    binding.chkDessert1.text.toString(),
                    binding.editDessert1.text.toString())
            }
        }
        // DESSERT 2 - OnClick
        binding.chkDessert2.setOnClickListener() {
            if (binding.chkDessert2.isChecked) {
                updateTotal(
                    25,
                    true,
                    binding.chkDessert2.text.toString(),
                    binding.editDessert2.text.toString())
            } else {
                updateTotal(
                    25,
                    false,
                    binding.chkDessert2.text.toString(),
                    binding.editDessert2.text.toString())
            }
        }
        // DESSERT 3 - OnClick
        binding.chkDessert3.setOnClickListener() {
            if (binding.chkDessert3.isChecked) {
                updateTotal(
                    25,
                    true,
                    binding.chkDessert3.text.toString(),
                    binding.editDessert3.text.toString())
            } else {
                updateTotal(
                    25,
                    false,
                    binding.chkDessert3.text.toString(),
                    binding.editDessert3.text.toString())
            }
        }
        // DESSERT 4 - OnClick
        binding.chkDessert4.setOnClickListener() {
            if (binding.chkDessert4.isChecked) {
                updateTotal(
                    30,
                    true,
                    binding.chkDessert4.text.toString(),
                    binding.editDessert4.text.toString())
            } else {
                updateTotal(
                    30,
                    false,
                    binding.chkDessert4.text.toString(),
                    binding.editDessert4.text.toString())
            }
        }
    }

    override fun onDialogPositiveClick(dialog: DialogFragment) {
        val texto = "Seu pedido foi enviado para o balcão do\n" +
                "restaurante"
        Toast.makeText(
            this, texto , Toast.LENGTH_LONG
        ).show()
        clearAll()
    }

    override fun onDialogNegativeClick(dialog: DialogFragment) {
        // User touched the dialog's negative button
    }

    fun showAlert() {
        val dialog = NoticeDialogFragment()
        dialog.resumeOrder = summaryOrder
        dialog.show(supportFragmentManager, "")
    }

    fun updateTotal(x: Int, op: Boolean, item: String, obs: String) {
        /*
        * x = price
        * op = operation (true = addition / false = subtraction
        * item = item of menu
        * obs = observation of item
        * */

        var textItemOrder: String = "# " + item + " (" + obs + ")" + "\n"

        if (op) {
            totalOrder = totalOrder + x
            summaryOrder = summaryOrder + textItemOrder
        } else {
            totalOrder = totalOrder - x
            summaryOrder = summaryOrder.replace(textItemOrder,"")
        }
        val totalOrderStr = "R$ ${totalOrder.toString()}"
        binding.textTotal.text = totalOrderStr
    }

    fun isVal(view: View): Boolean {
        return (binding.chkMain1.isChecked
                || binding.chkMain2.isChecked
                || binding.chkMain3.isChecked
                || binding.chkMain4.isChecked
                || binding.chkStarter1.isChecked
                || binding.chkStarter2.isChecked
                || binding.chkStarter3.isChecked
                || binding.chkStarter4.isChecked
                || binding.chkBeverage1.isChecked
                || binding.chkBeverage2.isChecked
                || binding.chkDessert1.isChecked
                || binding.chkDessert2.isChecked
                || binding.chkDessert3.isChecked
                || binding.chkDessert4.isChecked)
    }

    fun calculate() {
        if (isVal(binding.root)) {
            showAlert()
        } else {
            Toast.makeText(
                this,
                "Favor selecionar pelo menos um item do cardápio",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    fun clearAll() {
        binding.chkStarter1.isChecked = false
        binding.chkStarter2.isChecked = false
        binding.chkStarter3.isChecked = false
        binding.chkStarter4.isChecked = false
        binding.chkMain1.isChecked = false
        binding.chkMain2.isChecked = false
        binding.chkMain3.isChecked = false
        binding.chkMain4.isChecked = false
        binding.chkBeverage1.isChecked = false
        binding.chkBeverage2.isChecked = false
        binding.chkDessert1.isChecked = false
        binding.chkDessert2.isChecked = false
        binding.chkDessert3.isChecked = false
        binding.chkDessert4.isChecked = false
        binding.editStarted1.setText("")
        binding.editStarted2.setText("")
        binding.editStarted3.setText("")
        binding.editStarted4.setText("")
        binding.editMain1.setText("")
        binding.editMain2.setText("")
        binding.editMain3.setText("")
        binding.editMain4.setText("")
        binding.editBeverage1.setText("")
        binding.editBeverage2.setText("")
        binding.editDessert1.setText("")
        binding.editDessert2.setText("")
        binding.editDessert3.setText("")
        binding.editDessert4.setText("")
        binding.textTotal.setText("R$ 0")
        summaryOrder = ""
        totalOrder = 0
    }

}
