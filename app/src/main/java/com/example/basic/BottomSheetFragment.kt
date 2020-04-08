package com.example.basic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet_layout.*

class BottomSheetFragment() : BottomSheetDialogFragment() {

    private var fragmentView: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentView = inflater.inflate(R.layout.bottom_sheet_layout, container, false)
        return fragmentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        inActiveCheckList()
    }

    private fun initView() {
        rl_bottomsheet_faceboock.setOnClickListener {
            inActiveCheckList()
            iv_bottomsheet_check_facebook.visibility = View.VISIBLE
            Toast.makeText(context, "Facebook", Toast.LENGTH_SHORT).show()
        }
        rl_bottomsheet_twitter.setOnClickListener {
            inActiveCheckList()
            iv_bottomsheet_check_twitter.visibility = View.VISIBLE
            Toast.makeText(context, "Twitter", Toast.LENGTH_SHORT).show()
        }
        rl_bottomsheet_instagram.setOnClickListener {
            inActiveCheckList()
            iv_bottomsheet_check_instagram.visibility = View.VISIBLE
            Toast.makeText(context, "Instagram", Toast.LENGTH_SHORT).show()
        }
        rl_bottomsheet_linkedin.setOnClickListener {
            inActiveCheckList()
            iv_bottomsheet_check_linkedin.visibility = View.VISIBLE
            Toast.makeText(context, "Linkedin", Toast.LENGTH_SHORT).show()
        }
        btn_bottomsheet_terminate.setOnClickListener {
            
        }
    }

    private fun inActiveCheckList() {
        iv_bottomsheet_check_facebook.visibility = View.INVISIBLE
        iv_bottomsheet_check_twitter.visibility = View.INVISIBLE
        iv_bottomsheet_check_instagram.visibility = View.INVISIBLE
        iv_bottomsheet_check_linkedin.visibility = View.INVISIBLE
    }
}