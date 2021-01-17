package app.cryptotweets.utils

const val AUTHORIZATION_KEY = "Authorization"

// FeedRepository
const val TWITTER_API_BASE_URL = "https://api.twitter.com/1.1/"
const val TWITTER_API_PATH_URL = "lists/{listType}"
const val FEED_LIST_TYPE = "statuses.json"
const val FEED_LIST_ID = "1173707664863350785"
const val FEED_LIST_SIZE = "23"

// FeedService
const val LIST_TYPE_PATH = "listType"
const val LIST_ID_QUERY = "list_id"
const val LIST_COUNT_QUERY = "count"
const val LIST_PAGE_NUM_QUERY = "page"

// Tweet
const val TWEET_URL_PATTERN = "%s/%s/%s/%s"
const val TWEET_BASE_URL = "https://twitter.com"
const val TWEET_PATH_STATUS_URL = "status"

// Feed PagedList
const val FEED_PAGEDLIST_SIZE = 18
const val MEDIA_RADIUS_INT = 16F
const val TOP_TWEETS_FAVORITE_THRESHOLD = 10