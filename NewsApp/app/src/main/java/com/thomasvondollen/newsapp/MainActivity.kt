package com.thomasvondollen.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.children
import com.thomasvondollen.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val dummyArticles = arrayListOf(
        Article(
            Source("abc-news", "ABC News"),
            "Author",
            "Title",
            "Description",
            "https://www.abcnews.go.com",
            "https://www.abcnews.go.com/images/image-01",
            "2022-08-03T11:00:00Z",
            "Content"),
        Article(
            Source(null, "ABC News"),
            "Author",
            "Title",
            "Description",
            "https://www.abcnews.go.com",
            "https://www.abcnews.go.com/images/image-01",
            "2022-08-03T11:00:00Z",
            "Content"),
        Article(
            Source("abc-news", "ABC News"),
            "Author",
            "Title",
            "Description",
            "https://www.abcnews.go.com",
            null,
            "2022-08-03T11:00:00Z",
            "Content"),
        Article(
            Source("abc-news", "ABC News"),
            "Author",
            "Title",
            "Description",
            "https://www.abcnews.go.com",
            "https://www.abcnews.go.com/images/image-01",
            "2022-08-03T11:00:00Z",
            null),
        Article(
            Source(null, "ABC News"),
            "Author",
            "Title",
            "Description",
            "https://www.abcnews.go.com",
            "https://www.abcnews.go.com/images/image-01",
            "2022-08-03T11:00:00Z",
            "Content"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //looping through Article objects and assigning contents to TextViews
        var count = 0

        for(item in binding.mainGroup.children) {

            var content = ""

            val currentArticle = dummyArticles[count]

            if (item is TextView) {

                //adding content, checking if nullables == null
                if(currentArticle.source.id != null) {
                    content += "${currentArticle.source.id}\n"
                }

                content += "${currentArticle.source.name}\n" +
                        "${currentArticle.author}\n" +
                        "${currentArticle.title}\n" +
                        "${currentArticle.description}\n" +
                        "${currentArticle.url}\n"

                if(currentArticle.urlToImage != null) {
                    content += "${currentArticle.urlToImage}\n"
                }

                content += "${currentArticle.publishedAt}\n"

                if (currentArticle.content != null) {
                    content += "${currentArticle.content}"
                }

                item.text = content

            }


            count++
        }
    }
}