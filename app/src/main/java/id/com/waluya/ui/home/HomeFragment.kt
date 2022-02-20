package id.com.waluya.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import id.com.waluya.*
import id.com.waluya.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val bind = FragmentHomeBinding.inflate(layoutInflater)
        bind.textView2.setOnClickListener {
            val intent = Intent (this@HomeFragment.requireContext(), konsultasi_dokter::class.java)
            startActivity(intent)
        }
        bind.textView3.setOnClickListener {
            val intent = Intent (this@HomeFragment.requireContext(), layanan_medis::class.java)
            startActivity(intent)
        }
        bind.textView4.setOnClickListener {
            val intent = Intent (this@HomeFragment.requireContext(), darurat::class.java)
            startActivity(intent)
        }
        bind.textView5.setOnClickListener {
            val intent = Intent (this@HomeFragment.requireContext(), covid19::class.java)
            startActivity(intent)
        }
        bind.textView6.setOnClickListener {
            val intent = Intent (this@HomeFragment.requireContext(), reminder::class.java)
            startActivity(intent)
        }
        bind.textView7.setOnClickListener {
            val intent = Intent (this@HomeFragment.requireContext(), apotek::class.java)
            startActivity(intent)
        }
        bind.secondActivityBtn.setOnClickListener {
            val intent = Intent (this@HomeFragment.requireContext(), berita::class.java)
            startActivity(intent)
        }

        return bind.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}