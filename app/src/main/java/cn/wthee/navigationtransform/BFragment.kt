package cn.wthee.navigationtransform

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import cn.wthee.navigationtransform.databinding.FragmentBBinding
import com.google.android.material.transition.MaterialContainerTransform


class BFragment : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = MaterialContainerTransform().apply{
            //过渡持续时间
            duration = 3000L
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBBinding.inflate(inflater, container, false)
        //设置 transitionName，名称与 A 页面的相同
        binding.root.transitionName = "share_element"
        //返回
        binding.back.setOnClickListener {
            findNavController().navigateUp()
        }
        return binding.root
    }


}