# WFkotlin
# whistle_feed

Whistle_feed Ads plugin for Flutter Applications. This plugin is able to display Whistle_feed Ads.

## Getting Started

# Note

This plugin depends on other plugins like Provider , http , package_info and url_launcher .
*  Plugin uses provider package (while using this library if you already initialized provider then check it,if you are getting error on provider you can remove your provider or else fine)
   same for http,package_info url_launcher

This Dart package will utilize the plugin, **whistle_feed**, so to quickly and easily implement ads into a Flutter app.

# Sign Up and Get Your Publisher token here
[website link](https://publisher.whistle.mobi/)

Note:- Publisher token is required to serve the ads.


# initialize the plugin of latest version
And so, for this version, add this to your package's pubspec.yaml file instead:
yaml dependencies: whistle_feed: latest version

# Troubleshooting steps if ads are not showing.
1) Check if correct publisher token provided,
2) Passing addslistener as null or object of the class,
3) Minimum pencil size is 1
4) Maximum pencil size is 3

## for example
1 pencil = 1 cube , Maximum cube will be 3
Note :- required fields from developer : publisher token and pencil size (minimum size is 1 and maximum size is 4)

Androidmanifest.xml

##Step 1 :
#Place this permission tags inside manifest tags

               <uses-permission

               android:name="android.permission.INTERNET">

               </uses-permission>
 

#Place this tags in tags inside application tags

    android:usesCleartextTraffic="true
                 

##Step 3 :
 
          #Add the JitPack repository to your build file
 
         #Add it in your root build.gradle at the end of repositories:
 
                   allprojects {
		                   repositories {
		                                        	...
		                      maven { url 'https://jitpack.io' }
		                }
	                      }
                        
                        
 ##Step 4:
 
        #Add the dependency

         dependencies {      
   
             implementation 'com.github.WhistleFeed:WFkotlin:latest_version'
	         }

##Note: 
   #check latest Version By using this link

       [Kotlin_sdk_link]https://jitpack.io/#WhistleFeed/WFkotlin
       
       
       
##Activity.xml 

         #Create an Xml file for the webview ui with id webview

              <com.example.whistlefeed.WhistleFeed
                 android:id="@+id/whistleweb"
                 android:layout_width="match_parent"
                 android:layout_height="wrap_content"
                 app:layout_constraintEnd_toEndOf="parent"
                 app:layout_constraintStart_toStartOf="parent"
                 app:layout_constraintTop_toTopOf="parent">
              </com.example.whistlefeed.WhistleFeed>

                       
##Activity.kt

          #Create a kotlin file attach to the xml UI 


   val webView = findViewById<WhistleFeed>(R.id.whistleweb); // init imageSlider
        webView.setadds(pencilsize = "1", //SIZE PARAMETER TAKES 3 VALUES(3,2,1) and IT DENOTES THE NUMBER OF PENCILS IN THE AD
        publishertoken = "YOUR_PUBLISHER_TOKEN"
       );

##OUTPUT
                 
##ONE ADD FORMAT
![1 cube adds](https://github.com/prakashvalueleaf/whistle_feed/blob/master/screenshots/whistlefeed1pencil.png)

##TWO ADDS FORMAT
![2 cube adds](https://github.com/prakashvalueleaf/whistle_feed/blob/master/screenshots/whistlefeed2pencil.png)

#THREE ADS FORMAT
![3 cube adds](https://github.com/prakashvalueleaf/whistle_feed/blob/master/screenshots/whistlefeed3pencil.png)

# Github repository for reference

[github_repository](https://github.com/WhistleFeed/WFkotlin)
