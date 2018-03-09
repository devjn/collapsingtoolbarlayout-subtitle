SubtitleCollapsingToolbarLayout    [![](https://jitpack.io/v/devjn/collapsingtoolbarlayout-subtitle.svg)](https://jitpack.io/#devjn/collapsingtoolbarlayout-subtitle)
===============================
Standard `CollapsingToolbarLayout` with subtitle support.

![demo][demo]

Usage
-----
Treat `SubtitleCollapsingToolbarLayout` just like a regular `CollapsingToolbarLayout`.

```xml
<android.support.design.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.design.widget.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <android.support.design.widget.SubtitleCollapsingToolbarLayout
            android:id="@+id/subtitlecollapsingtoolbarlayout"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:contentScrim="?colorPrimary"
            app:layout_scrollFlags="scroll|exitUntilCollapsed"
            app:subtitle="Papua, Indonesia"
            app:title="Raja Ampat">

            <!-- collapsing toolbar content goes here -->

            <android.support.v7.widget.Toolbar
                android:layout_width="match_parent"
                android:layout_height="?actionBarSize"
                app:layout_collapseMode="pin"/>
        </android.support.design.widget.SubtitleCollapsingToolbarLayout>
    </android.support.design.widget.AppBarLayout>

    <!-- content goes here -->

</android.support.design.widget.CoordinatorLayout>
```

#### Attributes
| Attribute                         | Description                                | Default value/behavior                               |
|-----------------------------------|--------------------------------------------|------------------------------------------------------|
| `subtitle`                        | subtitle text                              | disabled                                             |
| `collapsedSubtitleTextAppearance` | text appearance of subtitle when collapsed | `TextAppearance.AppCompat.Widget.ActionBar.Subtitle` |
| `expandedSubtitleTextAppearance`  | text appearance of subtitle when expanded  | `TextAppearance.AppCompat.Headline`                  |
| `fixMenuPadding`                  | add 16dp padding to title and subtitle     | disabled                                             |

Download
--------
This library follows [Android's support library revisions][support-revisions]. Supported versions are:
 * 27.0.1
 * 26.1.0

```gradle
repositories {
    google()
    jcenter()
}

dependencies {
    compile 'com.hendraanggrian:collapsingtoolbarlayout-subtitle:27.0.1'
}
```

Older versions:
 * 26.1.0

License
-------
    Copyright 2017 Hendra Anggrian

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
[demo]: /art/demo.gif
[support-revisions]: https://developer.android.com/topic/libraries/support-library/revisions.html
