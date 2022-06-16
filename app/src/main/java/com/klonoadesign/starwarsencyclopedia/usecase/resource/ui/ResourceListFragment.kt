package com.klonoadesign.starwarsencyclopedia.usecase.resource.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.klonoadesign.starwarsencyclopedia.R


class ResourceListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_resource_list, container, false)
    }
}