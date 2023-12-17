plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "ensa.ma.loqui"
    compileSdk = 34

    //Ajouter
    buildFeatures {
        viewBinding = true
    }
    defaultConfig {
        applicationId = "ensa.ma.loqui"
        minSdk = 24
        targetSdk = 33
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    //IMPLEMENTER AUTHENTIFICATION PAR NUMERO (OTP)
    implementation("com.github.mukeshsolanki:android-otpview-pinview:3.1.0")
    //implementation("com.github.mukeshsolanki.android-otpview-pinview:otpview:3.1.0")

    // Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:32.5.0"))

    // Add the dependencies for Firebase products you want to use
    // When using the BoM, don't specify versions in Firebase dependencies
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-auth:22.2.0")
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    implementation("com.google.firebase:firebase-messaging:23.3.1")//notifier les messages



    //Image circle implementation
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    //String to int
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    //Pour les réaction avec des émojis
    implementation ("com.github.pgreze:android-reactions:1.6")

    //POur la zone d'affichae des status
    implementation ("com.github.3llomi:CircularStatusView:V1.0.3")

    //Pour visualiser les status
    implementation ("com.github.OMARIHAMZA:StoryView:1.0.2-alpha")

    //Effet de chargement fluide
    implementation ("com.github.sharish:ShimmerRecyclerView:v1.3")

    //Pour l'animation
    implementation ("com.airbnb.android:lottie:6.2.0")



    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


}