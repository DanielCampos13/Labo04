package com.example.labo04

class DetailActivity {
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var phoneTextView: TextView
    private lateinit var shareButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        nameTextView = findViewById(R.id.nameTextView)
        emailTextView = findViewById(R.id.emailTextView)
        phoneTextView = findViewById(R.id.phoneTextView)
        shareButton = findViewById(R.id.shareButton)

        // Obtener los datos enviados desde la actividad anterior
        val name = intent.getStringExtra("name")
        val
}