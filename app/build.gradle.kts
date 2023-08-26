import dependencies.AppDependencies

plugins {
    kotlin(Config.Plugins.kapt)
    id(Config.Plugins.android)
    id(Config.Plugins.kotlinAndroid)
    id(Config.Plugins.daggerHilt)

}

android {
    namespace = Environments.Release.appId
    compileSdk = Config.Android.androidCompileSdkVersion

    defaultConfig {
        applicationId = Environments.Release.appId
        minSdk = Config.Android.androidMinSdkVersion
        targetSdk = Config.Android.androidTargetSdkVersion
        versionCode = Environments.Release.appVersionCode
        versionName = Environments.Release.appVersionName

        testInstrumentationRunner = Config.testRunner

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementation(AppDependencies.coreKtx)
    implementation(platform(AppDependencies.composeBoom))

    AppDependencies.compose.forEach {
        implementation(it)
    }

    AppDependencies.lifeCycle.forEach {
        implementation(it)
    }

    implementation(AppDependencies.hilt)
    kapt(AppDependencies.kaptHiltCompiler)

    AppDependencies.retrofit.forEach {
        implementation(it)
    }

    AppDependencies.glide.forEach {
        implementation(it)
    }
    annotationProcessor(AppDependencies.glideAnnotation)

    testImplementation(AppDependencies.Test.junit)
    androidTestImplementation(AppDependencies.Test.exTestJunit)
    androidTestImplementation(AppDependencies.Test.espresso)
    androidTestImplementation(platform(AppDependencies.Test.composeBoomTest))
    androidTestImplementation(AppDependencies.Test.composeJunit)
    debugImplementation(AppDependencies.Test.composeUITooling)
    debugImplementation(AppDependencies.Test.composeManifestTest)
}
