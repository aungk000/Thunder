# Thunder
A network monitoring service library :zap:

Description
-----------
This service monitors network state all the time. So it can consume a little bit more memory.

Credit
------
I was using social apps and Google apps that I noticed these apps monitors network always on use.
I was wondering if such a network monitoring service exists but I couldn't find one.
So I wrote one by myself. It may probably have errors because it is my first time writing a library.

Example
-------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Thunder.with(this).listen(NetworkListener);
    }
    
    @Override
    protected void onStart() {
        super.onStart();

        Thunder.with(this).start();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Thunder.with(this).stop();
    }
    
Usage
-----
To use this library in your project, copy the library folder ('thunder') and import it from your project.

In app/build.gradle

```groovy
implementation project(':thunder')
```

minSdkVersion = '23'
    
Screenshot
----------
In this example, I used Snackbar to show that the network is unavailable.
The rest is your idea to do something on onNetworkAvailable and onNetworkUnavailable methods.

![Screenshot](/screenshot/screenshot.jpg)