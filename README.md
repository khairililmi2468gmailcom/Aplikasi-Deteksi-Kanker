# Submission of Cancer Detection Application
Before I explain how this application works and submission checklist, I want to say **thank you** to **Dicoding Indonesia** and **Bangkit Academy** for providing "Belajar Penerapan Machine Learning untuk Android" class and **thank you** to **Dicoding Reviewer** for approving my final submission.
### How the app works
1. Using Starter Project
2. Features of Taking Pictures and Displaying Them
3. Using Machine Learning Models from Dicoding
4. Using Tensorflow Lite to Predict Images
5. Display Prediction Results on the ResultActivity Page
6. Changing the Application Appearance
7. Add Crop and Rotate Features Before Image Processing
8. Storing Prediction History Data Using a Local Database
9. Displays Information Relevant to Cancer from the API
### Prerequisites

Before running this app, you need active or remove comment and to add your API [helth](https://newsapi.org/s/indonesia-health-news-api), in your `Build.gradle(Module ..)` file:

```yaml
//        buildConfigField("String", "NEWS_API_KEY", "\"YOUR_API\"")
//        buildConfigField("String", "NEWS_API_URL", "\"https://newsapi.org/v2/\"")
```

### Submission CheckList
- Menggunakan Starter Project
- Fitur Mengambil Gambar dan Menampilkannya
- Menggunakan Model Machine Learning dari Dicoding
- Menggunakan Tensorflow Lite untuk Memprediksi Gambar
- Menampilkan Hasil Prediksi di Halaman ResultActivity
  
#### Reviewer Rating 
<img src="bangkitstar.png"/><br>
:star: :star: :star: :star: :star:<br>
### Dependencies :
- [Lifecycle & Livedata](https://developer.android.com/jetpack/androidx/releases/lifecycle)
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
- [Retrofit 2](https://square.github.io/retrofit/)    
- [OkHttp 3](https://square.github.io/okhttp/)    
- [Glide](https://github.com/bumptech/glide)    
- [AndroidX](https://mvnrepository.com/artifact/androidx)
- [KotlinX Coroutines](https://developer.android.com/kotlin/coroutines)
- [Circle ImageView](https://github.com/hdodenhof/CircleImageView)
- [Lottie Android](https://github.com/airbnb/lottie-android)
- [RoomDatabase](https://developer.android.com/reference/android/arch/persistence/room/RoomDatabase)
- [DataStore](https://developer.android.com/topic/libraries/architecture/datastore)
- [ViewBinding](https://developer.android.com/topic/libraries/view-binding)
- [UCrop](https://github.com/Yalantis/uCrop)
- [Tensorflow Lite](https://central.sonatype.com/artifact/org.tensorflow/tensorflow-lite-task-vision)
