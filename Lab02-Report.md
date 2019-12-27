# รายงานผลการทดลอง

<นางสาวศศิธร พิมมะทา> <603410156-1>

## Relative Layout

แสดง Control `title` และ `Detail`

```xml
![alt text](https://github.com/CISClassroom/android-layouts-sasithon2541/blob/master/app/img/Relative.jpg)

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".RelativeActivity">

    <EditText
        android:id="@+id/editText5"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Name" />

    <EditText
        android:id="@+id/editText6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:layout_below="@id/editText5"
        android:text="Name" />

    <Button
        android:id="@+id/button5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/editText6"
        android:text="Button" />
</RelativeLayout>
```

แอดทริบิ้วที่แสดงความสัมพันธ์ระหว่าง control ทั้งสอง

```xml
android:layout_below="@id/editText5" //control ให้อยู่ด้านบน editText6
android:layout_above="@id/editText6" //control ให้อยู่ด้านล่าง editText5
```

## Linear Layout

แสดง Control `to`, `subject`, `tag` และ `message`

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".LinearActivity">

    <EditText
        android:id="@+id/editText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Name"
        tools:layout_editor_absoluteX="16dp"
        tools:layout_editor_absoluteY="27dp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:orientation="horizontal">

        <EditText
            android:id="@+id/editText3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name"
            tools:layout_editor_absoluteX="16dp"
            tools:layout_editor_absoluteY="137dp" />

        <EditText
            android:id="@+id/editText2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name"
            tools:layout_editor_absoluteX="16dp"
            tools:layout_editor_absoluteY="82dp" />
    </LinearLayout>

    <EditText
        android:id="@+id/editText4"
        android:layout_width="match_parent"
        android:layout_height="350dp"
        android:ems="10"
        android:gravity="start|top"
        android:inputType="textMultiLine" />

    <Button
        android:id="@+id/button3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Button"
        tools:layout_editor_absoluteX="16dp"
        tools:layout_editor_absoluteY="202dp" />

</LinearLayout>
```

อธิบายความแตกต่างระหว่าง vertical และ horizontal orientation

```
Linear Layout เป็น Layout ที่เอาไว้จัดเรียง View ภายใน ซึ่งสามารถเรียงกันไปเรื่อยๆ
 - vertical เป็นเส้นตรงจากบนลงล่างเท่านั้น
 - horizontal orientation เป็นเส้นตรงจากซ้ายไปขวาเท่านั้น
```

## Constrant Layout

จงออกแบบและสร้างหน้า Constrant layout สำหรับแสดงข้อมูลนักศึกษา ประกอบไปด้วย รูปโปรไฟล์ รูปพื้นหลัง ชื่อ-นามสกุล รหัสนักศึกษา และเกรดเฉลี่ยรวม

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".ConstrantActivity">


    <ImageView
        android:id="@+id/imageView"
        android:layout_width="500dp"
        android:layout_height="280dp"
        android:layout_weight="1"
        android:scaleType="fitStart"
        app:srcCompat="@drawable/cis" />

    <de.hdodenhof.circleimageview.CircleImageView
        android:id="@+id/profile_image"
        android:layout_width="196dp"
        android:layout_height="241dp"
        android:layout_weight="1"
        android:src="@drawable/pro"
        app:civ_border_color="#FF000000"
        app:civ_border_width="2dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:layout_editor_absoluteX="0dp"
        tools:layout_editor_absoluteY="-141dp">

        <TextView
            android:id="@+id/textView5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="412dp"
            android:layout_weight="1"
            android:gravity="center"
            android:text="Sasithon Pimmatha"
            android:textColor="#090808"
            android:textSize="30sp"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/textView6"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:gravity="center"
            android:text="นางาสวศศิธร พิมมะทา"
            android:textColor="#0A0707"
            android:textSize="14sp" />

        <TextView
            android:id="@+id/textView7"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:gravity="center"
            android:text="รหัสนักศึกษา 603410156-1"
            android:textColor="#090505"
            android:textSize="14sp" />

        <TextView
            android:id="@+id/textView8"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:gravity="center"
            android:text="GPAX : 3.21"
            android:textColor="#070303"
            android:textSize="14sp" />

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
```
