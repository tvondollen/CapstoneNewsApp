package com.thomasvondollen.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.thomasvondollen.newsapp.databinding.ActivityMainBinding
import com.thomasvondollen.newsapp.views.ArticleView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val newsService = NewsService()
        val newsArticles = newsService.createArticleArray()


        Log.i("MyTag",newsArticles[0].title)
        Log.i("MyTag",newsArticles[2].author)


        newsArticles.forEach { currentArticle ->
            val articleView = ArticleView(this)

            //articleView.setArticleInfo(currentArticle)

            articleView.setArticleTitle(currentArticle)
            articleView.setArticleAuthor(currentArticle)

            binding.mainGroup.addView(articleView)
        }


    }

//    private fun iterateArticles(articles: ArrayList<Article>) {
//        //looping through Article objects and assigning contents to TextViews
//        var count = 0
//
//        for(item in binding.mainGroup.children) {
//
//            var contents = ""
//
//            val currentArticle = articles[count]
//
//            if (item is TextView) {
//
//                //adding content, checking if nullables == null
//                if(currentArticle.source.id != null) {
//                    contents += "${currentArticle.source.id}\n"
//                }
//
//                contents += "${currentArticle.source.name}\n"
//
//                if(currentArticle.author != null) {
//                    contents += "${currentArticle.author}\n"
//                }
//
//                contents += "${currentArticle.title}\n" +
//                        "${currentArticle.description}\n" +
//                        "${currentArticle.url}\n"
//
//                if(currentArticle.urlToImage != null) {
//                    contents += "${currentArticle.urlToImage}\n"
//                }
//
//                contents += "${currentArticle.publishedAt}\n"
//
//
//                item.text = contents
//
//            }
//
//            //increment counter
//            count++
//        }
//
//
//    }


}