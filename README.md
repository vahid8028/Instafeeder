# Project 1 - *InstaFeeder*

**InstaFeeder** is an android app that allows a user to check out popular photos from Instagram. The app utilizes Instagram API to display images and basic image information to the user.

Time spent: **13** hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **scroll through current popular photos** from Instagram
* [x] For each photo displayed, user can see the following details:
  * [x] Graphic, Caption, Username
  * [x] Relative timestamp, like count, user profile image

The following **optional** features are implemented:

* [x] User can **pull-to-refresh** popular stream to get the latest popular photos
* [x] Show latest comments for each photo
* [x] Display each photo with the same style and proportions as the real Instagram
* [x] Display each user profile image using a RoundedImageViewDisplay each user profile image using a [RoundedImageView](https://github.com/vinc3m1/RoundedImageView)
* [x] Display a nice default placeholder graphic for each image during loading
* [x] Improved the user interface through styling and coloring

The following **bonus** features are implemented:

* [ ] Show last 2 comments for each photo
* [x] Allow user to view all comments for an image within a separate activity or dialog fragment
* [ ] Allow video posts to be played in full-screen using the VideoView

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!
- Subtle fonts
- Better styled dialog fragment

## Video Walkthrough 

Here's a walkthrough of implemented user stories:

<img src='https://raw.githubusercontent.com/adilansari/instafeeder/master/ScreenGrabs/video_demo.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

Describe any challenges encountered while building the app.
- Styling the dialog fragment title.
- Picking up the right theme (colors/fonts).
- Working with flow text view.

## Open-source libraries used

- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Picasso](http://square.github.io/picasso/) - Image loading and caching library for Android
- [Calligraphy](https://github.com/chrisjenx/Calligraphy) - Using custom fonts in Android
- [Butter Knife](http://jakewharton.github.io/butterknife/) - View Injection library for Android

## License

    Copyright [2016] [Adil Ansari]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
