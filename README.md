# View-Binding and Data binding Sample for Practice

## View-Binding

### Introduction

This is simple project that contains the activity class,fragment class which are using the different different way to bind the view using view-binding. More details [Click here](https://developer.android.com/topic/libraries/view-binding)
  
#### Step to enable view-binding into project
enable the viewBinding build option in your build.gradle file in the app module
```
android {
    buildFeatures {
        viewBinding = true
    }
}
```

#### following are practice contains in this example
- How to use view binding in the activity class ([ViewBindingMainActivity.kt](https://github.com/techmohitgarg/data-and-view-binding-practice-sample/blob/master/app/src/main/java/com/mohit/viewbindingsamplepractice/ViewBindingMainActivity.kt))
- How to use view binding in the fragment class using inflate ([ViewBindingInflateFragment.kt](https://github.com/techmohitgarg/data-and-view-binding-practice-sample/blob/master/app/src/main/java/com/mohit/viewbindingsamplepractice/ViewBindingInflateFragment.kt))
- How to use view binding in the fragment class using bind ([ViewBindingBindFragment.kt](https://github.com/techmohitgarg/data-and-view-binding-practice-sample/blob/master/app/src/main/java/com/mohit/viewbindingsamplepractice/ViewBindingBindFragment.kt))


## Data-Binding

#### Step to enable data-binding into project

enable the dataBinding build option in your build.gradle file in the app module

```
android {
    buildFeatures {
        dataBinding true
    }
}
```


License
--------

Copyright 2021 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.