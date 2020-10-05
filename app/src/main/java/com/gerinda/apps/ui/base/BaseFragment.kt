package com.gerinda.apps.ui.base

import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import com.gerinda.apps.R


open class BaseFragment : Fragment() {

    protected open fun getNavOptions(): NavOptions {
        return NavOptions.Builder().apply {
            setEnterAnim(R.anim.enter_from_top)
            setExitAnim(R.anim.exit_to_bottom)
            setPopEnterAnim(R.anim.enter_from_bottom)
            setPopExitAnim(R.anim.exit_to_top)
        }.build()
    }

}