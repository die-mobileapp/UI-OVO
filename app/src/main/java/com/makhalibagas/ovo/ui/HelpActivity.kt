package com.makhalibagas.ovo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.makhalibagas.ovo.R
import com.makhalibagas.ovo.adapter.HelpAdapter
import com.makhalibagas.ovo.model.Bantuan
import kotlinx.android.synthetic.main.activity_help.*

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)


        rv_help.layoutManager = LinearLayoutManager(this)
        rv_help.adapter = HelpAdapter(listData())
    }


    private fun listData() = listOf(
        Bantuan(R.drawable.info_svg, "Info Umum"),
        Bantuan(R.drawable.account_svg, "Akun dan Pengaturan"),
        Bantuan(R.drawable.premiere_svg, "Upgrade ke Premiere"),
        Bantuan(R.drawable.topup_svg, "Top Up"),
        Bantuan(R.drawable.tf_svg, "Transfer"),
        Bantuan(R.drawable.bill_svg, "Tagihan & Isi Ulang"),
        Bantuan(R.drawable.deals_svg, "Deals"),
        Bantuan(R.drawable.parking_svg, "Parking"),
        Bantuan(R.drawable.info_svg, "OVO Invest"),
        Bantuan(R.drawable.invest_svg, "OVO Paylater"),
        Bantuan(R.drawable.grab_svg, "Grab & Pembayaran"),
        Bantuan(R.drawable.grab_svg, "Fave"),
        Bantuan(R.drawable.grab_svg, "Tokopedia"),
        Bantuan(R.drawable.info_svg, "Lainya")
    )
}