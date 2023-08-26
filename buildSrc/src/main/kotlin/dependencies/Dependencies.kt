package dependencies

import Versions

object Dependencies {

    object CoreDep {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    }

    object LifeCycleDep {
        const val lifeCycleRuntime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeVersion}"
        const val viewmodelCompose =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.viewmodelComposeVersion}"
        const val composeLiveData =
            "androidx.compose.runtime:runtime-livedata:${Versions.composeLiveDataVersion}"
    }

    object ComposeDep {
        const val activityCompose =
            "androidx.activity:activity-compose:${Versions.activityComposeVersion}"
        const val composeBoom =
            "androidx.compose:compose-bom:${Versions.composeBomVersion}"
        const val composeUI = "androidx.compose.ui:ui"
        const val composeGraphics = "androidx.compose.ui:ui-graphics"
        const val composeUiPreview = "androidx.compose.ui:ui-tooling-preview"
        const val composeMaterial3 = "androidx.compose.material3:material3"
    }

    object HiltDep {
        const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hiltAndroidVersion}"
        const val hiltAndroidCompiler =
            "com.google.dagger:hilt-android-compiler:${Versions.hiltAndroidCompilerVersion}"
    }

    object RetrofitDep {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
        const val retrofitGsonConverter =
            "com.squareup.retrofit2:converter-gson:${Versions.retrofitGsonConverterVersion}"
        const val loggingInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptorVersion}"
    }

    object GlideDep {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
        const val glideCompose = "com.github.bumptech.glide:compose:${Versions.glideComposeVersion}"
        const val glideCompiler =
            "com.github.bumptech.glide:compiler:${Versions.glideCompilerVersion}"
    }

    object TestDep {
        const val junit = "junit:junit:${Versions.junitVersion}"
        const val exTestJunit = "androidx.test.ext:junit:${Versions.exTestJunitVersion}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
        const val composeBoomTest =
            "androidx.compose:compose-bom:${Versions.composeBoomTestVersion}"
        const val composeJunit = "androidx.compose.ui:ui-test-junit4"
        const val composeUITooling = "androidx.compose.ui:ui-tooling"
        const val composeManifestTest = "androidx.compose.ui:ui-test-manifest"
    }
}
