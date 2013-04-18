Síragon Bookmark for Android
============================

Bookmark of the Web Site.


License
=======

	Síragon Bookmark is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	Síragon Bookmark is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with Síragon Bookmark. If not, see <http://www.gnu.org/licenses/>.

	Original Author: Síragon I&D <desarrollo03@siragon.com.ve>

	Developers: <Please add your email here>
	Contributor: <Please add your email here>
	Translators: <Please add your email here>

	

How make an app like this
=========================

**On Windows**
Get the Android SDK http://developer.android.com/sdk/index.html
Get The Apache Ant™ http://ant.apache.org/bindownload.cgi

```bash
mkdir %ProgramFiles32%/apache/ant
set PATH=PATH;%ProgramFiles32%/android/tools/;%ProgramFiles32%/android/plataform-tools/;%ProgramFiles32%/apache/ant
set JAVA_HOME=%ProgramFiles32%/java/jdk#.#.#_##
android create project --target 1 --name Siragon --path <path> --activity MainActivity --package com.siragon.bookmark
ant debug
adb install -r bin\Siragon-debug.apk
```