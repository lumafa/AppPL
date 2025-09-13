plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.apppl" // Asegúrate de que este sea el nombre correcto de tu paquete
    compileSdk = 35 // Mantenemos 34

    defaultConfig {
        applicationId = "com.example.apppl" // Asegúrate de que este sea el nombre correcto de tu paquete
        minSdk = 24 // Mantenemos 24
        targetSdk = 35 // Mantenemos 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    // Core AndroidX KTX
    implementation("androidx.core:core-ktx:1.12.0")
    // AppCompat y Material Design
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    // ConstraintLayout (si lo usas en tus layouts, aunque tu login es LinearLayout)
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    // Activity KTX
    implementation("androidx.activity:activity-ktx:1.8.1")
    implementation(libs.androidx.activity)

    // Pruebas unitarias
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}