package com.basya.topuniversities

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.basya.topuniversities.databinding.ActivityDetailBinding
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_ACCREDITATION = "extra_accreditation"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_ADDRESS = "extra_address"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_LOGO = "extra_logo"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imglogo = binding.contentDetail.imgLogo
        val photoLogo = intent.getIntExtra(EXTRA_LOGO, 0)

        Glide.with(this)
            .load(photoLogo)
            .into(imglogo)

        val tvName = binding.contentDetail.tvItemName
        val tvAddress = binding.contentDetail.tvLocation
        val tvAccreditation = binding.contentDetail.tvAccreditation
        val tvDetail = binding.contentDetail.tvItemDetail
        val imgPhoto = binding.contentDetail.imageUniversity

        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val name = intent.getStringExtra(EXTRA_NAME)
        val accreditation = intent.getStringExtra(EXTRA_ACCREDITATION)
        val address = intent.getStringExtra(EXTRA_ADDRESS)

        tvName.text = name
        tvAddress.text = address
        tvAccreditation.text = "Accreditation : $accreditation"
        tvDetail.text = detail

        val imgUniversity = intent.getIntExtra(EXTRA_PHOTO, 0)
        Glide.with(this)
            .load(imgUniversity)
            .into(imgPhoto)

        supportActionBar?.apply {
            title = "$name"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()

    }
}