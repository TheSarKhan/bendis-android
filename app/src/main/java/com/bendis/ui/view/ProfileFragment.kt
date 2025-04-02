package com.bendis.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.bendis.R
import com.bendis.databinding.FragmentProfileBinding
import com.google.android.material.textfield.TextInputLayout

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val birthdayLayout = view.findViewById<TextInputLayout>(R.id.BirthDateTIL)

        birthdayLayout.endIconDrawable = ContextCompat.getDrawable(requireContext(), R.drawable.arrow)

        val endIconView = birthdayLayout.findViewById<ImageView>(com.google.android.material.R.id.text_input_end_icon)
        endIconView.layoutParams = ViewGroup.LayoutParams(20, 20)

        endIconView.requestLayout()
    }

}