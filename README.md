DebugLog
========

Create a simple and more understandable Android logs. 


#Why?

android.util.Log is the most usable library of the Android. But, when we published our application on the market, some important information is clearly forgotten by the developer.
DebugLog is the simple and powerful solution for this case. 

and plus, it provides more understandable DDMS logs.


#Usage

#####traditional android.util.Log usage:
```java
public static final String TAG = "MyApp or MyClass name";

android.util.Log.i(TAG, "my message");
```

Generally, this logs location forgotten after first day:) if the location hasn't been defined in log message.

#####DebugLog usage:
```java
DebugLog.i("my message");
```

no tags, and no any information. Just write your logs.

It shows,
![Screenshot](https://raw2.github.com/MustafaFerhan/MFCalendarView/master/calendarview-half.png)
![Screenshot](https://raw2.github.com/MustafaFerhan/MFCalendarView/master/calendarview-half.png)


#Contributing

Want to contribute? You are welcome!

#Licence
#####The Unlicense
Anyone is free to copy, modify, publish, use, compile, sell, or
distribute this software, either in source code form or as a compiled
binary, for any purpose, commercial or non-commercial, and by any
means.

For more information, please refer to <http://unlicense.org/>
