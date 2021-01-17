package app.cryptotweets.dependencyInjection

import androidx.paging.ExperimentalPagingApi
import app.cryptotweets.feed.FeedFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UtilsModule::class])
@ExperimentalPagingApi
interface AppComponent {
    fun inject(feedFragment: FeedFragment)
}