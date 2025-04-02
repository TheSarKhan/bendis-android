package com.bendis.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bendis.R
import com.bendis.databinding.FragmentPaymentDetailBinding


class PaymentDetailFragment : Fragment() {
    private var _binding: FragmentPaymentDetailBinding? = null
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPaymentDetailBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navigate()
    }

    private fun navigate() {
        binding.backButton.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

        binding.finishTheProcess.setOnClickListener {
            findNavController().navigate(R.id.action_paymentDetailFragment_to_confirmPinFragment)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}