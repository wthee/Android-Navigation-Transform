package cn.wthee.navigationtransform

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import cn.wthee.navigationtransform.databinding.FragmentABinding
import com.google.android.material.transition.Hold


class AFragment : Fragment() {

    private lateinit var binding: FragmentABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        exitTransition = Hold()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentABinding.inflate(inflater, container, false)
        //设置 transitionName
        binding.fabOpen.transitionName = "share_element"
        //设置跳转
        binding.fabOpen.setOnClickListener {
            val extras = FragmentNavigatorExtras(
                binding.fabOpen to binding.fabOpen.transitionName
            )
            //跳转至 B 页面
            findNavController().navigate(
                R.id.action_AFragment_to_BFragment, null, null, extras
            )
        }
        return binding.root
    }


}