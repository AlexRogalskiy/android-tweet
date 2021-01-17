package app.cryptotweets.utils

import app.cryptotweets.auth
import app.cryptotweets.feed.network.FeedService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Injection {
    /** Use Dagger dependency injection module singleton in production */
    val feedService = Retrofit.Builder()
        .baseUrl(TWITTER_API_BASE_URL)
        .client(providesOkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(FeedService::class.java)

    private fun providesOkHttpClient() = OkHttpClient()
        .newBuilder()
        .addInterceptor(object : Interceptor {
            override fun intercept(chain: Interceptor.Chain): Response {
                val request = chain.request().newBuilder()
                    .header(AUTHORIZATION_KEY, auth)
                    .build()
                return chain.proceed(request)
            }
        }).build()
}