# CoPermission

android permission util for kotlin coroutines



## usuage

in your activity for single permission 
```kotlin
val isGranted: Boolean = requestPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
```
or a number of permissions
```kotlin
val granted : BooleanArray = requestPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE
                        , Manifest.permission.READ_PHONE_STATE)
```



## license

Apache License Version 2.0
