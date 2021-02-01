package com.joblena.presentation.components.signup

import android.app.Activity
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide
import com.github.dhaval2404.imagepicker.ImagePicker
import com.joblena.R
import com.joblena.databinding.FragmentSignupBusinessBinding
import com.joblena.presentation.base.BaseFragment
import com.joblena.presentation.base.BaseViewModel
import com.joblena.presentation.components.auth.AuthViewModel
import kotlinx.android.synthetic.main.fragment_signup_business.*
import java.io.File

class SignUpBusinessFragment : BaseFragment<FragmentSignupBusinessBinding, ViewModel>(R.layout.fragment_signup_business) {
    companion object {
        private const val PROFILE_IMAGE_REQ_CODE = 101
    }

    override val viewModel by viewModels<AuthViewModel>()
    private var mProfileFile: File? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab_add_photo.setOnClickListener {
            ImagePicker.with(this)
                    // Crop Square image
                    .cropSquare()
                    .setImageProviderInterceptor { imageProvider -> // Intercept ImageProvider
                        Log.d("ImagePicker", "Selected ImageProvider: " + imageProvider.name)
                    }
                    .setDismissListener {
                        Log.d("ImagePicker", "Dialog Dismiss")
                    }
                    // Image resolution will be less than 512 x 512
                    .maxResultSize(512, 512)
                    .start(PROFILE_IMAGE_REQ_CODE)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // File object will not be null for RESULT_OK
        if (resultCode == Activity.RESULT_OK) {
            Log.e("TAG", "Path:${ImagePicker.getFilePath(data)}")
            // File object will not be null for RESULT_OK
            val file = ImagePicker.getFile(data)!!
            when (requestCode) {
                PROFILE_IMAGE_REQ_CODE -> {
                    mProfileFile = file
                    Glide.with(requireContext())
                            .load(file)
                            .placeholder(R.mipmap.ic_launcher)
                            .circleCrop()
                            .into(profile_civ_id)
                }
//                GALLERY_IMAGE_REQ_CODE -> {
//                    mGalleryFile = file
//                    imgGallery.setLocalImage(file)
//                }
//                CAMERA_IMAGE_REQ_CODE -> {
//                    mCameraFile = file
//                    imgCamera.setLocalImage(file, false)
//                }
            }
        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(requireContext(), ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(requireContext(), "Task Cancelled", Toast.LENGTH_SHORT).show()
        }

    }

}