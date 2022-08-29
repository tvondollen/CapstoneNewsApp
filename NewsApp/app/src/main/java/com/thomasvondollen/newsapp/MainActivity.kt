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
            "Natasha Rudra",
            "Before the Bell - The Australian Financial Review",
            "Australian shares are expected to drop following the fallout from Jero...",
            "https://www.afr.com/markets/equity-markets/asx-to-open-lower-after-wall-street-takes-fright-from-powell-20220828-p5bdfe",
            "https://static.ffx.io/images/\$zoom_1.2964%2C\$multiply_1%2C\$ratio_1.777778%2C\$width_1059%2C\$x_709%2C\$y_563/t_crop_custom/c_scale%2Cw_800%2Cq_88%2Cf_jpg/t_afr_no_label_no_age_social_wm/b143bbf84f17b6a71b80e1e880804f930272b5c4",
            "2022-08-28T19:31:00Z",
            "In Australia a big week for economic data kicks off with retail sales and building approvals fig..."),
        Article(
            Source(null, "TheStreet"),
            "Luc Olinga",
            "Elon Musk Reveals His Weight-Loss Secret",
            "Tesla CEO has become the world's richest man and one of the most influential people.",
            "https://www.thestreet.com/technology/elon-musk-reveals-his-weight-loss-secret\"",
            "https://www.thestreet.com/.image/t_share/MTg4NzYwNTA0NDYwNjUwMDY0/elon-musk.jpg\"",
            "2022-08-29T00:31:34Z",
            "Elon Musk is involved in at least four companies: Tesla  (TSLA) , the manufac..."),
        Article(
            Source("newsweek", "Newsweek"),
            "Thomas Kika",
            "Road Rage Incident Escalates to Vehicles Exchanging Gunfire",
            "Officers first determined that a shooting had occurred when shell casings...",
            "https://www.newsweek.com/road-rage-incident-escalates-vehicles-exchanging-gunfire-1737643",
            null,
            "2022-08-28T21:33:35Z",
            "An instance of road rage escalated to more alarming violence early Sund..."),
        Article(
            Source(null, "CleanTechnica"),
            "José Pontes",
            "Electric Vehicles = 10% of New Vehicle Sales Globally!",
            "And 14% of new vehicles sold across the world have a plug.",
            "https://cleantechnica.com/2022/08/28/electric-vehicles-10-of-new-vehicle-sales-globally/\"",
            null,
            "2022-08-28T15:52:48Z",
            "Global plugin vehicle registrations were up 61% in July 2022 compared to Jul..."),
        Article(
            Source(null, "Slickdeals.net"),
            "RLY18",
            "Shimoda Explore V2 35 Backpack Starter Kit (Large DSLR V2 Core Unit Modular Camera Insert) \$279.9",
            "For anyone into photography, this is an incredible bag at an incredible pri...",
            "https://slickdeals.net/f/16005820-shimoda-explore-v2-35-backpack-starter-kit-large-dslr-v2-core-unit-modular-camera-insert-279-9\"",
            "https://static.slickdealscdn.com/attachment/1/8/9/7/9/1/4/7/11975830.attach\"",
            "2022-08-28T18:41:11Z",
            "For anyone into photography, this is an incredible bag at an incredible..."),
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

            var contents = ""

            val currentArticle = dummyArticles[count]

            if (item is TextView) {

                //adding content, checking if nullables == null
                if(currentArticle.source.id != null) {
                    contents += "${currentArticle.source.id}\n"
                }

                contents += "${currentArticle.source.name}\n"

                if(currentArticle.author != null) {
                    contents += "${currentArticle.author}\n"
                }

                contents += "${currentArticle.title}\n" +
                        "${currentArticle.description}\n" +
                        "${currentArticle.url}\n"

                if(currentArticle.urlToImage != null) {
                    contents += "${currentArticle.urlToImage}\n"
                }

                contents += "${currentArticle.publishedAt}\n"


                item.text = contents

            }

            //increment counter
            count++
        }
    }
}