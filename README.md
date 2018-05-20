# Thunder
Android network monitoring service library :zap:

Description
-----------
This service monitors network state all the time. So it can consume a little bit more memory.

Credit
------
I was using social apps and Google apps that I noticed these apps monitors network always on use.
I was wondering if such a network monitoring service exists but I couldn't find one.
So I wrote one by myself.

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
    
    @Override
    public void onNetworkAvailable() {
        // TODO: do something when network is availabe such as resuming a download process
    }

    @Override
    public void onNetworkUnavailable() {
        // TODO: do something when network is unavailabe such as pausing a download process
    }
    
Usage
-----
To use this library in your project, copy the library folder ('thunder') and import it from your project.

In app/build.gradle

```groovy
implementation project(':thunder')
```

minSdkVersion = '19'
    
Screenshot
----------
In this example, I used Snackbar to show that the network is unavailable.

![Screenshot](/screenshot/screenshot.jpg)