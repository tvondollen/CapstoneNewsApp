package com.thomasvondollen.newsapp.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.thomasvondollen.newsapp.Article
import com.thomasvondollen.newsapp.databinding.ArticleViewBinding

class ArticleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
): LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val binding = ArticleViewBinding.inflate(LayoutInflater.from(context), this)

    fun setArticleTitle(article: Article) {
        binding.titleTextView.text = article.title
    }

    fun setArticleAuthor(article: Article) {
        binding.authorTextView.text = article.author
    }

    fun setArticleInfo(article: Article) {
        binding.titleTextView.text = article.title
        binding.authorTextView.text = article.author
    }

}